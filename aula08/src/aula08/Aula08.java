/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

import java.util.List;
import model.Estrutura;
import model.Pessoa;

/**
 *
 * @author fabio
 */
public class Aula08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estrutura<Pessoa> conjunto = new Estrutura();

        for (int i = 0; i < 50000; i++) {
            conjunto.adiciona(new Pessoa(""+i,""+i));
        }
        
        for (int i = 0; i < 50000; i++) {
            conjunto.contem(new Pessoa(""+i,""+i));
        }
        
        
        
    }

}
