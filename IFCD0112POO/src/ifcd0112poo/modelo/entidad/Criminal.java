/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifcd0112poo.modelo.entidad;

/**
 *
 * @author Julen Profe
 */
public class Criminal {
    
    //Defino los atributos
    private String nombre;
    private String estado; //libre, preso
    private String dni;

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
    
    /**
     * Genero los Getter y Setter
     */
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(int dni) {
        
        this.dni = String.valueOf(dni)+calcularLetraDNI(dni);
    }
    
    private char calcularLetraDNI(int numerico){
        return 'L';
    }
    
}
