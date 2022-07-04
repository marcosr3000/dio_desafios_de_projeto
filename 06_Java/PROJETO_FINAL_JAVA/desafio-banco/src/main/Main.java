package main;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cliente marcos = new Cliente();
        System.out.println("Digite o nome do cliente:");
        marcos.setNome(scan.next());

        System.out.println("Digite o valor que quer depositar na sua Conta Corrente:");
        double dinheiroDepositar = scan.nextDouble();

        Conta cc = new ContaCorrente(marcos);
        cc.depositar(dinheiroDepositar);

        System.out.println("Digite o valor que quer transferir para sua Conta Poupança:");
        double dinheiroTranferir = scan.nextDouble();

        Conta poupanca = new ContaPoupanca(marcos);
        cc.transferir(dinheiroTranferir, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
