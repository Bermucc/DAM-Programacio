package com.exercici0906;

public class Main {

    public static String textTransform (String text, int ample) {

        // Si el texto es mas largo que la anchura lo cortamos
        if (text.length() > ample) {
            return text.substring(0, ample);
        }

        // Calcula los espacios de la izquierda y derecha
        int espaisEsquerra = (ample - text.length()) / 2;
        int espaisDreta = (ample - text.length() - espaisEsquerra);
        
        // Si el ancho es impar el texto se desplazara un caracter a la izquierda
        if (ample % 2 != 0) {
            espaisEsquerra++;
        }

        // Construim la cadena amb els espais a l'esquerra i a la dreta
        StringBuilder resultat = new StringBuilder();

        // Agregamos los espacios a la izquierda 
        for (int i = 0; i < espaisEsquerra; i++ ) {
            resultat.append(" ");
        }

        // Agregar el texto
        resultat.append(text);

        // Agrefamos los espacios a la derecha
        for (int i = 0; i < espaisDreta; i++) {
            resultat.append(" ");
        }

        return resultat.toString();
    }
    public static void main(String[] args) {
        
        String text = "Hola que tal";
        int ancho = 15;

        String textoCentrado = textTransform(text, ancho);

        System.out.println(textoCentrado);
    }
}
