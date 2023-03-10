package exercicios.arrays;

import java.util.Random;

/*
 * programa que leia 20 numeros aleatorios entre 0 e 100, armazene-os num vetor.
 * ao final mostre os numetos e seus sucessores
 */

public class NumerosAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        for (int i : numerosAleatorios) {
            System.out.print(i + " ");
        }

        System.out.println("\nSucessores");
        for (int i : numerosAleatorios) {
            System.out.print((i + 1) + " ");
        }
    }
}
