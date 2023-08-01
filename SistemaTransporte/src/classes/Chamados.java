
package classes;

import java.util.Scanner;

public class Chamados {
    
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
    
