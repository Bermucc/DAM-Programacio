package com.exercici0905;

import java.util.ArrayList;
import java.util.Random;


/*
 * Fes un programa que simuli una partida entre en Pau i la Paz

    Tiren una moneda a l'aire i guanya el primer que treu tres cops cara

    A cada tirada es mostra, segons correspon:

    En Pau ha tret cara (2), la Paz ha tret cara (1)
 */

public class Main {
    public static void tirarMoneda(String[] args) { 
        Random random = new Random();
        ArrayList listaPau = new ArrayList<>();
        ArrayList listaPaz = new ArrayList<>();

        int pau = 0;
        int paz = 0;
        String result = "";
        

        

        while (pau < 3 || paz < 3){
            int dadoPau = random.nextInt(2)+ 1; //Tirada de dados entre 1 y 2 (Pau)
            int dadoPaz = random.nextInt(2)+ 1; //Tirada de dados entre 1 y 2 (Paz)

            if (dadoPau == 1) {
                pau += 1;
                System.out.println("En Pau ha tret cara " + pau);
                listaPau.add("cara");
            } else {
                System.out.println("En Pau ha tret creu " + pau);
                listaPau.add("creu");
            }

            if (dadoPaz == 1) {
                paz += 1;
                System.out.println("La Paz ha tret cara " + paz);
                listaPaz.add("cara");
            } else {
                System.out.println("La Paz ha tret creu " + paz);
                listaPaz.add("creu");
            }

            if (pau == 3) {
                System.out.println("Ha guanyat el Pau!");
                break;
            }
            if (paz == 3) {
                System.out.println("Ha guanyat la Paz!");
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        
        tirarMoneda(args);
    }
}
