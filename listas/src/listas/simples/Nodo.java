package listas.simples;

/**
* Elemento nodo de una lista simple
* @author Luis Fernando Campuzano Hernández
* @date 15 Octubre 2026
**/

public class Nodo {
    private int valor;
    private Nodo sig;

    public Nodo(int valor, Nodo sig) {
        this.valor = valor;
        this.sig = sig;
    }

    // Get y Set de valor	
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Get y Set de sig
    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
