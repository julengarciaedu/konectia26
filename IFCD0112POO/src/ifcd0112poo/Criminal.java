/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifcd0112poo;

/**
 *
 * @author Julen Profe
 */
public class Criminal {
    
    //Defino los atributos
    String nombre;
    String estado; //libre, preso

    //Constructor
    public Criminal(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public Criminal() {
    }
    
    public Criminal(String nombre) {
        this.nombre = nombre;
        this.estado = "libre";
    }
    
    //Defino los métodos
    public void saludar(){
        System.out.println("Hola, soy "+nombre+ " y soy más criminal que criminalín.");
    }

    @Override
    public String toString() {
        return "Criminal{" + "nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
