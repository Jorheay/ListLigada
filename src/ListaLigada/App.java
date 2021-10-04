package ListaLigada;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Lista L;
        L = new Lista();
        informacion elem;
        int opc, posicion;
        do {
            System.out.println("---------------------------------");
            System.out.println("Ingresa la opcion");
            System.out.println("1.- Inserta nodo");
            System.out.println("2.- Imprimir");
            System.out.println("3.- Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1: 
                elem = new informacion((int) (Math.random() * 100+1));
                L.insercionInicio(elem);   
                    break;
                case 2:
                    L.imprime(L.getCabeza());
                    break;
                case 3:
                    break;
            }
        } while (opc != 3);
    }
}

