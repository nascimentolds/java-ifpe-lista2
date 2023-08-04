package ifpe.ads;

// Questão 08: Escreva um programa que conte o número de letras de uma frase
// informada pelo usuário.

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String frase;

        System.out.println("Digite uma frase: ");
        frase = ler.nextLine();

        System.out.printf("A frase tem %d letras.", frase.length());
    }
}
