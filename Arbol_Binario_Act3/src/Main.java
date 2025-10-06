import java.util.Scanner;

// Clase para el nodo del árbol
class Nodo {
    int valor;
    Nodo izquierda, derecha;

    public Nodo(int v) {
        valor = v;
        izquierda = null;
        derecha = null;
    }
}

// Clase para el árbol binario
class Arbol {
    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    // Insertar un número
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    public Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor)
            raiz.izquierda = insertarRec(raiz.izquierda, valor);
        else if (valor > raiz.valor)
            raiz.derecha = insertarRec(raiz.derecha, valor);
        return raiz;
    }

    // Mostrar recorrido inorden
    public void mostrarInorden() {
        inordenRec(raiz);
        System.out.println();
    }

    public void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierda);
            System.out.print(raiz.valor + " ");
            inordenRec(raiz.derecha);
        }
    }

    // Buscar un número
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    public boolean buscarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return false;
        }
        if (raiz.valor == valor) {
            return true;
        }
        if (valor < raiz.valor)
            return buscarRec(raiz.izquierda, valor);
        else
            return buscarRec(raiz.derecha, valor);
    }
}

// Clase principal con el menú
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arbol arbol = new Arbol();
        int opcion, numero;

        do {
            System.out.println("\n MENÚ ÁRBOL ");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido inorden");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el número a insertar: ");
                numero = sc.nextInt();
                arbol.insertar(numero);
                System.out.println("Número insertado correctamente.");
            } else if (opcion == 2) {
                System.out.println("Recorrido inorden del árbol:");
                arbol.mostrarInorden();
            } else if (opcion == 3) {
                System.out.print("Ingrese el número a buscar: ");
                numero = sc.nextInt();
                if (arbol.buscar(numero))
                    System.out.println("El número " + numero + " SÍ está en el árbol.");
                else
                    System.out.println("El número " + numero + " NO está en el árbol.");
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }
}

