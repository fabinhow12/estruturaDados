/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaDados;

/**
 *
 * @author fabio
 */
public class Vetor implements IEstruturaDados{
    
    private Aluno[] alunos = new Aluno[100000];
    private int totalAlunos = 0;
    
    
    @Override
    public void adicionaAluno(Aluno aluno) {
        geraEspaco();
        this.alunos[this.totalAlunos] = aluno;
        this.totalAlunos++;
    }

    @Override
    public void adicionaAluno(int posicao, Aluno aluno) {
        geraEspaco();
        if(!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }
        
        for (int i = totalAlunos-1; i >= posicao; i-=1) {
            this.alunos[i + 1] = this.alunos[i];
        }
        
        this.alunos[posicao] = aluno;
        this.totalAlunos++;
    }

    @Override
    public Aluno pegaAluno(int posicao) {

        if(!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida!");            
        }
        
        return alunos[posicao];        
    }

    @Override
    public void remove(int posicao) {
        
        
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.totalAlunos--;
        
    }

    @Override
    public boolean contem(Aluno aluno) {
        boolean contemAluno = false;
        
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null && alunos[i].equals(aluno)) {
                contemAluno = true;
                break;
            }
        }
        
        return contemAluno;
    }

    @Override
    public int tamanho() {
        return this.totalAlunos;
    }

    @Override
    public String listaTodos() {
        return toString();
    }

    @Override
    public String toString() {
        
        if (this.totalAlunos == 0) {
            return "[]";
        }
        
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        
        for (int i = 0; i < totalAlunos -1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalAlunos -1]);
        builder.append("]");
        
        return builder.toString(); 
    }
    
    
    
    
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalAlunos;
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.alunos.length;
    }
    
    private void geraEspaco(){
        if (this.totalAlunos == alunos.length ){
            Aluno[] novoArray = new Aluno[this.alunos.length * 2];
            
            for (int i = 0; i < this.alunos.length; i++) {
                novoArray[i] = this.alunos[i];
               
            }
            this.alunos = novoArray;
        }
    }
}
