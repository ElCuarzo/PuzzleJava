import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    public static void main(String[] args) {
        // Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. Imprimir
        // la suma de todos los números en
        // el arreglo. El método también debe retornar un arreglo que incluya solo los
        // números que son mayores a 10
        // (Por ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con
        // los valores de 13,25,32).
        ArrayList<Integer> sumasArray = new ArrayList<Integer>();
        int[] array = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        int sumaArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumaArray += array[i];
            if (array[i] > 10) {
                sumasArray.add(array[i]);
            }
        }
        System.out.println(
                "La suma de los valores del array es: " + sumaArray + " | El array modificado es: " + sumasArray);

        // Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi,
        // Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona.
        // Haga que el método también devuelva un arreglo con los nombres que tienes más
        // de 5 caracteres.
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Nancy");
        nombres.add("Jinichi");
        nombres.add("Fujibayashi");
        nombres.add("Momochi");
        nombres.add("Ishikawa");

        Collections.shuffle(nombres);
        System.out.println("Los nombres mezclados: " + nombres);

        ArrayList<String> nombres5 = new ArrayList<String>();
        for (String nombre : nombres) {
            if (nombre.length() > 5) {
                nombres5.add(nombre);
            }
        }
        System.out.println("Los nombres con mas de 5 caracteres son: " + nombres5);

        // Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe
        // tener 26 valores). Mezcle el arreglo y, después de mezclarlo,
        // imprima la última letra del arreglo. También debe imprimir la primera letra
        // del arreglo. Si la primera letra del arreglo es una vocal,
        // haga que muestre un mensaje.
        char[] alfabeto = new char[26];
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            alfabeto[letra - 'A'] = letra;
        }
        List<Character> listaAlfabeto = new ArrayList<Character>();
        for (char letra : alfabeto) {
            listaAlfabeto.add(letra);
        }
        Collections.shuffle(listaAlfabeto);
        System.out.println(listaAlfabeto);
        System.out.println("La ultima letra es: " + listaAlfabeto.get(25));
        char primeraletra = listaAlfabeto.get(0);
        System.out.println("La primera letra es: " + primeraletra);
        if (esVocal(primeraletra)) {
            System.out.println("La primera letra del arreglo es una vocal! :)");
        } else {
            System.out.println("La primera letra del arreglo no es una vocal :(");
        }

        // Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100
        int[] numerosRandom = generarNumerosAleatorios(10, 55, 100);
        System.out.println("Los numeros que se han generado son: ");
        for (int numero : numerosRandom) {
            System.out.println(numero);
        }

        // Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y
        // hacer que estén ordenados
        // (mostrar el número más pequeño en el principio del arreglo). Imprimir todos
        // los números del arreglo. Luego, Imprimir el valor mínimo del arreglo,
        // así como el valor máximo.
        int[] numerosRandomV2 = generarNumerosAleatorios(10, 55, 100);
        Arrays.sort(numerosRandomV2);
        System.out.println("El arreglo de numeros aleatorios ordenados es: ");
        for (int numeros : numerosRandomV2) {
            System.out.println(numeros);
        }
        System.out.println("El valor minimo del arreglo es: " + numerosRandomV2[0]);
        System.out.println("El valor maximo del arreglo es: " + numerosRandomV2[numerosRandomV2.length - 1]);

        // Crear una cadena aleatoria con 5 caracteres de longitud.
        String cadenaAleatoria = generarCadena(5);
        System.out.println("La cadena aleatoria generada es: " + cadenaAleatoria);

        // Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de
        // longitud.
        String[] cadenasAleatorias = new String[10];
        for (int i = 0; i < cadenasAleatorias.length; i++) {
            cadenasAleatorias[i] = generarCadena(5);
        }
        System.out.println("El arreglo de cadenas aleatorias es: " + Arrays.toString(cadenasAleatorias));
    }

    public static String generarCadena(int longitud) {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rand = new Random();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int indice = rand.nextInt(caracteres.length());
            a.append(caracteres.charAt(indice));
        }
        return a.toString();
    }

    public static int[] generarNumerosAleatorios(int cantidad, int min, int max) {
        int[] numerosRandom = new int[cantidad];
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            numerosRandom[i] = rand.nextInt(max - min) + min;
        }
        return numerosRandom;
    }

    public static boolean esVocal(char letra) {
        letra = Character.toUpperCase(letra);
        return letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
    }
}
