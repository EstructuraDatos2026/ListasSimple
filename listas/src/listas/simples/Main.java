
package listas.simples;

public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        System.out.println("La lista esta vacia.");
        lista.recorrer();

        lista.insertarInicio(10);
        lista.insertarInicio(20);
        lista.insertarInicio(30);

        System.out.println("Elementos de la lista:");
        lista.recorrer();
    }
}
