package Main;
/*
import java.util.InputMismatchException;
import java.util.Scanner;
import Service.ProductoServiceImp;

public class AppMenu {

    private final Scanner scanner = new Scanner(System.in);
    private final MenuHandler menuHandler;

    // Recibe el Service (o el Stub)
    public AppMenu(ProductoServiceImp productoService) {
        this.menuHandler = new MenuHandler(productoService, scanner);
    }

    public void iniciar() {
        int opcion = -1; 
        
        do {
            MenuDisplay.mostrarMenuPrincipal(); // Muestra las opciones
            
            try {
                // Intenta leer la opción
                opcion = scanner.nextInt(); 
                scanner.nextLine(); // Consumir el salto de línea

                menuHandler.manejarOpcion(opcion); // Delega la acción

            } catch (InputMismatchException e) {
                // Manejo robusto: si el usuario pone texto en vez de número
                System.err.println("❌ Error: Debe ingresar un número para la opción del menú.");
                scanner.nextLine(); // Limpiar el buffer
                opcion = -1; 
            }
            
        } while (opcion != 0);
        
        System.out.println("Fin del programa.");
        scanner.close();
    }
}
*/