package com.exercici1301;

public class Main {

    public static void main(String[] args) {

        OcellVolador ocell = new OcellVolador("Piolín", 2, "groc");
        Dofi dofi = new Dofi("Flipper", 5, "suau");
    
        System.out.println(ocell);
        ocell.volar();
    
        System.out.println(dofi);
        dofi.nedar();
        
    }
}
