package com.exercici0909;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

        generaId(tabla); // IMPORTANTE PONERLO ARRIBA YA QUE LO LEE POR ORDEN DE LINEA

        // Imprimir la tabla en buen formato
        imprimirTabla(tabla);

        menuTabla(scanner, tabla);

        
    }

    public static void imprimirTabla(ArrayList<HashMap<String, Object>> tabla){
        //Imprimir cabecera
        System.out.println("|  ID  | Nom               | Pais            | Disciplina        | Nobel  | Naixement|");
        System.out.println("|------------------------------------------------------------------------------------|");

        // Imprimir las filas
        for (HashMap<String, Object> fila : tabla) {
            Integer id = (Integer) fila.get("ID");
            String nom = (String) fila.get("Nom");
            String pais = (String) fila.get("Pais");
            String disciplina = (String) fila.get("Disciplina");
            String nobel = (String) fila.get("Nobel");
            Integer naixement = (Integer) fila.get("Naixement");

            // Imprimir la fila de datos (estructurado)
            System.out.printf("| %-2d | %-17s | %-15s | %-19s | %-6s | %-9d|\n", id, nom,pais,disciplina,nobel,naixement);
        }

    }

    public static void menuTabla(Scanner scanner, ArrayList<HashMap<String, Object>> tabla) {
        String opt = "";

        do { 
            System.out.print("Que vols fer: ");
            opt = scanner.nextLine().toLowerCase().trim();

            if (opt.startsWith("afegir ")) {
                crearPersonaje(opt.substring(7), tabla);
            } else if (opt.startsWith("esborrar ")) {
                borrarPersonaje(opt.substring(9).trim(), tabla);
            } else if (opt.startsWith("filtrar ")) {
                String[] parts = opt.substring(8).split(" ", 2);
                if (parts.length == 2) {
                    String columna = parts[0].trim();
                    String valor = parts[1].trim().replaceAll("^\"|\"$", ""); // Elimina las comillas
                    filtrar(columna, valor, tabla);
                }
            }
            
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
                    case "ajuda":
                        menuAyuda();
                        break;
                    case "sortir":
                        System.out.println("Sortint...");
                        System.exit(0);
                    default:
                        System.out.println("Opcio no valida.");
                        break;
                }

                imprimirTabla(tabla);
            
        } while (true);
    }

    // Mostrar menu de ayuda
    public static void menuAyuda() {
        System.out.println("\n"+"""
            --- COMANDES PER UTILITZAR ---
            1. ordenar nom = (Ordena els noms alfabeticament)
            2. ordenar pais = (Ordena els paisos alfabeticament)
            3. ordenar disciplina = (Ordena la disciplines alfabeticament)
            4. ordenar naixement = (Ordena els naixements numericament)
            
            === Si vols ordenar a la inversa ==
            - Utilizta la mateixa comanda amb "inv" al final
            Exemple: ordenar nom inv
            ---------------------------------------------------------------
                """);
    }

    // Crear nuevo personaje
    public static void crearPersonaje(String dades, ArrayList<HashMap<String, Object>> tabla) {
        String[] parts = dades.split(",");

        if (parts.length != 5) {
            System.out.println("Error: El format ha de ser Nom,Pais,Disciplina,Nobel,Naixement");
            return;
        }

        try {
            HashMap<String, Object> novaFila = new HashMap<>();

            novaFila.put("Nom", capitalize(parts[0].trim()));
            novaFila.put("Pais", capitalize(parts[1].trim()));
            novaFila.put("Disciplina", capitalize(parts[2].trim()));
            novaFila.put("Nobel", capitalize(parts[3].trim()));
            novaFila.put("Naixement", Integer.parseInt(parts[4].trim()));

            tabla.add(novaFila);
            generaId(tabla);
            System.out.println("Nou personatge afegit amb exit");

        } catch (NumberFormatException e) {
            System.out.println("Error: L'any de naixement ha de ser enter.");
        }
    }

    // Funcion para volver la primera letra del string a mayusculas
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    // Funcion eliminar personaje 
    public static void borrarPersonaje(String nom, ArrayList<HashMap<String, Object>> tabla) {
        boolean encontrado = false;

        // Recorremos la tabla para buscar el personaje por su nombre
        for (int i = 0; i < tabla.size(); i++) {
            HashMap<String, Object> fila = tabla.get(i);
            if (fila.get("Nom").toString().equalsIgnoreCase(nom.trim())) {
                tabla.remove(i);
                encontrado = true;
                System.out.println("Personatge '" + nom + "' eliminat amb exit");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Error: No s'ha trobat cap personatge amb el nom '" + nom +"'");
        }
    }

    // Funcion filtrar
    public static void filtrar(String columna, String valor, ArrayList<HashMap<String, Object>> tabla) {
        boolean encontrado = false;
    
        String columnaNormalizada = capitalize(columna);
    
        System.out.println("Resultat del filtre: '" + columna + "' = '" + valor + "':");
        for (HashMap<String, Object> fila : tabla) {
            Object columnaValorObj = fila.get(columnaNormalizada);
            if (columnaValorObj != null) {
                String columnaValor = columnaValorObj.toString();
                if (columnaValor.equalsIgnoreCase(valor)) {
                    System.out.println(fila);
                    encontrado = true;
                }
            }
        }
    
        if (!encontrado) {
            System.out.println("No s'ha trobat cap registre que coincideixi amb el filtre.");
        }
    }
    

    // Crear una id entre el 10 i 99 para las personas
    public static void generaId(ArrayList<HashMap<String, Object>> tabla) {
        Set<Integer> idsGenerados = new HashSet<>();

        for(HashMap<String, Object> fila : tabla) {
            int id;
            do { 
                id = (int) (Math.random() * 90) + 10; // Genera un ID entre 10 y 99
            } while (idsGenerados.contains(id));

            idsGenerados.add(id);
            fila.put("ID" , id);
         }
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

