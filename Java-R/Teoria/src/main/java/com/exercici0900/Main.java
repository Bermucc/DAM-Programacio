package com.exercici0900;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // FUNCION DEL ANIGRAMA
    // ARRAY = LISTA (ALMACENA COSAS DE SU MISMO TIPO O CLASE)
    public static boolean isAnagrama(String palabra1, String palabra2){
        palabra1 = palabra1.trim().replaceAll("\\s+", "").toLowerCase(); //Elimina los TODOS los espacios en blanco.
        palabra2 = palabra2.trim().replaceAll("\\s+", "").toLowerCase();


        char[] palabraCadena1 = palabra1.toCharArray();  //Convierte la cadena en una lista de caracteres
        char[] palabraCadena2 = palabra2.toCharArray();

        Arrays.sort(palabraCadena1); //Ordena los caracteres en orden alfabetico
        Arrays.sort(palabraCadena2);

        /*Los "==" se utiliza para comparar entre referencias de objetos, no su contenido.
        Por eso si queremos comparar su contenido hay que utilizar el Arrays.equals()
        SIEMPRE SE ESCRIBE "Arrays" NO "Array"
        */

        return Arrays.equals(palabraCadena1,palabraCadena2);
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primera paraula: ");
        String palabra1Input = scanner.nextLine();

        System.out.println("Segona paraula:");
        String palabra2Input = scanner.nextLine();

        System.out.println("Son les paraules " +"'"+palabra1Input+"'"+" i "+"'"+palabra2Input+"'"+" anagrames?" +" " +isAnagrama(palabra1Input, palabra2Input));
        System.out.println("On "+palabra1Input+" i "+palabra2Input+" son les paraules d'entrada i " + isAnagrama(palabra1Input, palabra2Input) + " es 'True' o 'False'");
        scanner.close(); // Importante saber cuando cerrar el scanner.
    }
}
