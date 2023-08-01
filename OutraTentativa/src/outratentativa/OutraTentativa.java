
package outratentativa;

import java.util.Scanner;

interface Classificavel {
    boolean menorElemento(Classificavel obj);
}

class Classificador {
    public void ordena(Classificavel[] a) {
        Classificavel elem, menor;
        int pos;
        
        for (int i = 0; i < a.length - 1; i++) {
            elem = a[i];
            menor = a[i+1];
            pos = i+1;
            
            for (int j = i + 2; j < a.length; j++) {
                if (a[j].menorElemento(menor)) {
                    menor = a[j];
                    pos = j;   
                }
            }
            if (menor.menorElemento(elem)) {
                a[i] = a[pos];
                a[pos] = elem;
            }
        }
    }
}

class Produto implements Classificavel {

    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public boolean menorElemento(Classificavel obj) {
        Produto compara = (Produto) obj;
        return this.codigo < compara.codigo;
    }
    
    @Override
    public String toString() {
        return this.codigo + " " + this.nome + " " + this.preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }   
}

class Cliente implements Classificavel {

    private String cpf, nome, endereço;

    public Cliente(String nome, String cpf, String endereço) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
    }
    
    @Override
    public boolean menorElemento(Classificavel obj) {
        Cliente compara = (Cliente) obj;
        int comparaNome = this.nome.compareTo(compara.nome);
        return comparaNome < 0;    
    }
    
    @Override
    public String toString() {
        return this.cpf + " " + this.nome + " " + this.endereço;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }   
}

class Servico implements Classificavel {

    private double preço;
    private String data, tipoServico;

    public Servico(double preço, String data, String tipoServico) {
        this.preço = preço;
        this.data = data;
        this.tipoServico = tipoServico;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        Servico compara = (Servico) obj;
        return this.preço < compara.preço;   
    }
    @Override
    public String toString() {
        return this.tipoServico + " " + this.preço + " " + this.data;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }
}

public class OutraTentativa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] dadosInteiros = input.nextLine().split(" ");
        int numProdutos = Integer.parseInt(dadosInteiros[0]);
        int numClientes = Integer.parseInt(dadosInteiros[1]);
        int numServicos = Integer.parseInt(dadosInteiros[2]);

        Classificavel[] produtos = lerProdutos(input, numProdutos);
        Classificavel[] clientes = lerClientes(input, numClientes);
        Classificavel[] servicos = lerServicos(input, numServicos);

        Classificador classifica = new Classificador();
        classifica.ordena(produtos);
        classifica.ordena(clientes);
        classifica.ordena(servicos);
            
        exibirElementosOrdenados(produtos);
        exibirElementosOrdenados(clientes);
        exibirElementosOrdenados(servicos);
    }


    public static Classificavel[] lerProdutos(Scanner scanner, int numProdutos) {
        Classificavel[] produtos = new Classificavel[numProdutos];
        for (int i = 0; i < numProdutos; i++) {
            String[] dadosProdutos = scanner.nextLine().split(" ");
            produtos[i] = new Produto(Integer.parseInt(dadosProdutos[0]), dadosProdutos[1], Double.parseDouble(dadosProdutos[2]));
        }
        return produtos;
    }

    public static Classificavel[] lerClientes(Scanner scanner, int numClientes) {
        Classificavel[] clientes = new Classificavel[numClientes];
        for (int i = 0; i < numClientes; i++) {
            String[] dadosClientes = scanner.nextLine().split(" ");
            clientes[i] = new Cliente(dadosClientes[1], dadosClientes[0], dadosClientes[2]);
        }
        return clientes;
    }

    public static Classificavel[] lerServicos(Scanner scanner, int numServicos) {
        Classificavel[] servicos = new Classificavel[numServicos];
        for (int i = 0; i < numServicos; i++) {
            String[] dadosServicos = scanner.nextLine().split(" ");
            servicos[i] = new Servico(Double.parseDouble(dadosServicos[1]), dadosServicos[2], dadosServicos[0]);
        }
        return servicos;
    }

    public static void exibirElementosOrdenados(Classificavel[] elementos) {
        for (Classificavel elemento : elementos) {
            System.out.println(elemento.toString());
        }
    }
}