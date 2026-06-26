/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifcd0112bbdd.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Julen Profe
 */
public class ConexionBD {
    
    //Atributos privados y finales (constantes)
    private static final String CADENACONEXION = "jdbc:mysql://127.0.0.1:3306/pokemondb";
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "admin";
    
    public static Connection conectarBD() {
        try {
            Connection conexion = DriverManager.getConnection(CADENACONEXION, USUARIO, CONTRASENIA);               
            return conexion;
        } catch (SQLException e) {
            System.out.println("No se ha podido realizar la conexión a base de datos. "+e.getMessage());
        } 
        return null;
    }
    

}
