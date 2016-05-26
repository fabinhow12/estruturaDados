/*
 * O Acesso da árvore é feita a partir de pós-ordem ou seja acessa todos da esquerda, depois da direita e por último a raiz
 */
package model;

/**
 *
 * @author fabio
 */
public class ArvoreBinaria {

    private No raiz;

    public Boolean estaVazia() {
        Boolean vazia = false;
        if (raiz == null) {
            return vazia = true;
        }
        return vazia;
    }

    public int getQuantidade() {
        System.out.print("Quantidade: ");
        return getQuantidadeNos(this.raiz);
    }

    public void adicionar(int valor) {
        inserir(this.raiz, valor);
    }

    public void listaArvore() {
        System.out.println("Imprimindo árvore em pós-ordem");
        System.out.println("=====================");
        if (this.raiz == null) {
            System.out.println("Árvore Vazia");
        } else {
            imprimirArvore(this.raiz);
        }
    }

    public No exclui(int valor) throws Exception {
        return remove(this.raiz, valor);
    }

    public No pesquisa(int valor) throws Exception {
        return encontraValor(this.raiz, valor);
    }

    //Métodos Privados
    private int getQuantidadeNos(No raiz) {
        int tamanho = 0;
        if (raiz == null) {
            return tamanho;
        }
        int quantidadeNoEsq = getQuantidadeNos(raiz.getNoEsquerda());
        int quantidadeNoDir = getQuantidadeNos(raiz.getNoDireita());
        tamanho = (quantidadeNoEsq + quantidadeNoDir + 1);
        return tamanho;
    }

    private void inserir(No elemento, int valor) {

        if (this.raiz == null) {
            this.raiz = new No(valor);

        } else {

            if (valor < elemento.getValor()) {//Verifica se o valor é menor que o do nó

                if (elemento.getNoEsquerda() != null) {
                    inserir(elemento.getNoEsquerda(), valor);
                } else {
                    //Nó esquerdo vazio
                    elemento.setNoEsquerda(new No(valor));
                }

            } else if (valor > elemento.getValor()) {//Verifica se o valor é maior que o do nó 

                if (elemento.getNoDireita() != null) {
                    inserir(elemento.getNoDireita(), valor);
                } else {
                    //Nó direito vazio
                    elemento.setNoDireita(new No(valor));
                }

            }

        }

    }

    private void imprimirArvore(No elemento) {

        if (elemento.getNoEsquerda() != null) {

            imprimirArvore(elemento.getNoEsquerda());
            System.out.println("Elemento Da esquerda");
            System.out.println("Do nó:" + elemento.getValor());
            System.out.println("=====================");
        }
        if (elemento.getNoDireita() != null) {

            imprimirArvore(elemento.getNoDireita());
            System.out.println("Elemento da direita");
            System.out.println("Do nó: " + elemento.getValor());
            System.out.println("=====================");
        }
        System.out.println("Nó: " + elemento.getValor());
        if (elemento == this.raiz) {
            System.out.println("Raiz");
            System.out.println("=====================");
        }
    }

    private No remove(No elemento, int valor) throws Exception {
        if (this.raiz == null) {
            throw new Exception("Árvore Vazia");
        } else {

            if (valor < elemento.getValor()) {
                elemento.setNoEsquerda(remove(elemento.getNoEsquerda(), valor));
            } else if (valor > elemento.getValor()) {
                elemento.setNoEsquerda(remove(elemento.getNoDireita(), valor));
            } else if (elemento.getNoEsquerda() != null && elemento.getNoDireita() != null) {
                //2 nós filhos
                System.out.println("Removeu No: " + elemento.getValor());
                elemento.setValor(encontraMinimo(elemento.getNoDireita()).getValor());
                elemento.setNoDireita(removeMinimo(elemento.getNoDireita()));
            } else {
                System.out.println("Removeu No: " + elemento.getValor());
                elemento = (elemento.getNoEsquerda() != null) ? elemento.getNoEsquerda() : elemento.getNoDireita();
            }
            return elemento;
        }

    }

    private No removeMinimo(No elemento) {
        if (elemento == null) {
            System.out.println("  ERRO ");
        } else if (elemento.getNoEsquerda() != null) {
            elemento.setNoEsquerda(removeMinimo(elemento.getNoEsquerda()));
            return elemento;
        } else {
            return elemento.getNoDireita();
        }
        return null;
    }

    private No encontraMinimo(No elemento) {
        if (elemento != null) {
            while (elemento.getNoEsquerda() != null) {
                elemento = elemento.getNoEsquerda();
            }
        }
        return elemento;
    }

    private No encontraValor(No elemento, int valor) throws Exception {
        No elementoBusca = null;
        if (this.raiz == null) {
            throw new Exception("Árvore Vazia");
        } else {

            if (valor == elemento.getValor()) {

                return elementoBusca = elemento;

            } else if (valor < elemento.getValor()) {

                if (elemento.getNoEsquerda() != null) {
                    return encontraValor(elemento.getNoEsquerda(), valor);
                }

            } else if (valor > elemento.getValor()) {

                if (elemento.getNoDireita() != null) {
                    return encontraValor(elemento.getNoDireita(), valor);
                }

            }

        }

        return elemento;
    }

}
