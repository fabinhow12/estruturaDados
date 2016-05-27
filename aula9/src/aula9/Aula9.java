/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9;

import model.ArvoreBinaria;

/**
 *
 * @author fabio
 */
public class Aula9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ArvoreBinaria teste = new ArvoreBinaria();
        
        
        teste.adicionar(15);
        teste.adicionar(20);
        teste.adicionar(10);
        teste.adicionar(10);
        teste.adicionar(40);
        teste.adicionar(8);
        teste.adicionar(9);
        teste.adicionar(12);
        teste.adicionar(11);
        
        System.out.println(teste.getQuantidade());
        teste.listaArvore();
        System.out.println(teste.pesquisa(40));
        teste.exclui(10);
        System.out.println("");
        teste.listaArvore();
        System.out.println(teste.getQuantidade());
    }
    
}
