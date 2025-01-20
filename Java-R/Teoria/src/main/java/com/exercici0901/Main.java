package com.exercici0901;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void tiraMoneda(String[] args) {
        Random random = new Random();
        ArrayList lista = new ArrayList<>();


        String resultado = "";
        int tiradas = 3;
        int caras = 0;
        /*
         * [EXPLICACION]
         * Si queremos hacer que se repita tantas veces queramos utilizaremos el "for".
         * Los parametros que hemos puesto en el "for" son = 
         * "i" es igual a "0" , mientras "i" sea mas pequeño que "tiradas" se le sumara 1 a "i" (i++)
         */
        for (int i = 0; i < tiradas; i++) { 
            int selector = random.nextInt(2) + 1; // Es como una tirada de dados de (1) o (2)
            if (selector == 1){ // Si sale (1) es "cara" si sake (2) es "cruz"
                resultado = "cara";
                System.out.println(resultado);
                ++caras;
                lista.add("cara");
                
            } else {
                resultado = "creu";
                System.out.println(resultado);
                lista.add("creu");
            }
        }

        System.out.println("El resultat del llançament de les tres monedes es: "+"'"+lista.indexOf(0));
    }

    public static void main(String[] args) {
        
        tiraMoneda(args);
    }
}
