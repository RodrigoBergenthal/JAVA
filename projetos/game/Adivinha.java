package game;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        System.out.println("vamos criar um jogo do numero Secreto");

        Scanner leitor = new Scanner(System.in);
        //Gera um número aleatório entre 0 e 100
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas ++;

            if (numeroDigitado == numeroGerado) {
                System.out.println(" Parabéns , você acertou o número em " + tentativas + "Tentativas!") ;
                break; // interrompe o loop while, boas práticas.
            }else if (numeroDigitado < numeroGerado) {
                System.out.println( " o numero digitado e menor que o numero Secreto");
            } else {
                System.out.println(" o numero digitado e maior que o numero Secreto");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado){
            System.out.println("Você não conseguiu acertar o número em 05 tentativas");
        }
    }
}
