/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifcd0112ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Julen Profe
 */
public class IFCD0112Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pruebaRWFicheros();
    }

    public static void pruebaFicheros() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\tmp_clase\\chispas.txt",true));
            for (int i = 10; i > 0; i--) {
                bw.write(Integer.toString(i));
                //bw.newLine();
                bw.write("...");
            }
            bw.write("💣");
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pruebaRWFicheros() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\tmp_clase\\chispas2.txt"));
            String linea = "";
            String despido = "Por favor, XXX, recoja sus cosas y pásese por rrhh";
            while((linea = br.readLine())!=null) {
               BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\tmp_clase\\chispas_"+linea.trim()+".txt"));         
               //System.out.println(despido.replaceFirst("XXX",linea.trim())); 
               bw.write(despido.replaceFirst("XXX",linea.trim()));
               bw.close();
            }
            br.close();
            //bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
