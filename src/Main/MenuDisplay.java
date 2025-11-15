package Main;


public class MenuDisplay {  
    
    public static void mostrarMenuPrincipal() {
        System.out.println("\n========= GESTIÓN DE PRODUCTOS =========");
        System.out.println("1. Crear Producto y asociar Código de Barras (Transaccional)");
        System.out.println("2. Buscar Producto por ID");
        System.out.println("3. Listar todos los Productos (incluyendo baja lógica)");
        System.out.println("4. Actualizar Producto y su Código de Barras asociado");
        System.out.println("5. Eliminar Producto (Baja Lógica)");
        
        System.out.println("--- Búsquedas ---");
        System.out.println("6. Buscar Producto por Valor de Código de Barras (Búsqueda especial)"); 
        // Esta es la búsqueda por campo relevante.
        
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: "); 
    }
}
    
// do {} while (opcion != 0);  opcional
