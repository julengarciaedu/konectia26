/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konectiaexpress;

import java.util.Arrays;
import konectiaexpress.controlador.AlmacenGestion;
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
        AlmacenGestion ag = new AlmacenGestion();
        System.out.println(ag.registrarPaquete(paq1));
        Paquete paq5 = new Paquete("PQ0126", 7.0, "Sevilla", true);
        Paquete paq6 = new Paquete("PQ0127", 11.0, "Ourense", false);
        Paquete paq7 = new Paquete("PQ0128", 4.0, "Barcelona", true);
        ag.registrarPaquete(paq2);
        ag.registrarPaquete(paq3);
        ag.registrarPaquete(paq4);
        ag.registrarPaquete(paq5);
        ag.registrarPaquete(paq6);
        ag.registrarPaquete(paq7);
        //ag.listaPaquetes
        ag.generarInformeFragiles();
    }
    
}
