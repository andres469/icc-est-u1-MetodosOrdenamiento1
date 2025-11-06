package controllers;

import views.ShowConsole;

public class MetodosBusqueda {
    private  int[] arreglo;
    private ShowConsole showConsole;

    public MetodosBusqueda() {
        this.arreglo = new int[]{10, 11, -2, 5, 6, 8, 15, 22};
        this.showConsole = new ShowConsole();
        System.out.println("Arreglo original:");
        //showConsole.printArray(arreglo);
        
        System.out.println("\nBúsqueda con for:");
        busquedaLienal(5);
        
         System.out.println("\nBúsqueda con while:");
        // busquedaLinealWhile(5);
        Integer result4=busquedaLinealObj(10);
        showConsole.printBusquedaResult(result4, 0, arreglo);
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
        boolean encontrado = false; 
        
        while (i < arreglo.length && !encontrado) {
            if (arreglo[i] == valor) {
                encontrado = true;
                showConsole.printBusquedaResult(i, arreglo[i], arreglo);
                return i;
            }
            i++; 
        }

        showConsole.printBusquedaResult(-1, valor, arreglo);
        return -1;
    }

    public Integer busquedaLinealObj(int value){
        return null;
    }

    public void printResult(Integer dato){
        git add README.md
    }
}
