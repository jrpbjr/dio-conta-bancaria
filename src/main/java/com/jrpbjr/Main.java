package com.jrpbjr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("---------------CONTA BANCÁRIA---------------");
        System.out.println("");

        System.out.println("Por favor, digite o número da Conta: (1234)");
        numero = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do teclado

        System.out.println("Agora digite o número da Agência: (123-8)");
        agencia = sc.nextLine();
        if (!agencia.matches("\\d{3}-\\d")) {
            System.out.println("Formato de agência inválido! Tente novamente.");
            sc.close();
            return;
        }

        System.out.println("Me informe seu nome completo: ");
        nomeCliente = sc.nextLine();

        System.out.println("Agora me informe seu saldo atual (apenas valores positivos): ");
        while (true) {
            try {
                saldo = sc.nextDouble();
                if (saldo < 0) {
                    System.out.println("Saldo não pode ser negativo. Tente novamente.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente com um valor numérico.");
                sc.next(); // Limpa a entrada incorreta
            }
        }

        System.out.println("");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.\n"
                        + "Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                nomeCliente, agencia, numero, saldo);
        sc.close();
    }
}

