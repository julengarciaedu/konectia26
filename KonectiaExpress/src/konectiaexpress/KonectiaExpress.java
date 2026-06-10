/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konectiaexpress;

import konectiaexpress.controlador.LogisticaUtils;
import konectiaexpress.modelo.Paquete;

/**
 *
 * @author Julen Profe
 */
public class KonectiaExpress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lo vamos a usar para hacer pruebas
        Paquete paq1 = new Paquete("PQ0123", 5.0, "Bilbao", true);
        Paquete paq2 = new Paquete("PQ0124", 15.0, "Santander", false);
        Paquete paq3 = new Paquete("PQ0125", 30.0, "Gijón", true);
        Paquete paq4 = new Paquete();
        paq4.setId("PQ012345");
        //En el mismo System.out estoy llamando a un método no estático (getId)
        // y a uno estático, por eso tengo que usar el nombre de la clase y no una variable (objeto)
        // creado a partir de dicha clase.
        // paq4.getId() a partir del objeto paq4 que es instancia de la clase Paquete, llamo a getId()
        // LogisticaUtils.validarId() llamo directamente a la función estática (static) validarId desde su clase LogisticaUtils
        System.out.println("El id "+paq4.getId()+" es válido? "+LogisticaUtils.validarId(paq4.getId()));
        System.out.println("El id "+paq1.getId()+" es válido? "+LogisticaUtils.validarId(paq1.getId()));
        System.out.println(paq2.toString());
    }
    
}
