
package listaexersem3;

//import java.util.Arrays;
import java.util.Scanner;

class Circulo {
    private int x, y, raio;
    public static final double PI = 3.14159;
    
    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    public double circunferencia() {
        return 2 * PI * raio;
    }
}

public class TestaCirculo {
     
    public static void main(String[] args) {
        
        /*
        Circulo circulo1, circulo2, circulo3;
        circulo1 = new Circulo(3, 3, 1);
        circulo2 = new Circulo(2, 1, 4);
        circulo3 = circulo1;
        
        System.out.println(circulo1.getX() + " " + circulo1.getY());
        System.out.println(circulo2.getX() + " " + circulo2.getY());
        System.out.println(circulo3.getX() + " " + circulo3.getY());
        
        int circulo = (int) circulo1.circunferencia();
        System.out.println(circulo1.getRaio());
        System.out.println(" " + circulo);
    */
        //Crie um vetor de 3 objetos Circulo, considerando o construtor da classe;
        Circulo vetorCirculos[] = new Circulo[3];
        Scanner entradas = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String[] dadosCirculos = entradas.nextLine().split("\\s");
            vetorCirculos[i] = new Circulo(Integer.parseInt(dadosCirculos[0]), Integer.parseInt(dadosCirculos[1]), Integer.parseInt(dadosCirculos[2]));
        }
        //System.out.println(Arrays.toString(vetorCirculos)); //TESTE
        
        //Declare outra referência do tipo Circulo[ ];
        //Circulo[] circulo2 = new Circulo[];
        Circulo[] circulo2;
        circulo2 = vetorCirculos; //Copie a referência do primeiro vetor para o segundo;
        
        //Crie um terceiro vetor do tipo Circulo de tamanho 3;
        Circulo circulo3[] = new Circulo[3];
        // Copie os objetos do primeiro vetor para o terceiro;
        int aux = 0;
        for (Circulo circulo : vetorCirculos) {
            circulo3[aux] = new Circulo(circulo.getX(), circulo.getY(), circulo.getRaio());
            aux++;
        }
        
        //Altere os valores de raio para os objetos do primeiro vetor;
        for (int i = 0; i < 3; i++) {
            int novoRaio = entradas.nextInt();
            vetorCirculos[i].setRaio(novoRaio);
        }
        
        //Imprima os valores x, y e  raio de cada objeto para os três vetores.
        System.out.println("vetor1:");
        for (Circulo circuloPrimeiro : vetorCirculos) {              
            System.out.println(circuloPrimeiro.getX() + " " + circuloPrimeiro.getY() + " " + circuloPrimeiro.getRaio());
        }
        
        System.out.println("vetor2:");
        for (Circulo circuloSegundo : circulo2) {              
            System.out.println(circuloSegundo.getX() + " " + circuloSegundo.getY() + " " + circuloSegundo.getRaio());
        }
        
        System.out.println("vetor3:");
        for (Circulo circuloTerceiro : circulo3) {              
            System.out.println(circuloTerceiro.getX() + " " + circuloTerceiro.getY() + " " + circuloTerceiro.getRaio());
        }
    }
}