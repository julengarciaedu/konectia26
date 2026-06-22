/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotekonectia.controlador;

import bibliotekonectia.modelo.Libro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Julen Profe
 */
public class GestionBiblioteca {
    
    /**
     * 68.- Crear una función estática que importe el archivo adjunto (ListaLibros.txt) 
     * en una estructura de ArrayList de Libro.
     * (Nos basaremos en los datos del archivo para saber cómo tenemos que crear el objeto).
     * @return 
     */
    
    public static ArrayList<Libro> importarLibros(){
        //Declaro la variable donde voy a cargar los libros
        ArrayList<Libro> listaLibros = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("c:\\tmp_clase\\ListaLibros.txt"));
            String linea;
            while ((linea = br.readLine())!=null ) {
                //mientras haya datos en "linea" vamos a hacer esto:
                String[] datos = linea.split(";");
                //Declaro un libro
                Libro lib = new Libro();
                lib.setTitulo(datos[0]);
                lib.setAutor(datos[1]);
                lib.setEditorial(datos[2]);
                lib.setISBN(datos[3]);
                lib.setAnioedicion(Integer.parseInt(datos[4]));
                //y lo añado al ArrayList
                listaLibros.add(lib);
                //Se viene la macarrada
//                listaLibros.add(new Libro(datos[0],datos[1],datos[2],datos[3],Integer.parseInt(datos[4])));
            }
            br.close();
        } catch(Exception e) {
            System.out.println("ERROR! "+e.getMessage());
        }
        return listaLibros;
        
    }
    
    /**
     * 69.- Creamos una función que recibe un ArrayList de Libros (por ejemplo el del ejercicio 68), 
     * una fecha de inicio y una fecha de fin. La función va a devolver un ArrayList con los libros 
     * cuyos años estén comprendidos entre esos años. 
     * Para probarlo, podemos pedir dos años por pantalla y sacamos la respuesta.
     */
    
    public static ArrayList<Libro> filtrarPorAnios(ArrayList<Libro> listaLibros, LocalDate inicio, LocalDate fin){
        //Declaro la variable donde voy a cargar los libros
        ArrayList<Libro> listaFiltrada = new ArrayList<>();
        for(Libro lib : listaLibros) {
            if (lib.getAnioedicion()>=inicio.getYear() && 
                    lib.getAnioedicion() <= fin.getYear()) {
                listaFiltrada.add(lib);
            }
        }
        return listaFiltrada;
    }
    
}
