package ifpe.ads;

// Questão 04: Escreva um programa que leia 10 números e
// mostre na tela números na ordem inversa.

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            numeros[i] = ler.nextInt();
        }

        for(int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
}
