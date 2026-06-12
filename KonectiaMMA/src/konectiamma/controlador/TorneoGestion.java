/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konectiamma.controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import konectiamma.modelo.Atleta;

/**
 *
 * @author Julen Profe
 */
public class TorneoGestion {
    
    //Atributo
    ArrayList<Atleta> listaAtletas = new ArrayList<>();
    
    //Métodos
    
    /**
     * inscribirAtleta. Antes de añadir un atleta a la lista, 
     * debe usar la clase estática para asignarle su categoria basada en su pesoCorporal.
     * @param a Atleta que quiero añadir la lista
     * @return true si se ha podido añadir el atleta, false si no tiene un peso válido
     */
    public boolean inscribirAtleta(Atleta a) {
        //a.getPesoCorporal() me devuelve el peso del Atleta que estoy pasando
        // por parámetro a la función y CompeticionUtils.esPesoValido() está
        // llamando al método ESTATICO (static) de CompeticionUtils
        if(CompeticionUtils.esPesoValido(a.getPesoCorporal())){
            //Si el peso es válido, lo añado al ArrayList después de calcular su categor
            a.setCategoria(CompeticionUtils.asignarCategoria(a.getPesoCorporal()));
            this.listaAtletas.add(a);
            return true;
        }
        return false;
    }    
    
    /**
     * exportarListaCompeticion (String categoria).
     * busca los atletas de la lista que tengan la categoría pasada por parámetro y 
     * guarda sus nombres y dorsales en un fichero llamado categoria_atletas.txt 
     * donde “categoria” es el nombre de la misma en minúsculas.
     * @param categoria 
     */
    
    public void exportarListaCompeticion (String categoria) {
        try {
        //Declaro las variables
        // Abro el archivo con el nombre de la categoría que ha
        // entrado como parámetro para escribir los datos
        BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\tmp_clase\\"+categoria+"_atletas.txt"));
        //Recorro la lista de los atletas (listaAtletas) para buscar lo que tengan
        // la categoría pasada como param
        // en cada interación del for se carga un atleta en la variable
        // que estoy declarando dentro del for (Atleta a). En la primera vuelta
        // 'a' contiene el primer atleta de la lista, en la segunda el segundo, etc...
        for (Atleta a : this.listaAtletas) {
            //Si la categoría del atleta (a.getCategoria()) es igual
            // (equals) a la categoría que me han solicitado (categoria)
            if (a.getCategoria().equals(categoria)) {
                //Escribo el nombre y dorsal en el fichero
                // y saco sus datos del atleta que he encontrado recorriendo
                // el array de Atletas
                bw.write("Nombre: "+a.getNombre()+" | Dorsal: "+a.getDorsal()+"\n");
            }
        }    
        bw.close();
        }catch (Exception e) {
            System.out.println("Error! "+e.getMessage());
        }
        
    }
    
    /**
     * actualizarPesaje (int dorsal, double nuevoPeso). 
     * El atleta se ha pesado de nuevo antes de competir. Debes buscarlo por dorsal, 
     * actualizar su peso y volver a calcular su categoría automáticamente.
     * @param dorsal
     * @param nuevoPeso 
     */
    public void actualizarPesaje (int dorsal, double nuevoPeso) {
        //primero tengo que buscar al atleta por su num de dorsal
        for (Atleta a : this.listaAtletas) {
            if (a.getDorsal() == dorsal) {
                //al cambiar el dato del objeto, se cambian sus datos dentro de la lista
                a.setPesoCorporal(nuevoPeso);
                a.setCategoria(CompeticionUtils.asignarCategoria(nuevoPeso));
            }
        }
    }

    @Override
    public String toString() {
        String listatxt = "listaAtletas {";
        for (Atleta a : this.listaAtletas) {
            listatxt += a.toString()+"|";  
        }    
        return listatxt+ '}';
    }

    public ArrayList<Atleta> getListaAtletas() {
        return listaAtletas;
    }
    
    
}
