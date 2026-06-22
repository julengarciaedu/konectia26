/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotekonectia.modelo;

/**
 *
 * @author Julen Profe
 */
public class Editorial {
    
    private String nomEditorial;
    private String direccion;
    private String web;
    private String responsable;

    public Editorial(String nomEditorial, String direccion, String web, String responsable) {
        this.nomEditorial = nomEditorial;
        this.direccion = direccion;
        this.web = web;
        this.responsable = responsable;
    }

    public Editorial() {
    }

    public String getNomEditorial() {
        return nomEditorial;
    }

    public void setNomEditorial(String nomEditorial) {
        this.nomEditorial = nomEditorial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    
    
}
