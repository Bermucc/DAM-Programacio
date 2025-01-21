package com.exercici0908;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



/*
 * Podrías usar un ArrayList para representar las filas y un HashMap 
 * dentro de cada fila para almacenar las columnas.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // Lista que almacenara las filas de la tabla
        ArrayList<HashMap<String,Object>> tabla = new ArrayList<>();
        
        // Creamos primera fila con HashMap
        HashMap<String,Object> fila1 = new HashMap<>();
        fila1.put("Nom", "Albert Einstein");
        fila1.put("Pais" , "Alemanya/Suissa");
        fila1.put("Disciplina" , "Fisica");
        fila1.put("Nobel" , "Si");
        fila1.put("Naixement", 1879);

        // Creamos segunda fila con HashMap
        HashMap<String,Object> fila2 = new HashMap<>();
        fila2.put("Nom", "Marie Curie");
        fila2.put("Pais" , "Polonia/França");
        fila2.put("Disciplina" , "Fisica/Quimica");
        fila2.put("Nobel" , "Si");
        fila2.put("Naixement", 1867);

        // Creamos tercera con HashMap
        HashMap<String,Object> fila3 = new HashMap<>();
        fila3.put("Nom", "Isaac Newton");
        fila3.put("Pais" , "Anglaterra");
        fila3.put("Disciplina" , "Física/Matematiques");
        fila3.put("Nobel" , "No");
        fila3.put("Naixement", 1643);

        // Creamos cuarta fila con HashMap
        HashMap<String,Object> fila4 = new HashMap<>();
        fila4.put("Nom", "Charles Darwin");
        fila4.put("Pais" , "Anglaterra");
        fila4.put("Disciplina" , "Anglaterra");
        fila4.put("Nobel" , "No");
        fila4.put("Naixement", 1809);

        // Creamos quinta fila con HashMap
        HashMap<String,Object> fila5 = new HashMap<>();
        fila5.put("Nom", "Alan Turing");
        fila5.put("Pais" , "Anglaterra");
        fila5.put("Disciplina" , "Matematiques/Infor.");
        fila5.put("Nobel" , "No");
        fila5.put("Naixement", 1912);

        // Agregamos las filas a la Arraylist

        tabla.add(fila1);
        tabla.add(fila2);
        tabla.add(fila3);
        tabla.add(fila4);
        tabla.add(fila5);

        // Imprimir la tabla en buen formato
        imprimirTabla(tabla);

        menuTabla(scanner, tabla);
    }

    public static void imprimirTabla(ArrayList<HashMap<String, Object>> tabla){
        //Imprimir cabecera
        System.out.println("| Nom               | Pais            | Disciplina          | Nobel  | Naixement|");
        System.out.println("|-------------------------------------------------------------------------------|");

        // Imprimir las filas
        for (HashMap<String, Object> fila : tabla) {
            String nom = (String) fila.get("Nom");
            String pais = (String) fila.get("Pais");
            String disciplina = (String) fila.get("Disciplina");
            String nobel = (String) fila.get("Nobel");
            Integer naixement = (Integer) fila.get("Naixement");

            // Imprimir la fila de datos (estructurado)
            System.out.printf("| %-17s | %-15s | %-19s | %-6s | %-9d|\n", nom,pais,disciplina,nobel,naixement);
        }

    }

    public static void menuTabla(Scanner scanner, ArrayList<HashMap<String, Object>> tabla) {
        String opt = "";

        do { 
            System.out.print("Que vols fer: ");
            opt = scanner.nextLine().toLowerCase().trim();

                switch (opt) {
                    case "ordenar nom":
                        mostrarTablaOrdenadaNombre(tabla);
                        break;
                    case "ordenar pais":
                        mostrarTablaOrdenadaPais(tabla);
                        break;
                    case "ordenar disciplina":
                        mostrarTablaOrdenadaDisciplina(tabla);
                        break;
                    case "ordenar naixement":
                        mostrarTablaOrdenadaNaixement(tabla);
                        break;
                    case "ordenar nom inv":
                        mostrarTablaOrdenadaNomInvertido(tabla);
                        break;
                    case "ordenar pais inv":
                        mostrarTablaOrdenadaPaisInvertido(tabla);
                        break;
                    case "ordenar disciplina inv":
                        mostrarTablaOrdenadaDisciplinaInvertido(tabla);
                        break;
                    case "ordenar naixement inv":
                        mostrarTablaOrdenadaNaixementInvertido(tabla);
                        break;
                    case "sortir":
                        System.out.println("Sortint...");
                        break;
                    default:
                        System.out.println("Opcio no valida.");
                        break;
                }

                imprimirTabla(tabla);
            
        } while (true);
    }

    // ORDENAR POR NOMBRE ALFABETICAMENTE
    public static void mostrarTablaOrdenadaNombre(ArrayList<HashMap<String, Object>> tabla) {
        tabla.sort((fila1, fila2) -> { 
            String valor1 = (String) fila1.get("Nom");
            String valor2 = (String) fila2.get("Nom");
            return valor1.compareTo(valor2);
        });
    }

    // ORDENAR POR PAIS ALFABETICAMENTE
    public static void mostrarTablaOrdenadaPais(ArrayList<HashMap<String, Object>> tabla) {
        tabla.sort((fila1, fila2) -> { 
            String valor1 = (String) fila1.get("Pais");
            String valor2 = (String) fila2.get("Pais");
            return valor1.compareTo(valor2);
        });
    }

    //ORDENAR POR DISCIPLINA ALFABETICAMENTE
    public static void mostrarTablaOrdenadaDisciplina(ArrayList<HashMap<String, Object>> tabla) {
        tabla.sort((fila1, fila2) -> { 
            String valor1 = (String) fila1.get("Disciplina");
            String valor2 = (String) fila2.get("Disciplina");
            return valor1.compareTo(valor2);
        });
    }

    // ORDENAR POR NAIXEMENT NUMERICAMENTE
    public static void mostrarTablaOrdenadaNaixement(ArrayList<HashMap<String,Object>> tabla) {
        tabla.sort((fila1, fila2) -> {
            Integer valor1 = (Integer) fila1.get("Naixement");
            Integer valor2 = (Integer) fila2.get("Naixement");
            return valor1.compareTo(valor2);
        });
    }

    // ORDENAR POR NOMBRE INVERSION 
    public static void mostrarTablaOrdenadaNomInvertido(ArrayList<HashMap<String,Object>> tabla) {
        tabla.sort((fila1, fila2) -> {
            String valor1 = (String) fila1.get("Nom");
            String valor2 = (String) fila2.get("Nom");

            return valor2.compareTo(valor1);
        });
    }

    // ORDENAR POR PAIS INVERSION 
    public static void mostrarTablaOrdenadaPaisInvertido(ArrayList<HashMap<String,Object>> tabla) {
        tabla.sort((fila1, fila2) -> {
            String valor1 = (String) fila1.get("Pais");
            String valor2 = (String) fila2.get("Pais");

            return valor2.compareTo(valor1);
        });
    }

    // ORDENAR POR DISCIPLINA INVERSION 
    public static void mostrarTablaOrdenadaDisciplinaInvertido(ArrayList<HashMap<String,Object>> tabla) {
        tabla.sort((fila1, fila2) -> {
            String valor1 = (String) fila1.get("Disciplina");
            String valor2 = (String) fila2.get("Disciplina");

            return valor2.compareTo(valor1);
        });
    }

    // ORDENAR POR NAIXEMENT INVERSION 
    public static void mostrarTablaOrdenadaNaixementInvertido(ArrayList<HashMap<String,Object>> tabla) {
        tabla.sort((fila1, fila2) -> {
            Integer valor1 = (Integer) fila1.get("Naixement");
            Integer valor2 = (Integer) fila2.get("Naixement");

            return valor2.compareTo(valor1);
        });
    }

}
