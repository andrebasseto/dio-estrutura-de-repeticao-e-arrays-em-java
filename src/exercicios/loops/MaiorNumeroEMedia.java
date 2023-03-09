package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class MaiorNumeroEMedia {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maior = 0;
        int contador = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();

            soma = soma + numero;

            if (contador == 0) {
                maior = numero;
            } else if (numero > maior) {
                maior = numero;
            }

            contador++;
        } while (contador < 5);

        System.out.println("Media: " + soma / 5);
        System.out.println("Maior " + maior);
    }
}
