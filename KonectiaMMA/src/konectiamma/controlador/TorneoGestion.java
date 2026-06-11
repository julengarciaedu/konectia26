/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konectiamma.controlador;

import java.util.ArrayList;
import konectiamma.modelo.Atleta;

/**
 *
 * @author Julen Profe
 */
public class TorneoGestion {
    
    //Atributo
    ArrayList<Atleta> listaAtletas = new ArrayList<>();
    
    //Métodos
    
    /**
     * inscribirAtleta. Antes de añadir un atleta a la lista, 
     * debe usar la clase estática para asignarle su categoria basada en su pesoCorporal.
     * @param a Atleta que quiero añadir la lista
     * @return true si se ha podido añadir el atleta, false si no tiene un peso válido
     */
    public boolean inscribirAtleta(Atleta a) {
        //a.getPesoCorporal() me devuelve el peso del Atleta que estoy pasando
        // por parámetro a la función y CompeticionUtils.esPesoValido() está
        // llamando al método ESTATICO (static) de CompeticionUtils
        if(CompeticionUtils.esPesoValido(a.getPesoCorporal())){
            //Si el peso es válido, lo añado al ArrayList después de calcular su categor
            a.setCategoria(CompeticionUtils.asignarCategoria(a.getPesoCorporal()));
            this.listaAtletas.add(a);
            return true;
        }
        return false;
    }    
}
