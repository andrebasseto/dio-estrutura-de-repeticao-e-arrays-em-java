package exercicios.arrays;

/*
 * Crie um vetor de 6 numeros inteiros
 * e mostre-os em ordem inversa
 */

public class OrdemInversa {

    public static void main(String[] args) {
        
        int[] vetor = {1, 2, 3, 4, 5, 6};
        int contador = 0;

        //System.out.println(vetor.length);

        /*
        while(contador <= vetor.length - 1){
            System.out.println(vetor[contador]);
            contador++;
        }
        */

        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }
}
