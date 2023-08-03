package ifpe.ads;

// Questão 01: Escreva um programa que leia 10 números e armazene em um vetor. Em
// seguida, mostre a soma desses números.

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº valor: ", i+1);
            numeros[i] = ler.nextInt();
        }

        for (int v : numeros) {
           soma = soma + v;
        }

        System.out.printf("A soma dos valores é %d", soma);
    }
}
