/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konectiaexpress.modelo;

/**
 *
 * @author Julen Profe
 */
public class Paquete {

    //+-------------------------+
    //|      Paquete            |
    //+-------------------------+
    //| - id (único): String    |
    //| - peso (kg): Double     |
    //| - ciudadDestino: String |
    //| - esFragil: boolean     |
    //+-------------------------+
    //| + Constructor(es)       |
    //| + Getter y Setter       |
    //| + toString              |
    //+-------------------------+ 

    //Atributos
    // todos los definimos como private para cumplir
    // con la encapsulación
    private String id;
    private Double peso;
    private String ciudadDestino;
    private boolean fragil;

    /**
     * Constructores
     * @param id
     * @param peso
     * @param ciudadDestino
     * @param esFragil 
     */
    public Paquete(String id, Double peso, String ciudadDestino, boolean esFragil) {
        this.id = id;
        this.peso = peso;
        this.ciudadDestino = ciudadDestino;
        this.fragil = esFragil;
    }

    public Paquete() {
    }

    /**
     * Getter y Setter
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean esFragil) {
        this.fragil = esFragil;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return "Paquete{" + "id=" + id + ", peso=" + peso + ", ciudadDestino=" + ciudadDestino + ", fragil=" + fragil + '}';
    }
    
}
