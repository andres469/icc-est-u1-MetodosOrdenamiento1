package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {
    private int[] arreglo;
    private ShowConsole showConsole;

    public MetodosBusqueda() {
        this.arreglo = new int[]{10, 11, -2, 5, 6, 8, 15, 22};
        this.showConsole = new ShowConsole();

        // Mostrar arreglo
        showConsole.printSection("los datos del for");
        showConsole.printArray(arreglo);

        // Búsqueda con for
        showConsole.printSection("\nlos datos del for");
        busquedaLienal(5);

        // Búsqueda con while
        showConsole.printSection("\nlos datos del while");
        busquedaLinealWhile(5);

        // Búsqueda de objetos
        showConsole.printSection("\nlos datos del buqueda objeto");
        Integer idx = busquedaLinealObj(10); // buscamos Persona con id 10
        if (idx == null) {
            showConsole.printError("el numero buscado no se encontro");
        } else {
            // si se encontró, imprimimos con el formato pedido
            showConsole.printFoundBracket(10);
        }
    }

    public int busquedaLienal(int busqueda) {
        for (int i = 0; i < arreglo.length; i++) {
            if (busqueda == arreglo[i]) {
                showConsole.printBusquedaResult(i, arreglo[i], arreglo);
                return i;
            }
        }
        showConsole.printBusquedaResult(-1, busqueda, arreglo);
        return -1;
    }

    public int busquedaLinealWhile(int valor) {
        int i = 0;

        while (i < arreglo.length) {
            if (arreglo[i] == valor) {
                showConsole.printBusquedaResult(i, arreglo[i], arreglo);
                return i;
            }
            i++;
        }

        showConsole.printBusquedaResult(-1, valor, arreglo);
        return -1;
    }

    // Busca un objeto Persona por id en un arreglo local de ejemplo.
    // Retorna la posición si se encuentra, o null si no.
    public Integer busquedaLinealObj(int value) {
        Persona[] personas = new Persona[] {
            new Persona(1, "Ana"),
            new Persona(10, "Juan"),
            new Persona(5, "Luis")
        };

        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getId() == value) {
                // imprimimos el objeto encontrado
                showConsole.printObject(personas[i]);
                return i;
            }
        }

        return null;
    }

}
