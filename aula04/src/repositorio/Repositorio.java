/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import java.util.Collections;
import model.Venda;

/**
 *
 * @author alunofavip
 */
public class Repositorio {
    
   private ArrayList<Venda> listaVendas = new ArrayList<>();
   
      
   public void addVenda(Venda venda){
       listaVendas.add(venda);
   }
   
   public void removeVenda(Venda v){
       
       if (v!= null){
       for (Venda vendaAtual : listaVendas) {
           if (vendaAtual.equals(v)){
               
               this.removeVenda(v);
               break;
           }
       }
       }else{
           System.out.println("Venda nao existe");
       }
       
   }
   
   public int quantidadeVendas(){
       return this.listaVendas.size();
   }
   
   public void imprimi(){
       this.listaVendas.forEach(System.out::println);
       
   }
   
  
   
}
