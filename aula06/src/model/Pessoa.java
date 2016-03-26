/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alunofavip
 */
public abstract class Pessoa {
    
    protected int codigo;
    
    private String nome;
    private String cpf;

    
    public Pessoa(String nome, String cpf) {
        
        this.nome = nome;
        this.cpf = cpf;
        this.codigo++;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + '}';
    }
    
    
    
   
    
    
}
