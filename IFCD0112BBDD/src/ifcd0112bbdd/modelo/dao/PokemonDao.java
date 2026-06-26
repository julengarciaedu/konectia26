/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifcd0112bbdd.modelo.dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ifcd0112bbdd.modelo.entidad.Pokemon;
import java.util.ArrayList;

/**
 *
 * @author Julen Profe
 */
public class PokemonDao {

    public PokemonDao() {
    }
    
    public Pokemon obtenerPokemonPorId(int id){
        //Pokemon pokeresultado = null;
        String consultasql = "SELECT NUMERO_POKEDEX ID, NOMBRE, PESO, ALTURA FROM "
                + " POKEMON WHERE NUMERO_POKEDEX = ? ";
        try( Connection con = ConexionBD.conectarBD();
                PreparedStatement stmt = con.prepareStatement(consultasql);
                ) {
            //Tengo que cambiar las ? por sus valores y la ejecuto
            stmt.setInt(1, id); //la posición de las ? empieza en 1
            //Lanzamos la sentencia, y como es Select recibo un resultset
            ResultSet rs = stmt.executeQuery();
            //Mientras haya datos en el ResultSet, con next me voy posicionando
            //en cada fila
            while(rs.next()){
               return new Pokemon(rs.getInt("ID"),rs.getString("NOMBRE"),rs.getDouble("ALTURA"),rs.getDouble("PESO")); 
            }
            //System.out.println("Me he pokeconectado a la pokebase de datos");
        } catch (SQLException sqle) {
           System.out.println("Error! "+sqle.getMessage());
        } catch (Exception e) {
           System.out.println("Error! "+e.getMessage()); 
        }  
        return null;
    }
    
    public ArrayList<Pokemon> obtenerTodosPokemon(){
    
        return null;
    }    
    
    public boolean insertarPokemon(Pokemon poke) {
        String consultasql = "insert into pokemon (numero_pokedex, nombre, peso, altura) values (?, ?, ?, ?)";
        try (Connection con = ConexionBD.conectarBD();
                PreparedStatement stmt = con.prepareStatement(consultasql)) {
           stmt.setInt(1, poke.getNumero());
           stmt.setString(2, poke.getNombre());
           stmt.setDouble(3, poke.getPeso());
           stmt.setDouble(4, poke.getAltura());
           //En este caso, no uso un executeQuery porque es un insert
           int filas = stmt.executeUpdate();
           if (filas == 1) return true;
        } catch (SQLException sqle) {
           System.out.println("Error! "+sqle.getMessage());
        } catch (Exception e) {
           System.out.println("Error! "+e.getMessage()); 
        }  
        return false;
    }
    
    //Pendiente, añadir desde ArraydePokemons.
    
}
