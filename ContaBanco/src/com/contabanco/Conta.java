package com.contabanco;

import java.util.logging.Logger;

public class Conta {
    private static final Logger logger = Logger.getLogger(Conta.class.getName());
    private String agencia;
    private int numeroConta;
    private String nomeCliente;
    private double saldo;

    public Conta(String agencia, int numeroConta, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void imprimirExtrato() {
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format(
                    "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                    nomeCliente, agencia, numeroConta, saldo));
        }
    }
}