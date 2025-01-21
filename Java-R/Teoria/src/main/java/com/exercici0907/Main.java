package com.exercici0907;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        
        int num = -1; // Siempre el valor por defecto de un valor debe de ser negativo para controlar la entrada

        while (num >= 5 || num <= 10) {
            System.out.println("Introdueix un numero entre (5 i 10)");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt(); // Guarda el numero de la variable
                System.out.println("Has escollit el " + num);
                
                if (num < 5 || num > 10) {
                    System.out.println("\nError, s'ha d'ingresar un numero entre (5 i 10)\n");
                }
            } else {
                System.out.println("\nError, s'ha dintroduir un valor valid\n");
                scanner.next();
            }
        }

        // Generamos el Array entre los valos 1000 i 9999
        int[] array = new int[num];
        array[] arrayMitad = new int[array];
        
        for (int i = 0; i < num; i++) {
            array[i] = 1000 + random.nextInt(9000); // Genera del 0 al 8999 y le suma 1000 para que incluya el 9999
        }

    }
}
