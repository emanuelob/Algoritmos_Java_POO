
package revisandobasicocev;

public class Metodos {
    
    //quando coloco o static, crio uma função funcional apenas dentro da classe
    static void soma (int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s + ".");
    }
    //criando uma funcão com retorno inteiro
    static int soma1 (int a, int b) {
        int s1 = a + b;
        return s1;
    }
    
    public static void main(String[] args) { //main é procedimento que recebe como argumento um vetor de strings 
    //void é um método que não retorna valor
    //static não cria objeto
        soma(5,2);
        int sm = soma1(3, 8);
        System.out.println("A soma vale " + sm + ".");
    }
    
    String contador (int i, int f) {
        String s = "";
        for (int c = i; c <= f; c++) {
            s += c + " ";
        }
        return s;
    }
}
