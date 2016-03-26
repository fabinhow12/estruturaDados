/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author alunofavip
 */
public class Venda {

    
    private int codigo;
    private static int codigoAtual;
    private Cliente cliente;
    private Funcionario funcionario;
    private Produto produto;
    private Date data;
    

    public Venda(Produto produto,Funcionario funcionario,Cliente cliente){
        this.codigo = ++codigoAtual;
        this.data = new Date();
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.produto = produto;
        
    }
    
    
      
    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", cliente=" + cliente + ", funcionario=" + funcionario + ", produto=" + produto + ", data=" + data + '}';
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    
    
    
    
    
}
