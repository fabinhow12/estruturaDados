/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author alunofavip
 */
public class RepositorioCliente {

    private ArrayList<Cliente> listaCliente = new ArrayList<>();

    public void addCliente(Cliente c) {
        listaCliente.add(c);
    }

    public void removeCliente(Cliente c) {

        if (c != null) {
            for (Cliente clienteAtual : listaCliente) {
                if (clienteAtual.equals(c)) {
                    this.listaCliente.remove(c);
                    break;
                }
            }

        }

    }

    
    
    public int listaQuantClientes() {
        return this.listaCliente.size();
    }

}
