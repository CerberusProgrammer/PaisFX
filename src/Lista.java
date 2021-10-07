import java.util.Iterator;

public class Lista<T> implements Iterable<Pais>{

    private Nodo<T> inicio;

    public Lista() {
        inicio = null;
    }

    public void insertaInicio(T dato) {
        Nodo<T> nodo = new Nodo<>();
        nodo.setInfo(dato);
        nodo.setSig(inicio);
        inicio = nodo;
    }

    public void insertaFinal(T dato) {
        Nodo<T> node = new Nodo<>();
        node.setInfo(dato);

        if (inicio == null) {
            node.setSig(inicio);
            inicio = node;
        } else {
            Nodo<T> aux = inicio;

            while (aux.getSig() != null)
                aux = aux.getSig();

            aux.setSig(node);
            node.setSig(null);
        }
    }

    public T eliminaInicio() {
        T dato = inicio.getInfo();

        if (inicio == null)
            return null;

        inicio = inicio.getSig();
        return inicio.getInfo();
    }

    public T eliminaFinal() {
        Nodo<T> a;
        Nodo<T> r;

        if (inicio == null) {
            return null;
        } else {
            if (inicio.getSig() == null) {
                inicio = null;
                return null;
            } else {
                r = inicio;
                a = r;
                while (r.getSig() != null) {
                    a = r;
                    r = r.getSig();
                }
                a.setSig(null);
            }
        }
        return a.getInfo();
    }

    public T getInicio() {
        return inicio.getInfo();
    }

    public T getFinal() {
        Nodo<T> r = inicio;

        while (r.getSig() != null)
            r = r.getSig();

        return r.getInfo();
    }

    public String toString() {
        String string = "";

        if (inicio != null)
            if (inicio.getSig() == null)
                string = "" + inicio.getInfo();
            else {
                Nodo<T> r = inicio;
                while (r != null) {
                    string += r.getInfo();
                    r = r.getSig();
                }
            }
        else
            return "vacio";
        return string;
    }

    @Override
    public Iterator<Pais> iterator() {
        Nodo<T> n = inicio;

        return new Iterator<Pais>() {
            @Override
            public boolean hasNext() {
                if (n.getSig() != null)
                    return true;
                else
                    return false;
            }

            @Override
            public Pais next() {
                return (Pais) n.getSig().getInfo();
            }
        };
    }
}
