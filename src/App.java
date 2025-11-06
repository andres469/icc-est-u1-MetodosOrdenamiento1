import controllers.MetodosBusqueda;
import views.ShowConsole;

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
         

    }
}
