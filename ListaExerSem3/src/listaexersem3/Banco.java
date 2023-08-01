
package listaexersem3;

import java.util.Scanner;

class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private int senha;

    public Conta(int numeroConta, String nomeCliente, double saldo, int senha) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean saque(double valorSaque, int senhaUsuario) {
        if (valorSaque > 0 && valorSaque < this.getSaldo() && senhaUsuario == this.senha) { 
            this.saldo = this.getSaldo() - valorSaque;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean deposito(double valorDeposito, int senhaUsuario) {
        if (valorDeposito > 0 && senhaUsuario == this.senha) {
            this.saldo = this.getSaldo() + valorDeposito;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean transferencia(double valorTransferencia, int senhaUsuario, Conta conta2) {
        if (valorTransferencia > 0 && valorTransferencia < this.getSaldo() && senhaUsuario == this.senha) {
            this.saldo = this.getSaldo() - valorTransferencia;
            conta2.saldo = conta2.getSaldo() + valorTransferencia;
            return true;
        }
        else {
            return false;
        }
    }
}

public class Banco {

    public static void main(String[] args) { 
        
        Scanner contas = new Scanner(System.in);
        String[] dadosConta1 = contas.nextLine().split("\\s");   
        String[] dadosConta2 = contas.nextLine().split("\\s");   
        Conta conta1 = new Conta(Integer.parseInt(dadosConta1[0]), dadosConta1[2], Double.parseDouble(dadosConta1[3]), Integer.parseInt(dadosConta1[1]));
        Conta conta2 = new Conta(Integer.parseInt(dadosConta2[0]), dadosConta2[2], Double.parseDouble(dadosConta2[3]), Integer.parseInt(dadosConta2[1]));
        
        boolean aux = true;
        while (aux) {
            int menu = contas.nextInt();
            switch (menu) {
                case 1:
                    int senhaUsuario = contas.nextInt();
                    if (senhaUsuario == Integer.parseInt(dadosConta1[1])) {
                        System.out.printf("%.2f", conta1.getSaldo());
                        break;
                    }
                    else {
                        System.out.println("senha incorreta");
                        break;
                    }
                case 2:
                    contas.nextLine();
                    String[] dadosSaque = contas.nextLine().split("\\s");
                    if (conta1.saque(Double.parseDouble(dadosSaque[0]), Integer.parseInt(dadosSaque[1]))) {
                        System.out.println("saque realizado");
                        break;
                    }
                    else {
                        System.out.println("saque não realizado");
                        break;
                    }
                case 3:
                    contas.nextLine();
                    String[] dadosDeposito = contas.nextLine().split("\\s");
                    if (conta1.deposito(Double.parseDouble(dadosDeposito[0]), Integer.parseInt(dadosDeposito[1]))) {
                        System.out.println("depósito realizado");
                        break;
                    }
                    else {
                        System.out.println("depósito não realizado");
                        break;
                    }
                case 4:
                    String nomeBeneficiario = contas.next();
                    if (nomeBeneficiario.equals(conta2.getNomeCliente())) {
                        String[] dadosTransferencia = contas.nextLine().split("\\s");
                        if (conta1.transferencia(Double.parseDouble(dadosTransferencia[0]), Integer.parseInt(dadosTransferencia[1]), conta2)){
                            System.out.println("transferência realizada");
                            break;
                        }
                        else {
                            System.out.println("transferência não realizada");
                            break;
                        }
                    }
                    else {
                        System.out.println("nenhum usuário encontrado");
                        break;
                    }
                case 5:
                    aux = false;
                    break;
            }
        }
    }
}
