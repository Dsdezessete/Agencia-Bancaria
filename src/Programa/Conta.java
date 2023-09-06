package Programa;

import utilitarios.Utils;

public class Conta {

    private static int contadorDeContas = 0;
    private int numeroconta;
    private Pessoa pessoa;
    private double saldo = 0.0;

    public Conta(Pessoa pessoa) {
        this.numeroconta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas += 1;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return "Nome: "
                + this.pessoa.getNome()
                + ", Cpf: "
                + pessoa.getCpf()
                +", Email: "
                + pessoa.getEmail()
                + ", Numero da conta: "
                + getNumeroconta()
                + ", Saldo "
                + Utils.doubleToString(this.getSaldo());
    }
    public void depositar(double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado");
        }else{
            System.out.println("Não foi possivel realizar o deposito!");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque Realizado!");
        }else {
            System.out.println("Não foi possivel realizar o saque!");
        }
    }

    public void transferir(Conta contaParaDeposito, double valor){
        if (valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferencia Realizada!");
        }else {
            System.out.println("Não foi possivel realizar a transferencia!");
        }
    }
}
