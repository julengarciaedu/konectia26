/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotekonectia.controlador;

import bibliotekonectia.modelo.Libro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Julen Profe
 */
public class LibroGestion {
    
    /**
     * Implementar un método en una clase nueva que vamos a crear, 
     * LibroGestion, que permita "descatalogar" libros. 
     * Leeremos la lista de ISBN que debemos dar de baja de un 
     * fichero; debe buscar un libro por su ISBN. 
     * Si existe, debe modificar un atributo booleano disponible a 
     * false. Escribiremos en un fichero como ListaLibros.txt 
     * el resultado de todos los libros con todos sus datos.
     * @param ArrayList<Libro>
     */
    
    public void descatalogar(ArrayList<Libro> listaLibros) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("c:\\tmp_clase\\listaISBN.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\tmp_clase\\listadoLibrosJunio.txt"));
            String linea;
            while((linea = br.readLine()) != null){
                String[] listaisbn = linea.split(",");
                for (String isbn : listaisbn) {
//                    for (Libro lib : listaLibros) {
//                        if (lib.getISBN().equals(isbn)) lib.setDisponible(false);
//                    }
                  listaLibros.stream()
                          .filter(lib -> lib.getISBN().equals(isbn))
                          .forEach(lib -> lib.setDisponible(false));
                }    
            }
            //Recorremos la lista completa para escribirlo en un fichero
            for(Libro lib : listaLibros)
                bw.write(lib.toString()+"\n");
            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error! "+e.getMessage());
        }
    }
    
}
