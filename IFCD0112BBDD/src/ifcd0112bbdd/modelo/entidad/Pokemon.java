/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifcd0112bbdd.modelo.entidad;

/**
 *
 * @author Julen Profe
 */
public class Pokemon {
    
    //Atributo
    private int numero;
    private String nombre;
    private Double altura;
    private Double peso;

    public Pokemon(int numero, String nombre, Double altura, Double peso) {
        this.numero = numero;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }

    public Pokemon() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "numero=" + numero + ", nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
    
}
