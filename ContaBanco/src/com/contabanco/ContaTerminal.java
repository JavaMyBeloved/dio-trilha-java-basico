package com.contabanco;

import java.util.Scanner;
import java.util.logging.Logger;

public class ContaTerminal {
    private static final Logger logger = Logger.getLogger(ContaTerminal.class.getName());

    public static void main(String[] args) {

        /*
         * Crie o projeto ContaBanco que receberá dados via terminal contendo as
         * características de conta em banco conforme atributos abaixo:
         * Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a
         * codificação do nosso programa.
         * Permita que os dados sejam inseridos via terminal sendo que o usuário
         * receberá a mensagem de qual informação será solicitada, exemplo:
         * - Programa: "Por favor, digite o número da Agência !"
         * - Usuário: 1021 (depois ENTER para o próximo campo)
         * 
         * Depois de todas as informações terem sido inseridas, o sistema deverá exibir
         * a seguinte mensagem:
         * -
         * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
         * .
         * Os campos em [ ] devem ser alterados pelas informações que forem inseridas
         * pelos usuários.
         */

        Scanner scanner = new Scanner(System.in);
        logger.info("Por favor, digite o número da Agência:");

        String agencia = scanner.nextLine();
        logger.info("Por favor, digite o número da Conta:");

        int numeroConta = scanner.nextInt();
        logger.info("Por favor, digite o seu nome:");

        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        logger.info("Por favor, digite o saldo inicial:");
        
        double saldo = scanner.nextDouble();

        Conta conta = new Conta(agencia, numeroConta, nomeCliente, saldo);
        conta.imprimirExtrato();

        scanner.close();
    }
}
