/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

/**
 *
 * @author fabio
 */
public interface IMetodosRepositorio {
    
    public void adiciona(Object elemento);
    
    public void adiciona(int posicao, Object elemento);
    
    public void adicionaComeco(Object elemento);
    
    public Object pega(int posicao);
    
    public boolean contem(Object o);
    
    public void remove(int posicao);
    
    public void removeComeco();
    
    public void removeFim();
    
    public int tamanhoLista();
    
}
