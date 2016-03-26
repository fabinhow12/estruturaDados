/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

/**
 *
 * @author fabio
 */
public class RepositorioCliente implements IMetodosRepositorio {

    private int totalDeElementos;
    private Celula primeira;
    private Celula ultima;
    
    @Override
    public void adiciona(Object elemento) {
        
        if (this.totalDeElementos == 0){
            this.adicionaComeco(elemento);
        }else {
            Celula nova = new Celula(elemento);
            this.ultima.setProximo(nova);
            nova.setAnterior(ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    @Override
    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0){
            this.adicionaComeco(elemento);
        }else if (posicao == this.totalDeElementos){
            this.adiciona(elemento);
        }else{
            Celula anterior = this.pegaCelula(posicao -1);
            Celula proxima = anterior.getProximo();
            Celula nova = new Celula(anterior.getProximo(), elemento);
            
            nova.setAnterior(anterior);
            anterior.setProximo(nova);
            proxima.setAnterior(nova);
            
            this.totalDeElementos++;
       
        }
    }

    @Override
    public void adicionaComeco(Object elemento) {
        if (this.totalDeElementos == 0){
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
            this.totalDeElementos++;
        }else{
            Celula nova = new Celula(this.primeira, elemento);
            nova.setProximo(primeira);
            primeira.setAnterior(nova);
            this.primeira = nova;
            this.totalDeElementos++;
        }
    }

    @Override
    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    @Override
    public boolean contem(Object o) {
        Celula atual = this.primeira;
        
        while (atual != null){
            if (atual.getElemento().equals(o)){
                return true;
            }
            
            atual = atual.getProximo();
        }
        
        return false;
    }

    @Override
    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        
        if (posicao == 0){
            this.removeComeco();
            
        }else if (posicao == this.totalDeElementos -1){
            this.removeFim();
            
        }else{
            Celula anterior = this.pegaCelula(posicao -1);
            Celula atual = anterior.getProximo();
            Celula proxima = atual.getProximo();
            
            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
            
            this.totalDeElementos--;
        }
    }

    @Override
    public void removeComeco() {
        if (!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        this.primeira = primeira.getProximo();
        this.totalDeElementos--;
        
        if (this.totalDeElementos == 0){
            this.ultima = null;
        }   
    }

    @Override
    public void removeFim() {
        if (!this.posicaoOcupada(this.totalDeElementos -1)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        
        if (this.totalDeElementos == 1){
            this.removeComeco();
        }else{
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.totalDeElementos--;
        }
        
    }
    
    @Override
    public int tamanhoLista() {
        return this.totalDeElementos;
    }

    @Override
    public String toString() {
        // Verificando se a Lista está vazia
        if(this.totalDeElementos == 0){
            return "[]";
        }
        
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        
        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();
        }

        // último elemento
        builder.append(atual.getElemento());
        builder.append("]");
        
        return builder.toString();
    }
    
    //Métodos Privados
    
     private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
    
    
    private Celula pegaCelula(int posicao) {
        
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição não existe");
        }
        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
            // break <- ponto de otimizacao
        }
        
        return atual;   
    }

    
}//Fim da Classe
