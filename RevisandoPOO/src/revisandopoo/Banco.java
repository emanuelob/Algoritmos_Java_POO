
package revisandopoo;

class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Método para mostrar status do objeto
    public void estadoAtual() {
        System.out.println("--------------------------------------------------");
        System.out.println("Conta: " + this.getNumConta() + ".");
        System.out.println("Tipo: " + this.getTipo() + ".");
        System.out.println("Dono: " + this.getDono() + ".");
        System.out.println("Saldo: " + this.getSaldo() + ".");
        System.out.println("Status: " + this.isStatus() + ".");
    }
  
    public void abrirConta(String t) { 
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if(this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda há dinheiro.");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débito.");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    } 
    
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono() + ".");
        }
        else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() <= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saldo realizado na conta de " + this.getDono() + ".");
            }
            else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }
        else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }
    
    public void pagarMensal() {
        int v;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else {
            v = 20;
        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono() + ".");
        }
        else {
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }
    
    //Métodos especiais
    public ContaBanco() { //Construtor
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 
}

//CLASSE PRINCIPAL
public class Banco {
    
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1111);
        conta1.setDono("Jubileu");
        conta1.abrirConta("CC");
        
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(2222);
        conta2.setDono("Creuza");
        conta2.abrirConta("CP");
        
        conta1.depositar(100);
        conta2.depositar(500);
        conta1.sacar(20);
        conta2.sacar(500);
        
        conta1.estadoAtual();
        conta2.estadoAtual();
    }
}