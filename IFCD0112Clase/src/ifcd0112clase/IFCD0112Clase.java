/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifcd0112clase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class IFCD0112Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // Declaro las variables
//        Scanner sc = new Scanner(System.in);
//        int contPares = 0;
//        int contImpares = 0;
//        int numero;
//        String colPares = "";
//        String colImpares = "";
//        System.out.println("Introduce un número entero o 0 para terminar.");
//        //numero = sc.nextInt();
//        // Repetimos el código hasta que el usuario meta un 0
//        // es de 0 a N así que usamos un while
//        while ((numero = sc.nextInt())!= 0) {
//            //Tengo que saber si el número introducido es par o impar
//            if (numero%2 == 0) { //si se cumple que el resto es 0, el número es par
//                contPares++;
//                colPares += numero+" ";
//            } else {
//                contImpares++;
//                colImpares += numero+" ";
//            }
//            //Pido otro número al usuario
//            System.out.println("Introduce un número entero o 0 para terminar.");
//            //numero = sc.nextInt();
//        }
//        System.out.println("El número de pares introducidos ("+colPares+") es "+contPares+ " y de impares ("+colImpares+") es "+contImpares);
//        

//          Scanner sc = new Scanner(System.in);
//          System.out.println("Introduce el número de niveles para la pirámide:");
//          int niveles = sc.nextInt();
//          String asteriscos = "";
//          // Ascendente
//          for (int i=1; i<=niveles ;i++){
//              asteriscos = "";
//              for (int j=1; j<=i; j++){
//                  asteriscos+='*';
//              }
//              System.out.println(asteriscos);
//          }
//          // Descendente
//          for (int i=1; i<=niveles ;i++){
//              asteriscos = "";
//              for (int j=niveles; j>=i; j--){
//                  asteriscos+='*';
//              }
//              System.out.println(asteriscos);
//          }
//          //Lo hacemos en arbolito
//          asteriscos="";
//          for (int i = 1; i<=niveles; i++) {
//              String espacios = "";
//              for (int j=1; j<=(niveles-i); j++){
//                  espacios += " ";
//              }
//              asteriscos+="* ";
//              System.out.println(espacios+asteriscos);
//          }
//          //Lo hacemos en arbolito de otra forma
//          //asteriscos="";
//          for (int i = 1; i<=niveles; i++) {
//              asteriscos = "";
//              for (int j=1; j<=(niveles-i); j++){
//                  asteriscos += " ";
//              }
//              for (int j=1; j<=i; j++){
//                  asteriscos += "* ";        
//              }
//              System.out.println(asteriscos);
//          }
//          //Y hacemos un arbolito invertido
//          for (int i = (niveles-1); i>=1; i--) {
//              asteriscos = "";
//              for (int j=1; j<=(niveles-i); j++){
//                  asteriscos += " ";
//              }
//              for (int j=1; j<=i; j++){
//                  asteriscos += "* ";        
//              }
//              System.out.println(asteriscos);
//          }
          
          Random rd = new Random();
          System.out.println(rd.nextInt(1,4));
          
          
          
    }
    
}














