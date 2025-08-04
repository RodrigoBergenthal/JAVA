package game;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] perguntas = {
                "Qual é a capital do Brasil?",
                "Qual linguagem usamos neste código?",
                "Quantos planetas há no Sistema Solar?"
        };

        String[] respostas = {
                "Brasília",
                "Java",
                "8"
        };

        int pontos = 0;

        System.out.println("🎉 Bem-vindo ao Quiz dos Jovens Programadores!\n");

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + perguntas[i]);
            String respostaUsuario = leitor.nextLine();

            if (respostaUsuario.equalsIgnoreCase(respostas[i])) {
                System.out.println("✅ Correto!");
                pontos++;
            } else {
                System.out.println("❌ Errado. A resposta certa é: " + respostas[i]);
            }
            System.out.println(); // Espaço entre perguntas
        }

        System.out.println("🏆 Você acertou " + pontos + " de " + perguntas.length + " perguntas.");
    }
}