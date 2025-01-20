package com.exercici0900;

import java.util.Scanner;

public class Main {

    // FUNCION DEL ANIGRAMA
    public static boolean isAnagrama(String palabra1, String palabra2){
        palabra1.trim().replaceAll("\\s+", "");

        return false;
        

    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pon una palabra");
        String palabra1Input = scanner.nextLine();

        palabra1Input.trim();
        String resultado = palabra1Input.replaceAll("\\s+", ""); // Para quitar los espacios en blanco entre palabras
        System.out.println(resultado);
    }
}
