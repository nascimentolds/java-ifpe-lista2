package ifpe.ads;

// Questão 06: Escreva um programa que leia dois vetores de 05 elementos cada. Após ler
// todos os elementos, verifique se os vetores são iguais e mostre na tela.

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        System.out.println("Elementos do primeiro vetor.");
        for(int i = 0; i < 5; i++) {
            System.out.printf("%d: ", i+1);
            vetor1[i] = ler.nextInt();
        }

        System.out.println("----------------------------");

        System.out.println("Elementos do segundo vetor.");
        for(int i = 0; i < 5; i++) {
            System.out.printf("%d: ", i+1);
            vetor2[i] = ler.nextInt();
        }

        ler.close();

        boolean saoIguais = true;

        for(int i = 0; i < 5; i++) {
            if(vetor1[i] != vetor2[i]) {
                saoIguais = false;
                break;
            }
        }

        System.out.println("----------------------------");
        if(saoIguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores não são iguais.");
        }
    }
}
