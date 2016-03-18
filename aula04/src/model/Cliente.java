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
public class Cliente extends Pessoa {
    
    private double quantidadeCompra;
    private static int codigoAtual;

    public Cliente(String nome, String cpf) {
        
        super(nome, cpf);
        this.codigo = ++codigoAtual;
    }
    
    
    public void atualizaCompras(){
        this.quantidadeCompra++;
    }
    
        
}
