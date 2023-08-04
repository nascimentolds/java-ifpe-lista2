package ifpe.ads;

// Questão 09: Escreva um programa que leia uma palavra e mostre a quantidade de
// vogais da palavra.

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] vogais = {"a", "e", "i", "o", "u"};
        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = ler.next();
        palavra = palavra.toLowerCase();

        for (int i = 0; i < vogais.length; i++) {
            if(palavra.contains(vogais[i])){
                System.out.println(i);
            }
        }

    }
}
