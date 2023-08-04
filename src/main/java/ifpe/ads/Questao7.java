package ifpe.ads;

// Questão 07: Escreva um programa que inverta uma frase informada pelo usuário e
// mostre na tela.


import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String frase;

        System.out.println("Digite uma frase: ");
        frase = ler.nextLine();

        for(int i = frase.length()-1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
    }
}
