package exercicios.loops;

import java.util.Scanner;

/*
 * faça um programa que peça N numeros inteiros
 * calcule e mostre a quantidade de numeros pares
 * e a quatidade de numeros impares
 */
public class ParImpar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros;
        int contador = 0;
        int numero;
        int quantidadePar = 0;
        int quantidadeImpar = 0;

        System.out.println("Quantidade de numero: ");
        quantidadeNumeros = scanner.nextInt();

        do{
            System.out.println("Numero: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0){
                quantidadePar++;
            } else {
                quantidadeImpar++;
            }

            contador++;
        } while(contador < quantidadeNumeros);

        System.out.println("Quantidade de par: " + quantidadePar);
        System.out.println("Quantidade de impar: " + quantidadeImpar);
    }
}
