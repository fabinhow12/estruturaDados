/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import model.Funcionario;

/**
 *
 * @author alunofavip
 */
public class RepositorioFuncionario {
    private ArrayList<Funcionario> listaFun = new ArrayList<>();
    
    
    public void addFunc(Funcionario f){
        this.listaFun.add(f);
    }
    
    public void removeFunc(Funcionario f){
          for (Funcionario funcAtual : listaFun) {
               if (funcAtual.equals(f)){
                   this.listaFun.remove(f);
                   break;
               }
        }
    }
    
    
    public int quantFunc(){
        return this.listaFun.size();
    }
    
    
}
