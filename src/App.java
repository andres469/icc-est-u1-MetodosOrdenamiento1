import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ShowConsole showConsole = new ShowConsole();
        //.printArray(new int[]{1,2,3,4,5});
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        int[] array=new int[]{10, 11, -2, 5, 6, 8,15,22};
        metodosBusqueda.busquedaLienal( 5);
        metodosBusqueda.busquedaLinealWhile(-2);
         metodosBusqueda.busquedaLinealWhile(20);
         
         Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
            };

            Persona resultadoPer= metodosBusqueda.searchPersonByName(personas, "Juan");
            showConsole.printObject(resultadoPer);

            Persona resultadoPer1= metodosBusqueda.findPersonByAge(personas, 25);
            showConsole.printObject1( resultadoPer1,"25");

            // Pedir al usuario un número y buscar personas cuya suma del nombre sea ese número
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un numero objetivo para buscar por suma de nombres: ");
            if (sc.hasNextInt()) {
                int objetivo = sc.nextInt();
                List<Persona> matches = metodosBusqueda.buscarPorSumaAll(personas, objetivo);
                if (matches.isEmpty()) {
                    showConsole.printError("el numero buscado no se encontro");
                } else {
                    for (Persona p : matches) {
                        showConsole.printFoundBracket(objetivo);
                        showConsole.printObject(p);
                    }
                }
            } else {
                System.out.println("Entrada no valida.");
            }
            sc.close();
    }
}
