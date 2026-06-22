/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotekonectia.modelo;

/**
 *
 * @author Julen Profe
 */
public class Administador extends PersonaCarnica {
    
    private String numadministrador;
   
//    public String generarContrasenia() {
//        
//    }
//    

    public Administador(String Nombre, String Apellido) {
        super(Nombre, Apellido);
    }

    public Administador(String numadministrador, String Nombre, String Apellido) {
        super(Nombre, Apellido);
        this.numadministrador = numadministrador;
    }
    
    
    
    
    public void administroMisCosas() {
        System.out.println("Estoy administrando cosas de administadores");
    }

    public String getNumadministrador() {
        return numadministrador;
    }

    public void setNumadministrador(String numadministrador) {
        this.numadministrador = numadministrador;
    }
    
    
    @Override
    public String generarContrasenia() {
        return "4321"+this.numadministrador;
    }
    
    
    
}
