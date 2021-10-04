package ListaLigada;

public class Lista {

    private Nodo cabeza;

    public Nodo getCabeza() {
        return cabeza;
    }

    public Lista() {
        cabeza = null;
    }

    Nodo insercionInicio(informacion x) {
        Nodo aux;
        if (this.cabeza == null) {
            this.cabeza = new Nodo(x);
        } else {
            aux = new Nodo(x);
            aux.sigte = this.cabeza;
            this.cabeza = aux;
        }
        return cabeza;
    }

    Nodo insercionFinal(informacion x) {
        if (this.cabeza == null) {
            this.cabeza = new Nodo(x);
        } else {
            Nodo aux;
            aux = this.cabeza;

            while (aux.sigte != null) {
                aux = aux.sigte;
            }
            aux.sigte = new Nodo(x);
        }
        return cabeza;
    }

    void imprime(Nodo cabeza) {
        if (cabeza != null) {
            Nodo aux;
            aux = cabeza;
            while (aux != null) {
                System.out.print("|" + aux.elem.getX()+ "|" + "->");
                aux = aux.sigte;
            } 
            System.out.println("//");
        }else{
            System.out.println("Lista Vacia");
        }
    }
}
