package Main;


import Config.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando prueba de conexión a la base de datos...");

        // La variable 'conn' será null si la conexión falla
        Connection conn = null;

        try {
            // 1. Intentar obtener la conexión usando tu método estático
            conn = DatabaseConnection.getConnection();

            // 2. Verificar el estado de la conexión si no se lanzó una excepción
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ ¡Conexión exitosa a la base de datos MySQL!");
                System.out.println("Información del Driver: " + conn.getMetaData().getDriverName());
                System.out.println("Base de datos conectada: " + conn.getCatalog());
            } else {
                System.out.println("❌ Fallo en la conexión: La conexión fue nula o se cerró inmediatamente.");
            }

        } catch (SQLException e) {
            // 3. Capturar cualquier error específico de SQL (credenciales, URL incorrecta, DB no existe)
            System.err.println("❌ ¡Error de conexión! Revise los parámetros:");
            System.err.println("Código de Error SQL: " + e.getSQLState());
            System.err.println("Mensaje: " + e.getMessage());

        } finally {
            // 4. Asegurar que la conexión se cierre
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Conexión cerrada.");
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}



/*
import Dao.ProductoDAO;
import Dao.CodigoBarrasDAO;
import Service.ProductoServiceImp;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Iniciando Trabajo Final Integrador ---");

        // 1. STUBS/SIMULACIÓN: Asumimos que los DAOs y Services existen
        // NOTA: Para que esto compile, tu compañero debe crear la interfaz ProductoServiceImp
        ProductoServiceImp productoService = new ProductoServiceImp(
            null, // Reemplazar con new ProductoDAOImpl() real
            null  // Reemplazar con new CodigoBarrasDAOImpl() real
        );
        
        // 2. Inicializar y arrancar la aplicación de consola
        AppMenu app = new AppMenu(productoService);
        app.iniciar();
    }
}
*/