package junit;

import java.time.LocalDate;

public class Conta {

    protected String numeroConta;

    protected int saldo;

    public Conta(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}
