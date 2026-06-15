/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotekonectia;

import bibliotekonectia.controlador.GestionBiblioteca;
import bibliotekonectia.modelo.Libro;
import java.util.ArrayList;

/**
 *
 * @author Julen Profe
 */
public class BiblioteKonectia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libro> prueba = GestionBiblioteca.importarLibros();
        System.out.println(prueba.toString());
        for (Libro lib : prueba) {
            System.out.println(lib.toString());
        }
    }
    
}
