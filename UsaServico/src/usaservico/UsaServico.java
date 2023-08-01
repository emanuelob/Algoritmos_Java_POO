
package usaservico;

//import java.util.Arrays;
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
        return this.nome.compareTo(compara.nome) < 0;    
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

public class UsaServico {

    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);
        String[] dadosInteiros = entradas.nextLine().split("\\s");
        Classificavel[] produtos = new Classificavel[Integer.parseInt(dadosInteiros[0])];
        Classificavel[] clientes = new Classificavel[Integer.parseInt(dadosInteiros[1])];
        Classificavel[] servicos = new Classificavel[Integer.parseInt(dadosInteiros[2])];

        
        for (int i = 0; i < Integer.parseInt(dadosInteiros[0]); i++) {
            String[] dadosProdutos = entradas.nextLine().split("\\s");
            //Produto(int codigo, String nome, double preco)
            produtos[i] = new Produto(Integer.parseInt(dadosProdutos[0]), dadosProdutos[1], Double.parseDouble(dadosProdutos[2]));
        }
        //System.out.println(Arrays.toString(produtos)); TESTE
        
        for (int i = 0; i < Integer.parseInt(dadosInteiros[1]); i++) {
            String[] dadosClientes = entradas.nextLine().split("\\s");
            //Cliente(String nome, String cpf, String endereço)
            clientes[i] = new Cliente(dadosClientes[1], dadosClientes[0], dadosClientes[2]);
        }
        //System.out.println(Arrays.toString(clientes)); TESTE
        
        for (int i = 0; i < Integer.parseInt(dadosInteiros[2]); i++) {
            String[] dadosServiços = entradas.nextLine().split("\\s");
            //Servico(double preço, String data, String tipoServico))
            servicos[i] = new Servico(Double.parseDouble(dadosServiços[1]), dadosServiços[2], dadosServiços[0]);
        }
        //System.out.println(Arrays.toString(servicos)); TESTE   
        
        Classificador classifica = new Classificador();
        classifica.ordena(produtos);
        classifica.ordena(clientes);
        classifica.ordena(servicos);
        
        for (Classificavel produto : produtos) {
            Produto p = (Produto) produto;
            System.out.println(p.getCodigo() + " " + p.getNome() + " " + p.getPreco());
        }

        for (Classificavel cliente : clientes) {
            Cliente c = (Cliente) cliente;
            System.out.println(c.getCpf() + " " + c.getNome() + " " + c.getEndereço());
        }

        for (Classificavel servico : servicos) {
            Servico s = (Servico) servico;
            System.out.println(s.getTipoServico() + " " + s.getPreço() + " " + s.getData());
        }        
    }
}