
package revisandopoo;

public class MetodosEspeciais {
    //Métodos Acessores (Getters)
    //Não permite acessos diretos ao objeto/atributo pelo usuário, garante segurança
    //GET - pega informação dos atributos
    
    //Métodos Modificadores
    //Modificam atributos do objeto com segurança
    //Set - altera informação
    //objeto.metodo(parâmetro)
    //são mais abstratos
    
    //Exemplo da Caneta
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    //Criando método construtor
    public MetodosEspeciais(String model, String co, float pont) { //O construtor é identificado por possuir o mesmo nome da classe
        this.modelo = model;
        this.cor = co;
        this.setPonta(pont);
        //this.cor = "Azul";
        this.tampar();
        
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("Sobre a Caneta:");
        System.out.println("É do modelo: " + this.getModelo());
        System.out.println("Possui a ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}

class caneta {
    
    public static void main(String[] args) {
        MetodosEspeciais caneta = new MetodosEspeciais("BIC", "Amarela", 0.7f);
        MetodosEspeciais caneta1 = new MetodosEspeciais("Compactor", "Laranja", 0.5f);

        //caneta.setModelo("BIC");
        //caneta.modelo = "BIC"; //se fosse atributo privado, não seria possível
        
        //caneta.setPonta((float) 0.5);
        
        caneta.status();
        caneta1.status();
        //System.out.println("Tenho uma caneta " + caneta.getModelo() + " de ponta " + caneta.getPonta());
    }
    
}

//Criando métodos usando CTRL + Insert
class canetaCTRL {
    private String marca;
    private String color;
    private float pontafina;

    public canetaCTRL(String marca, String color, float pontafina) {
        this.marca = marca;
        this.color = color;
        this.pontafina = pontafina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPontafina() {
        return pontafina;
    }

    public void setPontafina(float pontafina) {
        this.pontafina = pontafina;
    }  
}
