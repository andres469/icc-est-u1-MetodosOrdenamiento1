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

        // Búsqueda por suma de nombres (convertir nombre a número y sumar)
        showConsole.printSection("\nlos datos del buqueda por suma");
        Persona[] personas2 = new Persona[] {
            new Persona(1, "Ana"),
            new Persona(2, "Juan"),
            new Persona(3, "María"),
            // Este nombre está construido para obtener suma = 498 (19 'Z' + 'D' = 494 + 4)
            new Persona(99, "ZZZZZZZZZZZZZZZZZZZD")
        };

        // Mostrar cada nombre y su valor numérico
        for (Persona p : personas2) {
            int valor = nombreAValor(p.getNombre());
            System.out.println(p.getNombre() + " -> " + valor);
        }

        // Buscar la persona cuya suma de nombre sea 498
        // Obtener la primera coincidencia (si existe) y mostrarla
        Persona match = buscarPorSumaReturn(personas2, 498);
        if (match != null) {
            showConsole.printFoundBracket(498);
            showConsole.printObject(match);
        } else {
            showConsole.printError("el numero buscado no se encontro");
        }
    }

    /**
     * Convierte un nombre a un valor numérico sumando A=1 .. Z=26 (ignora caracteres no alfabéticos)
     */
    public int nombreAValor(String nombre) {
        if (nombre == null) return 0;

        // Sumar el valor numérico de cada carácter (su código Unicode/ASCII)
        int suma = 0;
        for (int i = 0; i < nombre.length(); i++) {
            char c = nombre.charAt(i);
            suma += (int) c; // suma del valor de cada carácter
        }
        return suma;
    }

    /** Busca en el arreglo las personas cuya suma de nombre == target */
    public void buscarPorSuma(Persona[] personas, int target) {
        boolean encontrado = false;
        for (Persona p : personas) {
            int s = nombreAValor(p.getNombre());
            if (s == target) {
                encontrado = true;
                showConsole.printFoundBracket(s);
                showConsole.printObject(p);
            }
        }
        if (!encontrado) {
            showConsole.printError("el numero buscado no se encontro");
        }
    }

    /** Retorna la primera Persona cuya suma del nombre es igual a target, o null si no hay coincidencias */
    public Persona buscarPorSumaReturn(Persona[] personas, int target) {
        if (personas == null) return null;
        for (Persona p : personas) {
            if (nombreAValor(p.getNombre()) == target) {
                return p;
            }
        }
        return null;
    }

    /** Retorna todas las Personas cuya suma del nombre es igual a target */
    public java.util.List<Persona> buscarPorSumaAll(Persona[] personas, int target) {
        java.util.List<Persona> matches = new java.util.ArrayList<>();
        if (personas == null) return matches;
        for (Persona p : personas) {
            if (nombreAValor(p.getNombre()) == target) matches.add(p);
        }
        return matches;
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

    public Persona searchPersonByName(Persona[] personas, String name) {
        for (Persona persona : personas) {
            if (persona.getNombre().equals(name)) {
                return persona;
            }
        }
        return null;

    }

    public Persona findPersonByAge(Persona[] personas, int age) {
        for (Persona persona : personas) {
            if (persona.getAge() > 25 ) {
                if (persona.getAge()%2==0) {
                    System.out.println("es par");
                }else{
                    System.out.println("es impar");
                    return persona;
                }
                
            }
        }
        return null;

    }

    public  Persona findPersonByValueName(Persona[] personas, String name) {
        for (Persona persona : personas) {
            if (persona.getNombre().equals(name)) {
                return persona;
            }
        }
        return null;

    }


}
