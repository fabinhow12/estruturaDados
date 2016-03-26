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
public class Produto {
    
    
    private int codigo;
    private String nome;
    private double pv;
    private double pc;
    private static int codigoAtual;

    public Produto(String nome, double pv, double pc) {
        this.nome = nome;
        this.pv = pv;
        this.pc = pc;
        this.codigo = ++codigoAtual;
        
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPv() {
        return pv;
    }

    public void setPv(double pv) {
        this.pv = pv;
    }

    public double getPc() {
        return pc;
    }

    public void setPc(double pc) {
        this.pc = pc;
    }

    
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", pv=" + pv + ", pc=" + pc + '}';
    }
    
    
    
    
    
    
}
