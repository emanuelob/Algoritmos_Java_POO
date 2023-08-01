
package listaexerpratsem2;

import java.util.Scanner;

public class Quest4 {
    
    public static void main(String[] args) {
        int qtdd_homem = 0, qtdd_mulher = 0;
        float arrecada_homem = (float) 0.00, arrecada_mulher = (float) 0.00;
        Scanner entradas = new Scanner(System.in);
        
        while (true) {
            String entrada = entradas.nextLine();
            if (entrada.charAt(0) == 'q') {
                break;
            }
            if (entrada.charAt(0) != 'h' && entrada.charAt(0) != 'm') {
                continue;
            }
            else{
                if (entrada.charAt(0) == 'h') {
                qtdd_homem++;
                arrecada_homem += 12.50;
                //entrada = entradas.nextLine();
                } 
                else {
                    qtdd_mulher++;
                    arrecada_mulher += 7.40;
                    //entrada = entradas.nextLine();
                    }
            }
        }
            
        float arrecadacao = arrecada_homem + arrecada_mulher;
        System.out.println(qtdd_homem + " " + qtdd_mulher);
        System.out.format("%.2f %.2f %.2f", arrecada_homem, arrecada_mulher, arrecadacao);
    }
}