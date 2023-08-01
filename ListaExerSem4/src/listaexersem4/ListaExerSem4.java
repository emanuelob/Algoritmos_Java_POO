
package listaexersem4;

import java.util.Scanner;

public class ListaExerSem4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Veículo
        String[] dadosVeiculo = entrada.nextLine().split("\\s");
        Veiculo veiculo = new Veiculo(dadosVeiculo[0], dadosVeiculo[1], dadosVeiculo[2], dadosVeiculo[3], Integer.parseInt(dadosVeiculo[4]));
        
        //Motorista
        String[] dadosMotorista = entrada.nextLine().split("\\s");
        Motorista motorista = new Motorista(Integer.parseInt(dadosMotorista[0]), dadosMotorista[1], dadosMotorista[2], dadosMotorista[3]);
        
        //Cliente
        String[] dadosCliente = entrada.nextLine().split("\\s");
        Cliente cliente = new Cliente(Integer.parseInt(dadosCliente[0]), dadosCliente[3],dadosCliente[4], dadosCliente[1], dadosCliente[2]);
        
        //Chamado
        String[] dadosChamado = entrada.nextLine().split("\\s");
        Chamado chamado = new Chamado(Integer.parseInt(dadosChamado[0]), dadosChamado[1], dadosChamado[2], dadosChamado[3], dadosChamado[4],
                Float.parseFloat(dadosChamado[5]), Float.parseFloat(dadosChamado[6]), Double.parseDouble(dadosChamado[7]),
                Double.parseDouble(dadosChamado[8]), Double.parseDouble(dadosChamado[8]), cliente, motorista, veiculo);
    
        //chamado.apresenta();
    }
    
}

class Chamado {
    private int id;
    private String data, tipo, origem, destino;
    private float horarioPartida, horarioRetorno;
    private double kmInicial, kmFinal, valorFinal;
    private Cliente cliente;
    private Motorista motorista;
    private Veiculo veiculo;
    /*
    //Método público
    public void apresenta() {
        System.out.println(this.getId());
        System.out.println(this.getDestino());
        System.out.println(this.getVeiculo().getPlaca());
        System.out.println(this.getCliente().getRG());
        System.out.println(this.getMotorista().getNome());
    }
    */
    //Métodos Especiais
    public Chamado(int id, String data, String tipo, String origem, String destino, float horarioPartida, float horarioRetorno, double kmInicial, double kmFinal, double valorFinal, Cliente cliente, Motorista motorista, Veiculo veiculo) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.origem = origem;
        this.destino = destino;
        this.horarioPartida = horarioPartida;
        this.horarioRetorno = horarioRetorno;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.valorFinal = valorFinal;
        this.cliente = cliente;
        this.motorista = motorista;
        this.veiculo = veiculo;
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(float horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public float getHorarioRetorno() {
        return horarioRetorno;
    }

    public void setHorarioRetorno(float horarioRetorno) {
        this.horarioRetorno = horarioRetorno;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmKInicial(double kmKInicial) {
        this.kmInicial = kmKInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(double kmFinal) {
        this.kmFinal = kmFinal;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
}

class Cliente {
    private int id;
    private String RG, CPF, nome, telefone;
    //Chamado chamado;

    //Métodos Especiais
    public Cliente(int id, String RG, String CPF, String nome, String telefone) {
        this.id = id;
        this.RG = RG;
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}

class Motorista {
    private int id;
    String nome, telefone, CNH;
    //Chamado chamado;

    
    //Métodos Especiais
    public Motorista(int id, String nome, String telefone, String CNH) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.CNH = CNH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }
    
}

class Veiculo {
    private String placa, marca, modelo, cor;
    private int ano;
    //Chamado chamado;

    
    //Métodos Especiais
    public Veiculo(String placa, String marca, String modelo, String cor, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}