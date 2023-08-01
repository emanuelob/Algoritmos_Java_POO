
package listaexerpratsem2;

import java.util.Scanner;

public class ListaExerPratSem2 {

    public static void main(String[] args) {
        
        Scanner entradas = new Scanner(System.in);
        float altura = entradas.nextFloat();
        char sexo = entradas.next().charAt(0);
        //String verifica_altura = (altura <=0 ) ? "Entrada Inválida!":"Calcula";
         
        if (altura <= 0) {
            System.out.println("Entrada inválida!");
        }
        else {
            if (Character.toUpperCase(sexo) != 'M' && Character.toUpperCase(sexo) != 'F') {
                System.out.println("Entrada inválida!");
            }
            else {
                if (sexo=='m') {
                    float peso_ideal = (float) ((72.7 * altura) - 58);
                    System.out.format("%.1f kg", peso_ideal);
                }
                else {
                    float peso_ideal = (float) ((62.1 * altura) - 44.7);
                    System.out.format("%.1f kg", peso_ideal);
                }
            }
                
        }
    }
       
}