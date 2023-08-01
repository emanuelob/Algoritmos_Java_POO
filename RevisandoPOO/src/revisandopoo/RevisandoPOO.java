
package revisandopoo;

public class RevisandoPOO {

    public static void main(String[] args) {
        // TODO code application logic here
        /* 
        
            CLASSE = define os atributos e métodos comuns que serão compartilhados por um objeto
            OBJETO = é uma instância de uma classe
            ABSTRAÇÃO = priorizaçao de atributos
        
        Objetos são classificados por classes. Todo objeto deve ter:
        COISAS QUE EU TENHO - ATRIBUTO (Caracterísiticas, dados)
        COISAS QUE EU FAÇO - MÉTODO (Comportamento, procedimentos)
        COMO ESTOU NO MOMENTO - ESTADO (Características atuais)
        
        Exemplo do objeto caneta
        Classe Caneta
            Atributos
            modelo: Caractere
            cor = Caractere
            ponta = Float
            carga = Inteiro
            tampapada = Booleano
        
        Nos métodos mexemos com os atributos do objeto:
            Método Rabiscar e Escrever
            se Tampada, então não escreve
            se não há carga, então não escreve
            senão Escreva
            Método tampar e destampar
            Método pintar
        
            Estados
            Destampada
            Azul
            90% Carga
        
        Instaciar = pego uma classe e gero um objeto a partir dela
        Objetos da mesma classe:
        c1 = nova Caneta
        c1.cor = "Azul"
        c1.ponta = 0.5
        c1.tampada = falso
        c1.rabiscar()
        
        c2 = nova Caneta
        c2.cor = "Vermelho"
        c2.ponta = 1.0
        c2.tampada = falso
        c2.tampar()
        */
        //this é o próprio objeto c1 
        //Criando um objeto
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.tampada = false; 
        c1.status(); //método tem parenteses
        //c1.tampar();
        c1.rabiscar();
        
        
        //Criando um novo objeto
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "preta";
        c2.status();
        //c2.destampar();
        c2.rabiscar();
        
        //Objetos possuem os mesmos atributos e métodos, se distinguem pelos estados
    }
    
}
