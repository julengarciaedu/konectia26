/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konectiamma.controlador;

/**
 *
 * @author Julen Profe
 */
public class CompeticionUtils {
    
    /**
     * asignarCategoria (double peso): Devuelve String
     * @param peso
     * @return 
     */
    
    public static String asignarCategoria(double peso){
       if (peso <= 47) return "atomo";
       if (peso <= 52) return "paja";
       if (peso <= 56) return "mosca";
       if (peso <= 61) return "gallo";
       if (peso <= 65) return "pluma";
       if (peso <= 70) return "ligero";
       return "";
    }
    
    
    /**
     * esPesoValido (double peso): Devuelve un true si el peso está entre 40 y 70kg.
     * @param peso
     * @return 
     */
    
    public static boolean esPesoValido (double peso) {    
        return peso>=40 && peso<=70;
    }
    
}
