package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<Conta>contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes(){
        System.out.println("------------------------------------------------------");
        System.out.println("---------------Bem vindos a nossa Agência-------------");
        System.out.println("------------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|    Opção 1 - Criar conta                           |");
        System.out.println("|    Opção 2 - Depositar                             |");
        System.out.println("|    Opção 3 - Sacar                                 |");
        System.out.println("|    Opção 4 - Transferir                            |");
        System.out.println("|    Opção 5 - Listar                                |");
        System.out.println("|    Opção 6 - Sair                                  |");
        System.out.println("Digite a opção desejada: ");
        int operacao = sc.nextInt();
        switch (operacao){
            case 1:
                criarConta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                transferir();
                break;
            case 5:
                listar();
                break;
            case 6:
                System.out.println("Operação finalizada");
                System.exit(0);
            default:
                System.out.println("Opção Invalida!");
                operacoes();
                break;

        }
    }
    
    public static void criarConta() {
        sc.nextLine();
        System.out.println("Nome: ");

        String nome = sc.nextLine();

        System.out.println("Cpf: ");
        String cpf = sc.nextLine();

        System.out.println();

        System.out.println("Email: ");
        String email = sc.nextLine();
        
        Pessoa pessoa1 = new Pessoa(nome, cpf, email);
        
        Conta conta1 = new Conta(pessoa1);
        contasBancarias.add(conta1);
        System.out.println("Conta criada com sucesso! ");
        
        operacoes();
    }
    
    private static Conta encontrarConta(int numeroConta){
        Conta conta = null;
        if (contasBancarias.size() > 0){
            for(Conta c: contasBancarias){
                if (c.getNumeroconta() == numeroConta){
                    conta = c;
                }
            }
        }
        return conta;
    }
    
    public static void depositar(){
        System.out.println("Qual o numero da conta?");
        int numeroConta = sc.nextInt();
        
        Conta conta = encontrarConta(numeroConta);
        
        if (conta != null){
            System.out.println("Valor a ser depositado: ");
            double valorDeposito = sc.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("Deposito Realizado!");
        }else {
            System.out.println("Não foi possivel realizar o deposito");
            System.out.println("Erro: conta não enontrada \uD83D\uDE15");
        }
        operacoes();
        
    }

    public static void sacar(){
        System.out.println("Qual o numero da conta?");
        int numeroConta = sc.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if (conta != null){
            System.out.println("Valor a ser sacado: ");
            double valorSaque = sc.nextDouble();
            conta.sacar(valorSaque);
        }else {
            System.out.println("Não foi possivel realizar o Saque");
            System.out.println("Erro: conta não enontrada \uD83D\uDE15");
        }
        operacoes();
    }

    public static void transferir(){
        System.out.println("Conta remetente: ");
        int numeroContaRemetentente = sc.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetentente);

        if (contaRemetente != null){
            System.out.println("Numero da conta destinatário: ");
            int numeroContaDestinatario = sc.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if (contaDestinatario != null){
                System.out.println("Digite o valor da transferencia: ");
                double valor = sc.nextDouble();

                contaRemetente.transferir(contaDestinatario, valor);
            }
        }
        operacoes();
    }
    public static void listar(){
        if (contasBancarias.size() > 0){
            for (Conta conta: contasBancarias){
                System.out.println(conta);
            }
        }else {
            System.out.println("A lista de contas está vazia!!!!");
        }
        operacoes();
    }

}