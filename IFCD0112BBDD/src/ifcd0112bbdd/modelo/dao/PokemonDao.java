/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifcd0112bbdd.modelo.dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
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

    public Pokemon obtenerPokemonPorId(int id) {
        //Pokemon pokeresultado = null;
        String consultasql = "SELECT NUMERO_POKEDEX ID, NOMBRE, PESO, ALTURA FROM "
                + " POKEMON WHERE NUMERO_POKEDEX = ? ";
        try (Connection con = ConexionBD.conectarBD(); PreparedStatement stmt = con.prepareStatement(consultasql);) {
            //Tengo que cambiar las ? por sus valores y la ejecuto
            stmt.setInt(1, id); //la posición de las ? empieza en 1
            //Lanzamos la sentencia, y como es Select recibo un resultset
            ResultSet rs = stmt.executeQuery();
            //Mientras haya datos en el ResultSet, con next me voy posicionando
            //en cada fila
            while (rs.next()) {
                return new Pokemon(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getDouble("ALTURA"), rs.getDouble("PESO"));
            }
            //System.out.println("Me he pokeconectado a la pokebase de datos");
        } catch (SQLException sqle) {
            System.out.println("Error! " + sqle.getMessage());
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        return null;
    }

    public ArrayList<Pokemon> obtenerTodosPokemon() {
        ArrayList<Pokemon> listarespuesta = new ArrayList<>();
        String consultasql = "SELECT NUMERO_POKEDEX ID, NOMBRE, PESO, ALTURA FROM POKEMON";
        try (Connection con = ConexionBD.conectarBD(); Statement stmt = con.createStatement();) {
            //Lanzamos la sentencia, y como es Select recibo un resultset
            ResultSet rs = stmt.executeQuery(consultasql);
            //Mientras haya datos en el ResultSet, con next me voy posicionando
            //en cada fila
            while (rs.next()) {
                listarespuesta.add(new Pokemon(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getDouble("ALTURA"), rs.getDouble("PESO")));
            }
            return listarespuesta;
            //System.out.println("Me he pokeconectado a la pokebase de datos");
        } catch (SQLException sqle) {
            System.out.println("Error! " + sqle.getMessage());
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        return null;
    }

    public ArrayList<Pokemon> obtenerPokemonPorFiltro(String nombre, Double pesomin, Double pesomax, Double alturamin, Double alturamax) {
        ArrayList<Pokemon> pokemonesresultado = new ArrayList<>();
        String consultasql = "SELECT NUMERO_POKEDEX ID, NOMBRE, PESO, ALTURA FROM POKEMON ";
        //String where = " WHERE ";
//        String where = "";
//        if (nombre != null && !nombre.trim().equals("")) where = " WHERE NOMBRE LIKE '%?%'";
//        if (pesomin != null) {
//            if (where.isEmpty()) where = " WHERE PESO > ? "; else where += " AND PESO > ?";
//        }
        String where = " WHERE ";
        boolean hayfiltro = false;
        if (nombre != null && !nombre.trim().equals("")) {
            where += " NOMBRE LIKE ? ";
            hayfiltro = true;
        }
        // si hay un peso mínimo
        if (pesomin != null) {
            if (hayfiltro) {
                where += " AND ";
            }
            hayfiltro = true;
            where += " PESO > ?";
        }
        // si hay un peso máximo
        if (pesomax != null) {
            if (hayfiltro) {
                where += " AND ";
            }
            hayfiltro = true;
            where += " PESO < ?";
        }
        // si hay una altura mínima
        if (alturamin != null) {
            if (hayfiltro) {
                where += " AND ";
            }
            hayfiltro = true;
            where += " ALTURA > ?";
        }
        // si hay una altura máxima
        if (alturamax != null) {
            if (hayfiltro) {
                where += " AND ";
            }
            hayfiltro = true;
            where += " ALTURA < ?";
        }
        if (hayfiltro) {
            consultasql += where;
        }
        System.out.println("Consulta SQL: " + consultasql);
        try (Connection con = ConexionBD.conectarBD(); PreparedStatement stmt = con.prepareStatement(consultasql);) {
            //Tengo que cambiar las ? por sus valores y la ejecuto
            if (hayfiltro) {
                int contadorfiltros = 0;
                if (nombre != null && !nombre.trim().equals("")) {
                    stmt.setString(++contadorfiltros, "%" + nombre + "%");
                }
                if (pesomin != null) {
                    stmt.setDouble(++contadorfiltros, pesomin);
                }
                // si hay un peso máximo
                if (pesomax != null) {
                    stmt.setDouble(++contadorfiltros, pesomax);
                }
                // si hay una altura mínima
                if (alturamin != null) {
                    stmt.setDouble(++contadorfiltros, alturamin);
                }
                // si hay una altura máxima
                if (alturamax != null) {
                    stmt.setDouble(++contadorfiltros, alturamax);
                }
            }
            ResultSet rs = stmt.executeQuery();
            //Mientras haya datos en el ResultSet, con next me voy posicionando
            //en cada fila
            while (rs.next()) {
                pokemonesresultado.add(new Pokemon(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getDouble("ALTURA"), rs.getDouble("PESO")));
            }
            return pokemonesresultado;
        } catch (SQLException sqle) {
            System.out.println("Error! " + sqle.getMessage());
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        return null;
    }

    public boolean insertarPokemon(Pokemon poke) {
        String consultasql = "insert into pokemon (numero_pokedex, nombre, peso, altura) values (?, ?, ?, ?)";
        try (Connection con = ConexionBD.conectarBD(); PreparedStatement stmt = con.prepareStatement(consultasql)) {
            stmt.setInt(1, poke.getNumero());
            stmt.setString(2, poke.getNombre());
            stmt.setDouble(3, poke.getPeso());
            stmt.setDouble(4, poke.getAltura());
            //En este caso, no uso un executeQuery porque es un insert
            int filas = stmt.executeUpdate();
            if (filas == 1) {
                return true;
            }
        } catch (SQLException sqle) {
            System.out.println("Error! " + sqle.getMessage());
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        return false;
    }
    
    public boolean insertarPokemon(ArrayList<Pokemon> listaPoke) {
        String consultasql = "insert into pokemon (numero_pokedex, nombre, peso, altura) values "
                + "(?, ?, ?, ?)" + ",(?, ?, ?, ?)".repeat(listaPoke.size()-1);
        try (Connection con = ConexionBD.conectarBD(); PreparedStatement stmt = con.prepareStatement(consultasql)) {
            int contador = 0;
            for (Pokemon poke : listaPoke) {
                stmt.setInt(++contador, poke.getNumero());
                stmt.setString(++contador, poke.getNombre());
                stmt.setDouble(++contador, poke.getPeso());
                stmt.setDouble(++contador, poke.getAltura());
            }    
            //En este caso, no uso un executeQuery porque es un insert
            int filas = stmt.executeUpdate();
            if (filas > 0) {
                return true;
            }
        } catch (SQLException sqle) {
            System.out.println("Error! " + sqle.getMessage());
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        return false;
    }
    
    //Pendiente, añadir desde ArraydePokemons.
    public boolean actualizarPokemon(Pokemon poke) {
        String consultasql = "update pokemon set nombre = ?, peso = ?, altura = ? where numero_pokedex = ?";
        try (Connection con = ConexionBD.conectarBD(); PreparedStatement stmt = con.prepareStatement(consultasql)) {
            stmt.setString(1, poke.getNombre());
            stmt.setDouble(2, poke.getPeso());
            stmt.setDouble(3, poke.getAltura());
            stmt.setInt(4, poke.getNumero());
            //En este caso, no uso un executeQuery porque es un insert
            if (stmt.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException sqle) {
            System.out.println("Error! " + sqle.getMessage());
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        return false;
    }

    public boolean borrarPokemon(int id) {
        String consultasql = "delete from pokemon where numero_pokedex = ?";
        try (Connection con = ConexionBD.conectarBD(); PreparedStatement stmt = con.prepareStatement(consultasql)) {
            stmt.setInt(1, id);
            //En este caso, no uso un executeQuery porque es un insert
            if (stmt.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException sqle) {
            System.out.println("Error! " + sqle.getMessage());
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        return false;
    }

}
