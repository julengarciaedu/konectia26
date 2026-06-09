/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifcd0112poo;

import ifcd0112poo.modelo.entidad.Criminal;

/**
 *
 * @author Julen Profe
 */
public class IFCD0112POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Criminal crim = new Criminal("Martin", "Libre"); //Creo una instancia de la clase (objeto)
        Criminal crim2 = new Criminal ("Jose");
        Criminal crim3 = new Criminal();
        //Acabo de poner los atributos como private en la clase Criminal.java
        // así que ya no puedo acceder a los atributos directamente.
//        crim3.nombre = "Julen"; //escribo en sus atributos
//        crim3.estado = "preso";
//        System.out.println(crim.nombre+" es un peligroso criminal que está "+crim.estado); //leo sus atributos
//        crim.saludar(); //llamo a sus métodos
//        System.out.println(crim2.nombre+" es un peligroso criminal que está "+crim2.estado); //leo sus atributos
//        crim2.saludar(); //llamo a sus métodos
//        System.out.println(crim3.nombre+" es un peligroso criminal que está "+crim3.estado); //leo sus atributos
          //Ahora accedo a través de los getter y setter  
        crim3.setNombre("Julen"); //escribo en sus atributos
        crim3.setEstado("preso");
        System.out.println(crim.getNombre()+" es un peligroso criminal que está "+crim.getEstado()); //leo sus atributos
        crim.saludar(); //llamo a sus métodos
        System.out.println(crim2.getNombre()+" es un peligroso criminal que está "+crim2.getEstado()); //leo sus atributos
        crim2.saludar(); //llamo a sus métodos
        System.out.println(crim3.getNombre()+" es un peligroso criminal que está "+crim3.getEstado()); //leo sus atributos
          

        crim3.saludar(); //llamo a sus métodos
        System.out.println(crim.toString());
    }
    
}
