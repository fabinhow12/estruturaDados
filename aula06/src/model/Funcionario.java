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
public class Funcionario extends Pessoa {

    private double salario;
    private int quantidade_vendas;
    private static int codigoAtual;
    
    
    public Funcionario(String nome, String cpf,double salario) {
        
        super(nome, cpf);
        this.salario = salario;
        this.codigo = ++codigoAtual;
        
    }
    
    public void atualizaQuanVendas(){
        this.quantidade_vendas++;
    }

    public double getSalario() {
        return salario;
    }

    public int getQuantidade_vendas() {
        return quantidade_vendas;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    
    
    
    
}
