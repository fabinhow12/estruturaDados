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
public class Celula {
    private Celula proximo;
    private Celula anterior;
    private Object elemento;
    
    public Celula(Object elemento){
        this.elemento = elemento;
    }
    
    public Celula(Celula proximo,Object elemento){
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
    
}
