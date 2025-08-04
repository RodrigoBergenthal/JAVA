package projetos.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Calculadora {
    private static List<String> historico = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== Calculadora Avançada ===");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potência");
            System.out.println("6. Raiz Quadrada");
            System.out.println("7. Ver Histórico");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine(); // Limpa o buffer
                continue;
            }

            if (opcao == 8) {
                executando = false;
                continue;
            }

            if (opcao == 7) {
                mostrarHistorico();
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = lerNumero(scanner);

            double num2 = 0;
            if (opcao != 6) { // Raiz quadrada não precisa de segundo número
                System.out.print("Digite o segundo número: ");
                num2 = lerNumero(scanner);
            }

            double resultado = 0;
            String operacao = "";

            try {
                switch (opcao) {
                    case 1:
                        resultado = num1 + num2;
                        operacao = num1 + " + " + num2 + " = " + resultado;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        operacao = num1 + " - " + num2 + " = " + resultado;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        operacao = num1 + " * " + num2 + " = " + resultado;
                        break;
                    case 4:
                        if (num2 == 0) throw new ArithmeticException("Divisão por zero");
                        resultado = num1 / num2;
                        operacao = num1 + " / " + num2 + " = " + resultado;
                        break;
                    case 5:
                        resultado = Math.pow(num1, num2);
                        operacao = num1 + " ^ " + num2 + " = " + resultado;
                        break;
                    case 6:
                        if (num1 < 0) throw new ArithmeticException("Raiz quadrada de número negativo");
                        resultado = Math.sqrt(num1);
                        operacao = "√" + num1 + " = " + resultado;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        continue;
                }
                System.out.println("Resultado: " + resultado);
                historico.add(operacao);
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static double lerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine(); // Limpa o buffer
            }
        }
    }

    private static void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Histórico vazio.");
        } else {
            System.out.println("\n=== Histórico de Cálculos ===");
            for (String calc : historico) {
                System.out.println(calc);
            }
        }
    }
}