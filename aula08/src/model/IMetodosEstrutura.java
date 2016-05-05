/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author fabio
 */
public interface IMetodosEstrutura<T> {

    public void adiciona(T elemento);

    public void remove(T elemento);

    public boolean contem(T elemento);

    public List<T> pegaTodas();

    public int tamanho();

    public void imprimiTable();
}
