package ifpe.ads;

// Questão 03: Leia as notas de 10 alunos e armazene em um vetor. Calcule a media das
// notas informadas e mostre quantos alunos ficaram acima da média.

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int len = 10;
        double[] notas = new double[len];
        double soma = 0;
        double media;
        int acimaMedia = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota do aluno %d: ", i+1);
            notas[i] = ler.nextDouble();
        }

        for (double n : notas) {
            soma = soma + n;
        }

        media = soma / notas.length;

        for (double v : notas) {
            if (v > media) {
                acimaMedia++;
            }
        }

        System.out.println("--------------------------------");
        System.out.printf("%d alunos estão acima da média.", acimaMedia);
    }
}
