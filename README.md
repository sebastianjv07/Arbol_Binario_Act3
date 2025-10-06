¿Qué es un árbol binario?
Un árbol binario es una estructura de datos que se usa para guardar información de forma ordenada.
Imagina un árbol al revés, donde la raíz está arriba y las ramas bajan:
Cada punto del árbol se llama nodo.
El primer nodo (de arriba) se llama raíz.
Cada nodo puede tener dos ramas como máximo:
Una rama a la izquierda.
Una rama a la derecha.

En un árbol binario de búsqueda, los números se guardan de esta forma:
Los menores van a la izquierda.
Los mayores van a la derecha.
Así, el árbol queda ordenado automáticamente, y luego se puede buscar o recorrer muy rápido.

Cómo se implementó en el código

Clase Nodo:
Representa cada punto del árbol.
Tiene:
Un número (valor).
Una conexión a la izquierda.
Una conexión a la derecha.

Clase Arbol:
Es la que maneja todo el árbol.
Tiene tres funciones principales:
insertar(): agrega un número nuevo en el lugar correcto.
mostrarInorden(): muestra los números ordenados (de menor a mayor).
buscar(): revisa si un número existe dentro del árbol.

Clase Main:
Es el programa principal.
Muestra un menú en consola para que el usuario:
Inserte números.
Vea el recorrido inorden.
Busque un número.

Todo se hace con un ciclo do-while, que repite el menú hasta que el usuario elija salir.


Funcionamiento:
<img width="542" height="676" alt="image" src="https://github.com/user-attachments/assets/23e6d61c-6ef4-4c86-b3fa-b6c35e65cdcc" />

