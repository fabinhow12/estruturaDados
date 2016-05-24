/*d
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author fabio
 */
public class Estrutura<T> implements IMetodosEstrutura<T> {

    private int tamanho = 0;
    private List<List<T>> tabela = new ArrayList<List<T>>();

    public Estrutura() {

        for (int i = 0; i < 26; i++) {
            List<T> lista = new LinkedList<>();
            tabela.add(lista);
        }

    }

    @Override
    public void adiciona(T palavra) {
        if (!this.contem(palavra)) {

            this.verificaCarga();
            int indice = calculaIndiceDaTabela(palavra);
            List<T> lista = this.tabela.get(indice);
            lista.add(palavra);
            this.tamanho++;

        } else {

            System.out.println("Já Existe Essa Palavra");
        }
    }

    @Override
    public void remove(T palavra) {
        if (this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<T> lista = this.tabela.get(indice);
            lista.remove(palavra);
            this.tamanho--;
            this.verificaCarga();
        } else {
            System.out.println("Não Existe essa Pessoa armazenada");
        }
    }

    @Override
    public boolean contem(T palavra) {
        int indice = this.calculaIndiceDaTabela(palavra);

        List<T> lista = this.tabela.get(indice);
        
        return lista.contains(palavra);
    }

    @Override
    public List<T> pegaTodas() {
        List<T> palavras = new LinkedList<>();

        for (int i = 0; i < this.tabela.size(); i++) {
            palavras.addAll(this.tabela.get(i));
        }

        return palavras;
    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }

    //Métodos Privados
    
    
    private int calculaIndiceDaTabela(T palavra) {
        int codigoDeEspalhamento = palavra.hashCode();
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % this.tabela.size();
    }

    private void redimensionaTabela(int capacidade) {
        List<T> palavras = this.pegaTodas();

        this.tabela.clear();

        for (int i = 0; i < capacidade; i++) {
            this.tabela.add(new LinkedList<T>());
        }

        palavras.stream().forEach((palavra) -> {
            this.adiciona(palavra);
        });

    }

    //Verifica se existe muitos espaços vazios ou não
    private void verificaCarga() {

        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;

        if (carga > 0.75) {
            this.redimensionaTabela(capacidade * 2);
        } else if (carga < 0.25) {
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }

    }

    //Método Para Teste de como foi distribuido os valores
    @Override
    public void imprimiTable() {
        System.out.println("[");
        tabela.stream().forEach((lista) -> {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        });
        System.out.println("]");
    }

}
