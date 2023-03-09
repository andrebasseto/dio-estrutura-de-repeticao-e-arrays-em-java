package exercicios.loops;

import java.util.Scanner;

/*
 * escreve um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario
 * Ex: 5! = 120
 */

public class Fatorial {
    public static void main(String[] args) {
        
        int fatorial;
        int multiplicacao = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fatorial: ");
        fatorial = scanner.nextInt();

        for(int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);

    }
}
