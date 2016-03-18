/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Produto;

/**
 *
 * @author alunofavip
 */
public class RepositorioProduto {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    
    public void addProduto(Produto p){
        listaProdutos.add(p);
    }
    
    public void removeProduto(Produto p){
        for (Produto produtoAtual : listaProdutos) {
            if(produtoAtual.equals(p)){
                this.listaProdutos.remove(p);
                break;
            }
        }
        
    }
    
    public Produto recuperarProduto(int codigo){
        Produto achou = null;
        
        for (Produto produtoAtual : listaProdutos) {
            if (produtoAtual.getCodigo() == codigo){
                achou = produtoAtual;
                break;
            }
        }
        
        return achou;
        
    }
    
    
    
    public int quantidadePro(){
        return this.listaProdutos.size();
    }
    
    
    public void imprimirlistaOrdenada(){
        this.listaProdutos.sort(Comparator.comparing(Produto::getNome));
        listaProdutos.forEach(System.out::println);
    }
    
    
}
