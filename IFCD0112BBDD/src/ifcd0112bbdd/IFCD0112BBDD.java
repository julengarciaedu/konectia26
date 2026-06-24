/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifcd0112bbdd;

import ifcd0112bbdd.modelo.entidad.Pokemon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Julen Profe
 */
public class IFCD0112BBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/pokemondb"; //127.0.0.1 es localhost
        String usuario = "root";
        String contrasena = "admin"; //vuestra contraseña
        String sql = "Select * from pokemon";
        ArrayList<Pokemon> listaPokes = new ArrayList<>();
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión exitosa a la base de datos.");
            //Vamos a crear el Statement para poder lanzar la SQL
            Statement stmt = conexion.createStatement();
            //Ejecutamos la sql y nos devuelve un objeto de tipo ResultSet.
            ResultSet resultado = stmt.executeQuery(sql);
            while(resultado.next()){
 //               Versión 1: recojo cada uno de los datos y los muestro por pantalla
//                int numpokedex = resultado.getInt("numero_pokedex");
//                String nombrepoke = resultado.getString("nombre");
//                Double pesopoke = resultado.getDouble("peso");
//                Double alturapoke = resultado.getDouble("altura");
//                System.out.println(String.valueOf(numpokedex)+" | "+nombrepoke + " | "+String.valueOf(pesopoke)+ " | "+String.valueOf(alturapoke));       
                // ==================================
//               Versión 2:  meto los datos en un objeto de tipo Pokemon
                //Pokemon poke = new Pokemon();
                //poke.setNumero(resultado.getInt("numero_pokedex"));
                //poke.setNombre(resultado.getString("nombre"));
                //poke.setPeso(resultado.getDouble("peso"));
                //poke.setAltura(resultado.getDouble("altura"));
                //System.out.println(poke.toString());
                //Versión 3: directamente añado los datos del Pokemon a través del constructor
                listaPokes.add(new Pokemon(resultado.getInt("numero_pokedex"), resultado.getString("nombre"), resultado.getDouble("altura"), resultado.getDouble("peso")));
            }
            // Cerrar la conexión (importante para liberar recursos)
            System.out.println("Se han cargado en la lista "+listaPokes.size()+ " pokemones.");
            conexion.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
    }

}
