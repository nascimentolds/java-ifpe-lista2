package ifpe.ads;

// Questão 02: Escreva um programa que leia 10 números e mostre as seguintes
// informações:
// a) Menor valor digitado
// b) Maior valor digitado
// c) Média dos valores digitados

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int len = 10;
        int[] valores = new int[len];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o %dº valor: ", i+1);
            valores[i] = ler.nextInt();
        }

        int soma = 0;
        double media;
        int menorValor = valores[0];
        int maiorValor = valores[0];

        for (int v : valores) {
            soma = soma + v;

            if (v < menorValor) {
                menorValor = v;
            }

            if (v > maiorValor) {
                maiorValor = v;
            }
        }

        media = (double) soma / valores.length;

        System.out.println("----------------------------");
        System.out.printf("O menor valor digitado é: %d \n", menorValor);
        System.out.printf("O maior valor digitado é: %d \n", maiorValor);
        System.out.printf("A média dos valores é: %f \n", media);

    }
}
