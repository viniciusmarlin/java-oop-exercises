package conta_bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("*** Teste ContaBancaria ***");

            ContaBancaria contaSimples = new ContaBancaria();
            preencherConta(scanner, contaSimples);
            contaSimples.depositar(100);

            realizarSaque(contaSimples, 50);
            realizarSaque(contaSimples, 70);

            System.out.println(contaSimples);
            System.out.println("*** Teste ContaPoupança ***");

            ContaPoupanca contaPoupanca = new ContaPoupanca();
            preencherConta(scanner, contaPoupanca);
            contaPoupanca.setDiaRendimento(3);
            contaPoupanca.depositar(100);

            realizarSaque(contaPoupanca, 50);
            realizarSaque(contaPoupanca, 70);

            if (contaPoupanca.calcularNovoSaldo(0.5)) {
                System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
            } else {
                System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
            }

            System.out.println(contaPoupanca);
            System.out.println("*** Teste ContaEspecial ***");

            ContaEspecial contaEspecial = new ContaEspecial();
            preencherConta(scanner, contaEspecial);
            contaEspecial.setLimite(50);
            contaEspecial.depositar(100);

            realizarSaque(contaEspecial, 50);
            realizarSaque(contaEspecial, 70);
            realizarSaque(contaEspecial, 80);

            System.out.println(contaEspecial);
        }
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }

    private static void preencherConta(Scanner scanner, ContaBancaria conta) {
        conta.setNomeCliente(scanner.nextLine());
        conta.setNumConta(scanner.nextInt());
        scanner.nextLine();
    }
}
