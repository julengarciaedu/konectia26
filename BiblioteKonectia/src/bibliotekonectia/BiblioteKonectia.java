/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotekonectia;

import bibliotekonectia.controlador.GestionBiblioteca;
import bibliotekonectia.controlador.LibroGestion;
import bibliotekonectia.modelo.Administador;
import bibliotekonectia.modelo.Editorial;
import bibliotekonectia.modelo.Libro;
import bibliotekonectia.modelo.PersonaCarnica;
import java.time.LocalDate;
import java.time.Month;
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
        ArrayList<Libro> prueba = GestionBiblioteca.importarLibros();
//        System.out.println(prueba.toString());
//        for (Libro lib : prueba) {
//            System.out.println(lib.toString());
//        }
        ArrayList<Libro> pruebafiltrada = GestionBiblioteca.filtrarPorAnios(prueba ,LocalDate.of(1980, 1, 1) , LocalDate.of(1985, 1, 1));
        System.out.println(pruebafiltrada.toString());
//        PersonaCarnica pc = new PersonaCarnica("Hola", "Persona");
//        Administador admin = new Administador("111", "Paco", "Paquin");
//        System.out.println(admin.getNombre());
//        admin.administroMisCosas();
//        System.out.println(admin.generarContrasenia());
        //admin.nombre;
        LibroGestion lg = new  LibroGestion();
        lg.descatalogar(prueba);

    }
    
    
    
}
