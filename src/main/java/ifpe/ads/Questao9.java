package ifpe.ads;

// Questão 09: Escreva um programa que leia uma palavra e mostre a quantidade de
// vogais da palavra.

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String palavra;
        int contador = 0;

        System.out.print("Digite uma palavra: ");
        palavra = ler.next();
        palavra = palavra.toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("A palavra digitada possui " + contador + " vogais.");

        ler.close();

    }
}
