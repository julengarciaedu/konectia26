/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konectiaexpress.controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import konectiaexpress.modelo.Paquete;

/**
 *
 * @author Julen Profe
 */
public class AlmacenGestion {

    // Clase de gestión (Dinámica = No estática) “AlmacenGestion”
    //Atributo: Un ArrayList<Paquete> listaPaquetes.
    //Métodos a implementar:
    //(a) registrarPaquete(Paquete p): Añade un paquete a la lista (atributo) solo si su ID es válido (usa la clase estática).
    //(b) generarInformeFragiles(): filtra los paquetes frágiles y guarda sus IDs y Destinos en un archivo llamado fragiles.txt.
    
    //Atributos
    ArrayList<Paquete> listaPaquetes = new ArrayList<>();

    /**
     * registrarPaquete(Paquete p): 
     * Añade un paquete a la lista (atributo) solo
     * si su ID es válido (usa la clase estática).
     *
     * @param p
     * @return
     */
    public boolean registrarPaquete(Paquete p) {

        if (LogisticaUtils.validarId(p.getId())) {
            this.listaPaquetes.add(p);
        } else {
            return false;
        }
        return true;

    }
    
    /**
     * generarInformeFragiles(): 
     * filtra los paquetes frágiles y guarda sus IDs y Destinos en un archivo 
     * llamado fragiles.txt.
     */
    public void generarInformeFragiles(){
        try{
            //Declaramos e inicializamos la variable para escribir el fichero
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\tmp_clase\\fragiles.txt"));
            for(Paquete p : this.listaPaquetes){
                if(p.isFragil()) {
                    bw.write("ID: "+p.getId()+" | Destino: "+p.getCiudadDestino());
                    bw.newLine();
                }
            }
            bw.close();
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
          
}
