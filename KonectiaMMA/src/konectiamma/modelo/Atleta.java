/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konectiamma.modelo;

/**
 *
 * @author Julen Profe
 */
public class Atleta {
    
    //Atributos
    private int dorsal;
    private String nombre;
    private double pesoCorporal;
    private String categoria;
    
    //Constructores

    public Atleta(int dorsal, String nombre, double pesoCorporal, String categoria) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.pesoCorporal = pesoCorporal;
        this.categoria = categoria;
    }

    public Atleta() {
    }
    
    //Getter & Setter

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPesoCorporal() {
        return pesoCorporal;
    }

    public void setPesoCorporal(double pesoCorporal) {
        this.pesoCorporal = pesoCorporal;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    //toString

    @Override
    public String toString() {
        return "Atleta{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", pesoCorporal=" + pesoCorporal + ", categoria=" + categoria + '}';
    }
    
}
