package views;

public class ShowConsole {

    public ShowConsole() {
    }
    public void printBusquedaResult(int posicion, int valor, int[] array) {
        if (posicion == -1) {
            System.out.println("╔════════════════════════════════════╗");
            System.out.println("║    Resultado de la Búsqueda        ║");
            System.out.println("╠════════════════════════════════════╣");
            System.out.println("║ El valor no se encuentra en el     ║");
            System.out.println("║ arreglo                            ║");
            System.out.println("╚════════════════════════════════════╝");
        } else {
            System.out.println("╔════════════════════════════════════╗");
            System.out.println("║    Resultado de la Búsqueda        ║");
            System.out.println("╠════════════════════════════════════╣");
            System.out.println("║ Valor encontrado: " + valor + "                ║");
            System.out.println("║ En la posición: " + posicion + "                  ║");
            System.out.println("╚════════════════════════════════════╝");
        }
    }

    // Imprime el arreglo de forma legible
    public void printArray(int[] array) {
        System.out.println("Contenido del arreglo:");
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    // Imprime una cabecera/ sección
    public void printSection(String title) {
        System.out.println(title);
    }

    // Imprime un error con el formato pedido
    public void printError(String msg) {
        System.out.println("Error-> " + msg);
    }

    // Imprime el valor encontrado entre corchetes: El [10] se encontró
    public void printFoundBracket(int valor) {
        System.out.println("El [" + valor + "] se encontró");
    }

    // Imprime un objeto usando su toString()
    public void printObject(Object obj) {
        System.out.println(obj);
    }

    
    
}
