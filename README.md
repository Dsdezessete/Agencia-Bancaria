# 💰 Projeto: Agência Bancária

## Descrição

O projeto da Agência Bancária é uma aplicação Java que simula o funcionamento de uma agência bancária simples. Ele permite a criação de contas bancárias associadas a pessoas físicas (representadas pela classe `Pessoa`) e realiza operações bancárias básicas, como depósitos, saques e transferências.

## 📝Componentes Principais

1. **AgenciaBancaria (Classe Principal)**: Esta classe contém o método `main` e serve como ponto de entrada do programa. Ela apresenta um menu de operações que os usuários podem escolher, como criar uma conta, depositar, sacar, transferir e listar contas.

2. **Conta (Classe)**: Representa uma conta bancária e é associada a uma pessoa física (objeto da classe `Pessoa`). Esta classe possui métodos para realizar operações como depósito, saque e transferência, além de manter o saldo da conta.

3. **Pessoa (Classe)**: Representa uma pessoa física com atributos como nome, CPF e email. É usada para associar uma pessoa a uma conta bancária.

4. **Utils (Classe)**: Contém um método `doubleToString` que formata um valor double em uma representação de moeda brasileira (R$ #,##0.00).

## ⚙️Funcionamento

- Os usuários podem criar uma conta fornecendo informações pessoais como nome, CPF e email.
- Após a criação da conta, eles podem realizar operações como depósito, saque e transferência, informando o número da conta.
- O saldo da conta é mantido e atualizado de acordo com as operações realizadas.
- As contas bancárias são armazenadas em uma lista (`contasBancarias`) na classe `AgenciaBancaria`.
- Os resultados das operações e informações sobre as contas são exibidos no console.


