/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifcd0112bbdd;

import ifcd0112bbdd.modelo.dao.ConexionBD;
import ifcd0112bbdd.modelo.dao.PokemonDao;
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
//        String url = "jdbc:mysql://127.0.0.1:3306/pokemondb"; //127.0.0.1 es localhost
//        String usuario = "root";
//        String contrasena = "admin"; //vuestra contraseña
//        String sql = "Select * from pokemon";
        ArrayList<Pokemon> listaPokes = new ArrayList<>();
        try {
//            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
//            System.out.println("Conexión exitosa a la base de datos.");
//            //Vamos a crear el Statement para poder lanzar la SQL
//            Statement stmt = conexion.createStatement();
//            //Ejecutamos la sql y nos devuelve un objeto de tipo ResultSet.
//            ResultSet resultado = stmt.executeQuery(sql);
//            while(resultado.next()){
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
//                listaPokes.add(new Pokemon(resultado.getInt("numero_pokedex"), resultado.getString("nombre"), resultado.getDouble("altura"), resultado.getDouble("peso")));
//            }
//            // Cerrar la conexión (importante para liberar recursos)
//            System.out.println("Se han cargado en la lista "+listaPokes.size()+ " pokemones.");
//            conexion.close();
//              Pokemon poke = new PokemonDao().obtenerPokemonPorId(1);
//              if (poke != null) System.out.println(poke.toString());
//              poke = new PokemonDao().obtenerPokemonPorId(5);
//              if (poke != null) System.out.println(poke.toString());
//              poke = new PokemonDao().obtenerPokemonPorId(128);
//              if (poke != null) System.out.println(poke.toString());
//              poke = new PokemonDao().obtenerPokemonPorId(500);
//              if (poke != null) System.out.println(poke.toString());
//              Pokemon pokeinsert = new Pokemon(0, "MariTrini", 0.5, 20.2);
//              if(new PokemonDao().insertarPokemon(pokeinsert)) System.out.println(pokeinsert.getNombre()+" OK");
//              pokeinsert = new Pokemon(0, "Guenestefani", 1.5, 10.2);
//              if(new PokemonDao().insertarPokemon(pokeinsert)) System.out.println(pokeinsert.getNombre()+" OK");
//              Pokemon pokeupdate = new Pokemon(158, "MarriTrrini", 1.5, 10.2);
//              if(new PokemonDao().actualizarPokemon(pokeupdate)) System.out.println(pokeupdate.getNombre()+" OK");
//              if(new PokemonDao().borrarPokemon(159)) System.out.println("num_pokedex:159 borrado: OK");
                //listaPokes = new PokemonDao().obtenerPokemonPorFiltro("A", null, null, null, null);
//                listaPokes = new PokemonDao().obtenerPokemonPorFiltro("J", null, null, 0.5, 1.0);
//                for (Pokemon p : listaPokes) System.out.println(p.toString());
                Pokemon pokeinsert = new Pokemon(0, "Copernica", 0.5, 20.2);
                listaPokes.add(pokeinsert);
                pokeinsert = new Pokemon(0, "Anthony", 3.5, 100.2);
                listaPokes.add(pokeinsert);
                pokeinsert = new Pokemon(0, "Tricornia", 4.5, 50.2);
                listaPokes.add(pokeinsert);
                pokeinsert = new Pokemon(0, "Zapaleta", 5.5, 70.2);
                listaPokes.add(pokeinsert);
                if(new PokemonDao().insertarPokemon(listaPokes)) System.out.println("Pokes insertados, mira el DBeaver");
                
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
