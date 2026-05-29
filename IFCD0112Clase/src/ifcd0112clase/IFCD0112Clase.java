/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifcd0112clase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alumnos
 */
public class IFCD0112Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/* Este programa ejecuta todos los programas que hemos ido haciendo en los ejercicios */
        //Ponemos la consola en UTF-8
        //PrintStream out = new PrintStream(System.out, true, "UTF-8");
        System.out.println("Encoding por defecto: " + System.getProperty("file.encoding"));
        //Declaramos las variables que vamos a necesitar
        int opcion = -1; //Declaramos e inicializamos
        // Creamos un objeto Scanner llamado 'sc' para leer entradas desde consola
        Scanner sc = new Scanner(System.in);

        while (opcion != 0) {
            // Mostramos un mensaje con el menú y solicitando el número
            System.out.println("------------------------------------------------------------ ");
            System.out.println("Elige el ejercicio de arrays que quieres ejecutar ");
            System.out.println("------------------------------------------------------------ ");
            System.out.println("1. Convertir a Camel Case.");
            System.out.println("2. Enmascarar.");
            System.out.println("3. Obtener el nombre de un saludo.");
            System.out.println("4. Mandar mensajes personalizados.");
            System.out.println("5. Leer nombres de un fichero.");
            System.out.println("6. Leer y escribir dominios en un fichero.");
            System.out.println("7. Tratar DNIs y NIEs.");
            System.out.println("8. Limpiar Nombres.");
            System.out.println("9. Exclamativa");
            System.out.println("10. Examen, ejercicio 1.");
            System.out.println("11. Examen, ejercicio 2.");
            System.out.println("12. Contabilidad.");
            System.out.println("------------------------------------------------------------ ");
            System.out.println("Introduce tu opción (número) o 0 para salir:");
            //Esperamos a que se introduzca un número por consola
            opcion = sc.nextInt();
            sc.nextLine(); //Limpiamos el buffer
            System.out.println("------------------------------------------------------------ ");
            System.out.println("------------------------------------------------------------ ");

            //Lanzamos un programa u otro en función de la elección.
            switch (opcion) {
                case 1:
                    convertirACamelCase(sc);
                    break;
                case 2:
                    enmascaraTexto(sc);
                    break;
                case 3:
                    ejExtraerNombre();
                    break;
                case 4:
                    benvingutEmpleado(sc);
                    break;
                case 5:
                    benvingutEmpleadoFichero();
                    break;
                case 6:
                    leerYEscribirDominios();
                    break;
                case 7:
                    tratarDNIEs();
                    break;
                case 8:
                    limpiarNombres();
                    break;
                case 9:
                    exclamativa();
                    break;
                case 10:
                    examen2_1();
                    break;
                case 11:
                    examen2_2();
                    break;
                case 12:
                    contabilidad();
                    break;    

            }
        }
        System.out.println("Fin del programa.");
        sc.close();
    }


    /*
    54. Convertir a CamelCase. Ejemplo: Hola mundo que tal  -> holaMundoQueTal
     */
    public static String camelCase(String cadena) {
        // Pasamos el texto que recibimos por parámetro a String[] separándolo por espacios
        String[] palabras = cadena.split(" ");
        // También podríamos convertir toda la frase a minúsculas y nos ahorraríamos los siguientes toLowerCase()
        //String[] palabras = cadena.toLowerCase().split(" ");
        // Definimos la variable donde vamos a devolver el resultado
        String respuesta = "";
        //Recorremos cada posición del array, pero para la primera posición hay que hacer algo diferente
        boolean primeravez = true;
        for (String palabra : palabras) {
            //if (respuesta.length() == 0) //Opción para no usar booleanos 
            if (primeravez) {
                respuesta += palabras[0].trim().toLowerCase();
                primeravez = false;
            } else {
                respuesta += palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase();
            }
        }
        //En clase lo hemos resuelto de la siguiente manera
        /*
        String respuesta = palabras[0].trim();
        for(int i=0 ; i<palabras.length ; i++) {
            respuesta+= palabras[i].substring(0,1).toUpperCase() + palabras[i].substring(1);
        } 
         */
        return respuesta;
    }

    public static void convertirACamelCase(Scanner sc) {
        //Recojo un texto por pantalla y cuento el número de palabras
        System.out.println("Introduce una palabra o frase para pasarla a formato CamelCase: ");
        String texto = sc.nextLine(); //Si uso next lee solo una palabra
        System.out.println("El texto en formato CamelCase es: " + camelCase(texto));
    }

    /*
    Enmascarar cadenas: cambiamos en cadenas varias posiciones por * temas de privacidad 
    (números de teléfono, cuentas de banco, email...)
    Vamos a crear una función con dos parámetros:
        int mostrados, que va a ser el número de caracteres que quiero que se muestren
        boolean fin, true si quieres que se muestren los del final, false si quieres que se muestren los del principio
     */
    public static String enmascara(String palabra, int mostrados, boolean fin) {
        // Calculo el tamaño de la máscara
        int tamaniomasc = palabra.length() - mostrados;
        // La máscara va a ser la longitud completa - los números mostrados
        String mascara = "*".repeat(tamaniomasc);
        /*
            Alternativa en clase, hacerlo con un for por si no conocemos el repeat
            String mascara = "";    
            for (int i=1; i<=(palabra.length()-mostrados; i++){
                mascara += "*";
            }
         */
        // Ahora en función de si quiero ver la parte final o la del principio
        // creo un substring diferente
        if (fin) {
            return mascara + palabra.substring(tamaniomasc);
        } else {
            return palabra.substring(0, mostrados) + mascara;
        }
    }

    public static void enmascaraTexto(Scanner sc) {
        //Recojo una palabra por pantalla y enmascaro parte
        System.out.println("Introduce una palabra: ");
        String texto = sc.next(); //Si uso next lee solo una palabra
        System.out.println("El texto enmascarado es (4, final): " + enmascara(texto, 4, true));
        System.out.println("El texto enmascarado es (3, principio): " + enmascara(texto, 3, false));
    }

    /*
    Vamos a extraer el nombre de cada empleado de un texto de bienvenida de tipo:
    "Estimado Juan, bienvenido a nuestra compañía" sin usar literales numéricos (números "a pelo").
     */
    public static String extraerNombre(String cadena) {
        //Nota para Julen: ejercicio email + ejercicio nombreusu a partir de nombre. y #instagram
        return cadena.substring(cadena.indexOf(" ") + 1, cadena.indexOf(","));
    }

    public static void ejExtraerNombre() {
        String saludo = "Estimado Juan, bienvenido a nuestra compañía";
        String saludo2 = "Estimade Bartolomé, bienvenide a nuestra compañía";
        String saludo3 = "Estimada Maria Rosa de Todos los Santos, bienvenida a nuestra compañía";
        System.out.println("El nombre es: " + extraerNombre(saludo));
        System.out.println("El nombre es: " + extraerNombre(saludo2));
        System.out.println("El nombre es: " + extraerNombre(saludo3));
    }

    /*
    61. Vamos a recoger 5 nombres por consola y los vamos a almacenar en un ArrayList. 
    Lo recorreremos para mostrarlos en la siguiente cadena, en la que sustituiremos la "XXX" por los nombres recogidos. 
    "Estimada/o/e XXX, bienvenida/o/e a nuestra compañía".
     */
    public static void benvingutEmpleado(Scanner sc) {
        //Defino la variable donde voy a guardar los nombres que recogo por pantalla
        ArrayList<String> listaNombres = new ArrayList<>();
        //Definimos la cadena en la que vamos a sustituir el nombre del empleado
        //En este ejercicio no tiene mucho sentido el uso de StringBuilder pero
        //así vemos las características que tiene.
        //Para crear un StringBuilder tengo que llamar a new:
        StringBuilder mensaje = new StringBuilder("Estimada/o/e XXX, bienvenida/o/e a nuestra compañía");
        //Para la versión 1, vamos a ver dónde empieza y donde acaba XXX (posiciones)
        int posini = mensaje.indexOf("XXX");
        int posfin = posini + "XXX".length();
        //Mientras no tengamos 5 elementos, pedimos nombres por pantalla
        while (listaNombres.size() < 5) {
            System.out.println("Introduzca un nombre de empleado: ");
            //Y los añadimos al ArrayList para recorrerlo luego
            listaNombres.add(sc.nextLine().trim());
        }
        //foreach, mientras haya datos en listaNombres, los meto uno a uno 
        // en la variable nombre, entra al for tantas veces como datos haya
        // en el vector.
        for (String nombre : listaNombres) {
            //Versión 1, usando solo StringBuilder
            //Tengo que hacer una copia del mensaje, porque cuando llamo a la función
            //replace del StringBuilder, cambia la cadena a la que se aplica el replace.
            //no "devuelve" una cadena con la frase cambiada sino que cambia la propia frase
            //así que tengo que hacer una copia para mantener el valor original con las XXX
            StringBuilder respuesta = mensaje;
            //el replace del StringBuilder necesita una posición de inicio (inclusiva)
            //una de fin (excluyente, no la mete en el cambio) y la cadena que quiere sustituir
            //por esas posiciones
            respuesta.replace(posini, posfin, nombre);
            //no puedo imprimir directamente un StringBuilder, lo tengo que pasar a String (toString)
            System.out.println(respuesta.toString());
            //Versión 2, pasándolo a String (más fácil)
            System.out.println(mensaje.toString().replace("XXX", nombre));
        }

    }

    /*
    Repetimos el ejercicio anterior pero con ficheros
     */
    public static void benvingutEmpleadoFichero() {
        //Código

    }

    /*
    56. Extraer dominio de una palabra: Ejemplo: "https://www.ejemplo.com/pagina&quot; → "ejemplo.com"
    63. Utilizaremos la función creada en el ejercicio 56 (extraer un dominio). 
    Leeremos una lista de rutas "https://www.ejemplo.com/pagina&quot; de un archivo (cada uno estará en una línea), 
    llamaremos a la función que extrae los dominios, y los escribiremos en otro archivo (de igual manera, cada uno en una línea).
     */
    public static String extraerDominio(String url) {
        /*
        Alternativa 1:
        String dominio = url.substring(url.indexOf(".")+1);
        return dominio = dominio.substring(0, dominio.indexOf("/");
         */
        /*
        Alternativa 2:
        url = url.replace("https", "http").replace("http://", "");
        int inicio = url.indexOf(".");
        int fin = url.indexOf("/");
        return url.substring(inicio+1, fin);
        */
        //A lo bestia
        return url.substring(url.indexOf(".") + 1, url.substring(url.indexOf(".")).indexOf("/") + url.indexOf("."));
    }

    public static void leerYEscribirDominios() {
        try {
            // Variable para leer el fichero
            BufferedReader br = new BufferedReader(new FileReader("C:\\tmp_clase\\listaurls.txt"));
            // Variable para escribir en el fichero
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\tmp_clase\\listadominios.txt"));
            // Declaro la variable para guardar las líneas
            String linea;
            //Recorremos el fichero para leer las urls
            while ((linea = br.readLine())!=null) {
                //String dominio = extraerDominio(linea);
                //bw.write(dominio);
                // En la línea tengo guardada la url de la línea que acabo de leer
                // llamo a la función que extrae el dominio, y mediante el write lo escribo en el
                // fichero de destino.
                bw.write(extraerDominio(linea));
                bw.newLine();
            }
            bw.close();
            br.close();          
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /*
        64. Crear una función que valide un DNI o NIE válido (usar Pattern y expresión regular). 
        Leer de un fichero una lista de DNIs y NIEs y escribir en un fichero una lista de los válidos y una lista de los no válidos.
        Pattern DNI: en apuntes
        Pattern NIE: "^[XYZ]\\d{7}[A-Z]$"
        Pattern DNI o NIE "^[XYZ\\d]\\d{7}[A-Z]$"
     */
    //Vamos a crear tres funciones básicas que nos dicen si una cadena es un dni o un nie válido
    private static Boolean esDNI(String dni) {
        //Código
        return true;
    }

    private static Boolean esNIE(String nie) {
        //Código
        return true;
    }

    private static Boolean esDNIE(String dnie) {
        //Código
        return true;
    }

    //Ahora vamos a crear una función que lee un fichero, comprueba si los
    //elementos leidos son DNI o NIE básicos, y escribe un fichero con el resultado
    public static void tratarDNIEs() {
        //Código

    }
    
    
    /*
    65.- Procesar nombres desde un fichero de texto: 
    Crear un archivo de texto llamado nombres.txt que contenga, uno por línea, nombres de personas con espacios y letras en mayúsculas/minúsculas desordenadas.
    Leer el contenido del archivo.
    Limpiar cada línea: Eliminar espacios al principio y al final. Convertir a mayúsculas solo la primera letra y el resto a minúsculas.
    Guardar los nombres procesados en un nuevo archivo llamado nombres_limpios.txt.
    */
    
    public static String limpiaNombre(String nombre) {
        //Código
        return "";
    }
    
    public static void limpiarNombres() {
        //Código

    }
    
    
    /*
    72.- Dado el fichero con el contenido de un libro, quiero sacar a otro fichero todas las frases 
    que están entre exclamaciones de abrir y de cerrar. Por ejemplo, para el texto 
    "Vamos a extraer ¡todas! las palabras que estén ¡entre exclamaciones! para poder sacar ¡un maldito 10!" 
    escribiremos en otro fichero todas estas frases en mayúsculas, como si estuviéramos gritando, cada una en una línea. 
    */
    
    public static void exclamativa() {
        //Código

    }
    
    public static ArrayList<String> extraerExclamaciones(String cadena){
        ArrayList<String> resultado = new ArrayList<>();
        //Código
        return resultado;
    }

    /*
        Examen 2ºEval, Ejercicio 1
    */
    
    public static String cambiaExt(String ext, String cadena) {
        //Código
        return "";
    }
    
    public static void examen2_1(){
    //Código

    }
    
    /*
        Examen 2ºEval, Ejercicio 2
    */
    
    public static String generarUsuario(String nombre, ArrayList<String> comprobar) {
        //Código
        return "";
    }
    
    public static void examen2_2(){ 
        //Código
    }

    /**
     * Función que realiza la contabilidad a partir
     * de un fichero csv con el siguiente formato:
     * 
     * Enero,2500,-1200,3100,-800,400,-200,1500,-700,2200,-1300,900,-400,1800,-600,2750,-950
     * Febrero,2800,-1400,3200,-900,500,-300,1600,-750,2300,-1350,1000,-450,1900,-650,2850,-1000
     */
    
    public static void contabilidad(){
        try{
            //Declaramos las variables
            BufferedReader br = new BufferedReader(new FileReader("c:\\tmp_clase\\contaplus26.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\tmp_clase\\contaplus26_balance.txt"));
            String linea = ""; //Va a almacenar cada linea de lectura del fichero original
            int totalIngresos = 0;
            int totalGastos = 0;
            //Tuneamos el fichero
            bw.write(" ############## CONTABILIDAD 2026 ##############");
            bw.newLine();
            bw.write(" ###############################################");
            bw.newLine();
            //Empezamos a leer 
            while ((linea = br.readLine()) != null) {
                //variables para calcular los gastos e ingresos parciale del mes
                int ingresoMes = 0;
                int gastoMes = 0;
                //procesamos los datos, que están separados por ','
                String[] datos = linea.split(",");
                bw.newLine();
                //Escribimos el nombre del mes, que está 
                bw.write("---- "+datos[0]+" ----");
                bw.newLine();
                //Recorremos los datos que contienen las cantidades
                for (int i = 1; i < datos.length; i++) {
                    int num = Integer.parseInt(datos[i]);
                    if (num > 0) ingresoMes+= num;
                    else gastoMes += num;
                }
                totalIngresos += ingresoMes;
                totalGastos += gastoMes;
                bw.write("Ingresos: "+ingresoMes+"€");
                bw.newLine();
                bw.write("Gastos: "+gastoMes+"€");
                bw.newLine();
                bw.write("----------------");
                bw.newLine();
                bw.write("Balance: "+(ingresoMes+gastoMes)+"€");
                bw.newLine();
            }
            bw.write("----------------------------");
            bw.newLine();
            bw.write("----- ANUAL -----");
            bw.newLine();
            bw.write("Ingresos: "+totalIngresos+"€");
            bw.newLine();
            bw.write("Gastos: "+totalGastos+"€");
            bw.write("----------------------------");
            bw.newLine();
            bw.write("Balance: "+(totalIngresos+totalGastos)+"€");
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}














