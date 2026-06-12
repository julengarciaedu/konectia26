/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konectiamma;

import konectiamma.controlador.TorneoGestion;
import konectiamma.modelo.Atleta;

/**
 *
 * @author Julen Profe
 */
public class KonectiaMMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Atleta aa = new Atleta(1, "Paquita", 52, "nocat");
        Atleta ab = new Atleta(2, "Mawi", 55, "nocat");
        Atleta ac = new Atleta(3, "Raimundo", 80, "nocat");
        Atleta ad = new Atleta(4, "Tolorio", 50, "nocat");
        Atleta ae = new Atleta(5, "Tromp", 53, "nocat");
        TorneoGestion tg = new TorneoGestion();
        System.out.println("Atleta añadido: "+tg.inscribirAtleta(aa));
        System.out.println("Atleta añadido: "+tg.inscribirAtleta(ab));
        System.out.println("Atleta añadido: "+tg.inscribirAtleta(ac));
        System.out.println("Atleta añadido: "+tg.inscribirAtleta(ad));
        System.out.println("Atleta añadido: "+tg.inscribirAtleta(ae));
        tg.exportarListaCompeticion("mosca");
        tg.exportarListaCompeticion("paja");
        System.out.println(tg.toString());
        tg.actualizarPesaje(1, 45);
        tg.actualizarPesaje(5, 65);
        System.out.println(tg.toString());
    }
    
}
