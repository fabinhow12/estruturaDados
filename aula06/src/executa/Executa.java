/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executa;

import model.Cliente;
import model.Funcionario;
import model.Produto;
import model.Venda;
import repositorio.RepositorioVenda;
import repositorio.RepositorioCliente;
import repositorio.RepositorioFuncionario;
import repositorio.RepositorioProduto;

/**
 *
 * @author alunofavip
 */
public class Executa {
    
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Func1", "115", 50);
        RepositorioFuncionario repFunc = new RepositorioFuncionario();
        repFunc.adiciona(func);
        
        Cliente c1 = new Cliente("Cliente1", "200");
        RepositorioCliente repCliente = new RepositorioCliente();
        repCliente.adiciona(c1);
        
        Produto p = new Produto("pelular", 50, 10);
        Produto p1 = new Produto("c2",50,20);
        RepositorioProduto repProduto = new RepositorioProduto();
        repProduto.adiciona(p);
        repProduto.adiciona(p1);
        
        
        
        Venda v1 = new Venda(p, func, c1);
        RepositorioVenda repVendas = new RepositorioVenda();
        repVendas.adiciona(v1);
        
        
        System.out.println(repVendas.tamanhoLista());
        
        System.out.println(repVendas.toString());
        
        System.out.println(repProduto.toString());
        
        System.out.println(repFunc.toString());
        
        System.out.println(repCliente.toString());
        
        
    }
    
    
}
