
package empresas;

import java.util.Scanner;

class FolhaPagamento {

    public void mostrarPagamentos(String nome, String cidade, String mes, Funcionario funcionarios[]) {
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("Endereço: " + cidade);
        System.out.println("Mês: " + mes);
        System.out.println();
        
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
            System.out.println("Salário: R$" + funcionario.getSalario());

            if (funcionario instanceof Chefe) {
                Chefe chefe = (Chefe) funcionario;
                System.out.println("Departamento: " + chefe.getDepartamento());
                System.out.println("Cargo: chefe");
                System.out.println("");
            }
            if (funcionario instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) funcionario;
                System.out.println("Cargo: vendedor");
                System.out.println("Comissão por Venda: R$" + vendedor.getComissaoVenda());
                System.out.println("Número de Vendas: " + vendedor.getQuantidadeVendas());
                System.out.println("");
            } 
            if (funcionario instanceof Operario) {
                Operario operario = (Operario) funcionario;
                System.out.println("Cargo: Operário");
                System.out.println("Valor de Produção: R$" + operario.getValorProducao());
                System.out.println("Quantidade produzida: " + operario.getQuantidadeProduzida());
                System.out.println("");
            }
            if (funcionario instanceof Horista) {
                Horista horista = (Horista) funcionario;
                System.out.println("Cargo: horista");
                System.out.println("Valor por Hora: R$" + horista.getValorHora());
                System.out.println("Total de horas: " + horista.getTotalHoras());
                System.out.println("");
            } 
        }
    }
}

public class Empresas {

    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        String[] dadosEmpresa = entradas.nextLine().split("\\s");
        
        Funcionario[] funcionarios = new Funcionario[4];
        

        //Chefe(String nome, String dataNascimento, float salario, String departamento)
        String[] dadosChefe = entradas.nextLine().split("\\s");
        funcionarios[0] = new Chefe(dadosChefe[0], dadosChefe[1], Float.parseFloat(dadosChefe[2]), dadosChefe[3]);

        //Vendedor(String nome, String dataNascimento, float salario, float comissaoVenda, int quantidadeVendas)
        String[] dadosVendedor = entradas.nextLine().split("\\s");
        funcionarios[1] = new Vendedor(dadosVendedor[0], dadosVendedor[1], Float.parseFloat(dadosVendedor[2]), Float.parseFloat(dadosVendedor[3]), Integer.parseInt(dadosVendedor[4]));


        //Operario(String nome, String dataNascimento, float salario, float valorProducao, int quantidadeProduzida)
        String[] dadosOperario = entradas.nextLine().split("\\s");
        funcionarios[2] = new Operario(dadosOperario[0], dadosOperario[1], Float.parseFloat(dadosOperario[2]), Float.parseFloat(dadosOperario[3]), Integer.parseInt(dadosOperario[4]));


        //Horista(String nome, String dataNascimento, float salario, float valorHora, int totalHoras
        String[] dadosHorista = entradas.nextLine().split("\\s");
        funcionarios[3] = new Horista(dadosHorista[0], dadosHorista[1], Float.parseFloat(dadosHorista[2]), Float.parseFloat(dadosHorista[3]), Integer.parseInt(dadosHorista[4]));

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.mostrarPagamentos(dadosEmpresa[0], dadosEmpresa[1], dadosEmpresa[2], funcionarios);     
    }       
}  

class Funcionario {
    private String nome;
    private String dataNascimento;
    private float salario;
    
    public Funcionario(){}

    public Funcionario(String nome, String dataNascimento, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }       
}

class Chefe extends Funcionario {
    private String departamento;
    
    public Chefe(){}

    public Chefe(String nome, String dataNascimento, float salario, String departamento) {
        super(nome, dataNascimento, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }   
}

class Vendedor extends Funcionario {
    private float comissaoVenda;
    private int quantidadeVendas;
    
    public Vendedor() {}

    public Vendedor(String nome, String dataNascimento, float salario, float comissaoVenda, int quantidadeVendas) {
        super(nome, dataNascimento, salario = salario + (comissaoVenda * quantidadeVendas));
        this.comissaoVenda = comissaoVenda;
        this.quantidadeVendas = quantidadeVendas;
    }

    public float getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(float comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    } 
}

class Operario extends Funcionario {
    private float valorProducao;
    private int quantidadeProduzida;
    
    public Operario() {}

    public Operario(String nome, String dataNascimento, float salario, float valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, salario = valorProducao * quantidadeProduzida);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }   
}

class Horista extends Funcionario {
    private float valorHora;
    private int totalHoras;
    
    public Horista() {}

    public Horista(String nome, String dataNascimento, float salario, float valorHora, int totalHoras) {
        super(nome, dataNascimento, salario = valorHora * totalHoras);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }
}