/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author notvo
 */
public final class DatabaseConnection {

    /**
     * URL de conexi�n JDBC. Configurable via -Ddb.url
     */
    private static final String URL = System.getProperty("db.url", "jdbc:mysql://localhost:3306/gestion_comercio");

    /**
     * Usuario de la base de datos. Configurable via -Ddb.user
     */
    private static final String USER = System.getProperty("db.user", "root");

    /**
     * Contrase�a del usuario. Configurable via -Ddb.password
     */
    private static final String PASSWORD = System.getProperty("db.password", "nicolas02");

    static {
        try {
            // Carga expl�cita del driver (requerido en algunas versiones de Java)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Valida configuraci�n tempranamente (fail-fast)
            validateConfiguration();
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError("Error: No se encontr� el driver JDBC de MySQL: " + e.getMessage());
        } catch (IllegalStateException e) {
            throw new ExceptionInInitializerError("Error en la configuraci�n de la base de datos: " + e.getMessage());
        }
    }

    // constructor privado para evitar instanciacion ya que usamos todo como static
    private DatabaseConnection() {
        throw new UnsupportedOperationException("Esta es una clase utilitaria y no debe ser instanciada");
    }

    // nueva conexi�n 
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    
    // validar los parametros de configuracion sean validos 
    
        private static void validateConfiguration() {
        if (URL == null || URL.trim().isEmpty()) {
            throw new IllegalStateException("La URL de la base de datos no est� configurada");
        }
        if (USER == null || USER.trim().isEmpty()) {
            throw new IllegalStateException("El usuario de la base de datos no est� configurado");
        }
        // PASSWORD puede ser vac�o (com�n en MySQL local con usuario root sin contrase�a)
        // Solo validamos que no sea null
        if (PASSWORD == null) {
            throw new IllegalStateException("La contrase�a de la base de datos no est� configurada");
        }
    }

}