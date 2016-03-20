/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executa;

import model.ListaAluno;

/**
 *
 * @author fabio
 */
public class Executa {
    
    public static void main(String[] args) {
        ListaAluno lista = new ListaAluno();
        
        for (int i = 0; i < 1000000 ; i++) {
            lista.addFim("Aluno " + i);
            
        }
        
        
        
        lista.RecuperaAluno(500000);
        
        
    }
    
    
}
