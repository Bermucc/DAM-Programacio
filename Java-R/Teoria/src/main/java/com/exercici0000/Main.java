package com.exercici0000;

public class Main {
    public static void main(String[] args) {
        
        /* [APUNTES JAVA EXAMEN]

            [INDICE DE TEMARIO EXAMEN JAVA]

            [APUNTES DE JAVA ]

            * DAM-PROGRAMACIO (EXERCICI0000)

            [TABLA CON ARRAYLIST Y HASHMAP / DAM-PROGRAMACIO (EXERCICI0909)]

            * INPUTS ESCRIBIENDO "TEXTO" = DAM-PROGRAMACIO (EXERCICI0909)
            * ORDENAR POR NOMBRE = DAM-PROGRAMACIO (EXERCICI0909)
            * ORDENAR POR APELLIDO = DAM-PROGRAMACIO (EXERCICI0909)
            * ORDENAR POR TELEFONO = DAM-PROGRAMACIO (EXERCICI0909)
            * ORDENAR TODO INVERTIDO = DAM-PROGRAMACIO (EXERCICI0909)
            * FILTRAR = DAM-PROGRAMACIO (EXERCICI0909)
            * CREAR USUARIO NUEVO = DAM-PROGRAMACIO (EXERCICI0909)
            * BORRAR USUARIO = DAM-PROGRAMACIO (EXERCICI0909)
            * GENERAR ID = DAM-PROGRAMACIO (EXERCICI0909)

            [ EJERCICIOS LOGICOS ]

            * CALCULAR TARIFA = DAM-PROGRAMACIO (EXERCICI0904)
            * CALCULAR COSTE HABITACION (CON DESCUENTOS) = DAM-PROGRAMACIO (EXERCICI0903)

            [ EJERCICIOS RANDOM ]

            * TIRAR UNA MONEDA = DAM-PROGRAMACIO (EXERCICI0901)
            --------------------------------------------------------------------------------------

            [IMPORTS]

            - (Scanner) = import java.util.Scanner; --> Scanner scanner = new Scanner(System.in);
            - (HashMap) = import java.util.HashMap; -->
            - (ArrayList) = import java.util.ArrayList;
            - (HashSet) = import java.util.HashSet;
            - (Set) = import java.util.Set;
            - (Random) = import java.util.Random;
            - (Local) = import java.util.Locale; --> Locale localeUS = Locale.US; || Locale localeES = Locale.forLanguageTag("es")
            
            - (JSONArray) = import org.json.JSONArray;
            - (JSONObject) = import org.json.JSONObject;

            - (Paths) = import java.nio.file.Paths;
            - (LocalDate) = import java.time.LocalDate;
            - (DateTimeFormatter) = import java.time.format.DateTimeFormatter;
            - (Files) = import java.nio.file.Files;
            - (FileWriter) = import java.io.FileWriter;
            ---------------------------------------------------------------------------------------------------------------------------------------

            [TEXTOS]

            - Quitar espacios al principio y final = .trim();
            - Pasar la cadena a minusculas = .toLowerCase();
            - Convertir la primera letra en mayusculas = texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase(); || Ej: alex = Alex
            - Longitud = string.length();
            - Imprimir con decimales bien = System.out.printf(localeUS, "El valor de %.2f€ són %.2f$%n", euros, dollars);
            - Formato para una tabla = System.out.printf("%-6d| %-15s| %-20s| %-10d%n", valor, valor, valor , valor)
            ----------------------------------------------------------------------------------------------------------------------------------------

            [VERIFICADORES]

            - Si esta vacio = entrada.isEmpty();
            - Si la entrada tiene espacio = entrada.contains(" ");
            - Si tiene que tener unos numeros EXACTOS = entrada.matches("\\d{9}");
            - Si la entrada tiene que estar entre unos valores (0 y 20) = (num >= 0 && num <= 20);
            - Si la entrada que tiene NO EXISTE = (entrada == null);
            - Comparar Si es una cosa U otra = ||
            - Comparar Si una comple con la otra = &&
            ----------------------------------------------------------------------------------------------------------------------------------------

            [ITERAR UNA LISTA / ARRAY / ETC]

            - Para json = for (int i = 0; i < valor.length(); i++)
            - Para HashMap = for (int i = 0; i < valor.size(); i++)
            ----------------------------------------------------------------------------------------------------------------------------------------

            [JSON]

            SET-UP para que lea el archivo .json =

            String filePathPrestecs = "./src/main/json/prestecs.json";
            String contentPrestecs = new String(Files.readAllBytes(Paths.get(filePathPrestecs)));

            JSONArray jsonArrayPrestecs = new JSONArray(contentPrestecs);
            
            DAR FORMATO A LAS CLAVES DEL JSON

            int idUsuari = usuari.getInt("idUsuari");
            String nom = usuari.getString("nom");
            String cognoms = usuari.getString("cognoms");
            int telefon = usuari.getInt("telefon");
            ------------------------------------------------------------------------------------------------------------------------------------------

            [CREAR UN MENU]

            int optMain = 0;

            // MENÚ PRINCIPAL
            do {
                System.out.println("""
                    -- Gestio de biblioteca --
                    1. Llibres
                    2. Usuaris
                    3. Prestecs
                    0. Sortir
                    Escull una opcio: """);
                if (scanner.hasNextInt()) {
                    optMain = scanner.nextInt();

                    switch (optMain) {
                        case 1:
                            limpiarPantalla();
                            menuLibros(scanner);
                            break;
                        case 2:
                            limpiarPantalla();
                            menuUsuarios(scanner);
                            break;
                        case 3:
                            limpiarPantalla();
                            menuPrestecs(scanner);
                            break;
                        case 0:
                            limpiarPantalla();
                            break;
                        default:
                            System.out.println("Opcio no valida. Torna-ho a intentar.\n");
                    }
                } else {
                    System.out.println("Si us plau, ingressa un número valid.\n ");
                    scanner.next();
                    optMain = -1;
                }
            } while (optMain != 0);
        */
    }

    }

