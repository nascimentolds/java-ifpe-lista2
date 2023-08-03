package ifpe.ads;

// Questão 05: Escreva um programa que leia o nome de X pessoas. Após ler todos os
// nomes, pergunte ao usuário o nome que ele deseja consultar e verifique se este nome
// consta na lista.
// Obs.: O número de pessoas deve ser determinado pelo usuário.

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos nomes deseja inserir? ");
        int numPessoas = ler.nextInt();

        String[] pessoas = new String[numPessoas];

        for(int i = 0; i < numPessoas; i++) {
            System.out.printf("Digite o nome da %dº pessoa: ", i+1);
            pessoas[i] = ler.next();
        }

        for(String v : pessoas) {
            System.out.println(v);
        }

        System.out.println("-------------------------------");
        System.out.println("Qual nome deseja localizar? ");
        String nome = ler.next();

        System.out.println("-------------------------------");

        boolean encontrado = false;
        for(String v : pessoas) {
            if (v.equals(nome)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.printf("O nome '%s' foi encontrado.", nome);
        } else {
            System.out.printf("O nome '%s' não foi encontrado.", nome);
        }
    }
}
