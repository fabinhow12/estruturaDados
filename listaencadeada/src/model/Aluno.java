package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio
 */
public class Aluno {
    private String nome;
    private Aluno proximo;

    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getProximo() {
        return proximo;
    }

    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
    }
    
    
}
