package exercicios.loops;

import java.util.Scanner;

/*
 * desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer numero inteiro entre 1 e 10
 * o usuario deve informar de qual numero ele deseja ver a tabuada
 * a saida deve ser conforme o exemplo abaixo
 * 
 * tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * .....
 * 5 x 10 = 50
 */

public class Tabuada {

    public static void main(String[] args) {

        int numero;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para gerar a tabuada: ");
        numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }

}
