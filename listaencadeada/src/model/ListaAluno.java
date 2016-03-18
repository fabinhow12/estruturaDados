/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fabio
 */
public class ListaAluno {

    int quantidade;
    Aluno primeiro, ultimo;

    public ListaAluno() {
        this.quantidade = 0;
        this.primeiro = null;
        this.ultimo = null;
    }

    public void addComeco(String nome) {
        if (this.quantidade == 0) {
            Aluno novo = new Aluno();
            novo.setNome(nome);
            novo.setProximo(primeiro);
            this.primeiro = novo;

        } else {
            Aluno novo2 = new Aluno();
            novo2.setNome(nome);
            novo2.setProximo(primeiro);
            primeiro = novo2;

        }

        this.quantidade++;
    }

    public void addPosicaoQualquer(int posicao, String nome) {
        Aluno novo = new Aluno();
        novo.setNome(nome);

        if (posicao < 0 || posicao > this.quantidade) {
            throw new IllegalArgumentException("Posição Inválida");
        } else {
            if (posicao == this.quantidade) {
                this.addFim(nome);
            } else {
                if (posicao == 0) {
                    this.addComeco(nome);
                } else {
                    Aluno aux = primeiro;
                    for (int i = 0; i < posicao - 1; i++) {
                        aux = aux.getProximo();
                    }
                    novo.setProximo(aux.getProximo());
                    aux.setProximo(novo);
                    aux = novo;
                }
            }
        }
        this.quantidade++;
    }

    public void addFim(String nome) {
        Aluno novo = new Aluno();
        novo.setNome(nome);

        if (this.quantidade == 0) {
            novo.setProximo(ultimo);
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
        }

        this.quantidade++;
    }

    public void removeComeco() {
        if (this.quantidade == 0) {
            System.out.println("Não Possui Elementos na lista");
            
        }else{
            primeiro = primeiro.getProximo();
           
            this.quantidade--;
        }

    }
    
    public void removeFim(){
        if (this.quantidade == 0){
            System.out.println("Não Possui elementos na lista");
        }else{
            Aluno aux = this.primeiro;
            while (aux.getProximo()!=null){
                 aux = aux.getProximo();
            }
                aux.setProximo(null);
                this.quantidade--;
        }
    }

    public void pesquisa(String nome) {
        Aluno aux = this.primeiro;

        if (this.quantidade != 0) {

            while (aux != null) {
                if (aux.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("\nEncontrado " + nome);
                    break;
                }
                aux.getProximo();

            }

        } else {
            System.out.println("NÃO POSSUI ELEMENTOS NA LISTA");
        }
    }

    public void listaTodos() {
        if (this.quantidade == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            Aluno aux = this.primeiro;
            for (int i = 0; i < this.quantidade - 1; i++) {
                System.out.print(aux.getNome() + ", ");
                aux = aux.getProximo();
            }
            System.out.print(aux.getNome() + "]");
        }
    }

    public static void main(String[] args) {
        ListaAluno lista = new ListaAluno();

        for (int i = 0; i < 50; i++) {
            lista.addFim("Aluno" + i);

        }

        
        lista.pesquisa("aluno0");
        lista.listaTodos();
        
        lista.removeComeco();
        System.out.println("");
        lista.listaTodos();

    }

}
