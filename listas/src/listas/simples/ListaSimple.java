
package listas.simples;

/**
 * Definición de una lista simple
 * @author Luis Fernando Campuzano Hernández
 * @date 15 Octubre 2026
 **/

public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    public void insertarInicio(int valor) {
        if (cabeza == null) {
            Nodo t = new Nodo(valor, null);
            cabeza = t;
        } else {
            // Crea un nodo que inicialmente apunta a null
            Nodo t = new Nodo(valor, null);

            // Conecta el nuevo nodo con la cabeza actual
            t.setSig(cabeza);

            // Actualiza la cabeza de la lista
            cabeza = t;
        }
    }

    public void recorrer() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getSig();
        }
    }
}




