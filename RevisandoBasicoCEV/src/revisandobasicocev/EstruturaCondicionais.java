
package revisandobasicocev;

import java.util.Scanner;

public class EstruturaCondicionais {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n = teclado.nextFloat();
        float n1 = teclado.nextFloat();
        float media = (n + n1) / 2;
        System.out.println("Sua média foi " + media);
        if (media>9) {
            System.out.println("Parabéns!");
        }
        
        //Maior de idade
        int nasc = teclado.nextInt();
        int idade = 2023 - nasc;
        if (idade>=18) {
            System.out.println("Maior de idade.");
        }
        else {
            System.out.println("Menor de idade.");
        }
        
        //Condição de múltipla escolha
        //Utilizando switch no exemplo do número de pernas
        //switch é apenas para números inteiros
        System.out.println("Quantas pernas?");
        int perna  = teclado.nextInt();
        String especie;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1:
                especie = "Saci.";
                break;
            case 2:
                especie = "Bípede.";
                break;
            case 3:
                especie = "Trípede.";
                break;
            case 4:
                especie = "Quadrúpede.";
                break;
            case 6:
                especie = "Aranha.";
                break;
            case 8:
                especie = "Polvo.";
                break;
            default:
                especie = "ET.";
        }
        System.out.println(especie);
    }
}
