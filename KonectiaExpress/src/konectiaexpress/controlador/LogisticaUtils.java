/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konectiaexpress.controlador;

import konectiaexpress.modelo.Paquete;



/**
 *
 * @author Julen Profe
 */
public class LogisticaUtils {
    
    /**
     * validarId(String id): Devuelve true si el ID tiene exactamente 6 caracteres.
     */
    
    public static boolean validarId(String id) {
        // if (id.length() == 6) return true; else return false;
        return (id.length() == 6);
    }
    
    /**
     * calcularCoste(Paquete p): Devuelve un double. 
     * El coste base son 5€ por cada 10 Kilos. 
     * Si el paquete es frágil, se le suma un 20% al coste total.
     */
    
    public static double calcularCoste(Paquete p) {
        double coste = Math.floor(p.getPeso()/10)*5;
        //Según interprete si de 0-10 Kg se paga 0 o 5€
        //double coste = Math.ceil(p.getPeso()/10)*5; 
        if (p.isFragil()) coste*=1.2;
        return coste;
    }
    
}
