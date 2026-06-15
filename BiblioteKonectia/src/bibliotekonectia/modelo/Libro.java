/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotekonectia.modelo;

/**
 *
 * @author Julen Profe
 */
public class Libro {
    
    //Atributos
    String titulo;
    String autor;
    String editorial;
    String ISBN;
    int anioedicion;
    
    //Constructor

    public Libro() {
    }
    
    public Libro(String titulo, String autor, String editorial, String ISBN, int anioedicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.anioedicion = anioedicion;
    }
    
    //Getter & Setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAnioedicion() {
        return anioedicion;
    }

    public void setAnioedicion(int anioedicion) {
        this.anioedicion = anioedicion;
    }
   
    
    //toString

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", ISBN=" + ISBN + ", anioedicion=" + anioedicion + '}';
    }
    
}
