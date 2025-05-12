package conversor;

import java.util.Scanner;

public class Menu {
    private final ConversorMoeda conversor;
    private final Scanner scanner;

    public Menu() {
        this.conversor = new ConversorMoeda();
        this.scanner = new Scanner(System.in);
    }

    public void exibir() {
        String[][] opcoes = {
                {"USD", "BRL"},
                {"BRL", "USD"},
                {"EUR", "BRL"},
                {"BRL", "EUR"},
                {"USD", "EUR"},
                {"EUR", "USD"}
        };

        while (true) {
            System.out.println("\n*************** Conversor de Moedas ***************");
            System.out.println("\nEscolha uma opção:");
            for (int i = 0; i < opcoes.length; i++) {
                System.out.printf("%d - %s → %s%n", i + 1, opcoes[i][0], opcoes[i][1]);
            }
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) break;

            if (opcao < 1 || opcao > opcoes.length) {
                System.out.println("Opção inválida.");
                continue;
            }

            String origem = opcoes[opcao - 1][0];
            String destino = opcoes[opcao - 1][1];

            System.out.printf("Digite o valor Sem casas decimais em %s: ", origem);
            double valor = scanner.nextDouble();

            try {
                double convertido = conversor.converter(origem, destino, valor);
                System.out.printf("%.2f %s = %.2f %s%n", valor, origem, convertido, destino);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
