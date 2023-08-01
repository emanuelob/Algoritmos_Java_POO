
package listaexerpratsem2;

import java.util.Scanner;

public class Quest2 {
    
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        int tipoLoteamento = entradas.nextInt();
        int area = entradas.nextInt();
        if (area <=0 || (tipoLoteamento != 1 && tipoLoteamento != 2)) {
            System.out.println("Entrada Inválida!");
        }  
        else {
            float valorIPTU;
            switch (tipoLoteamento) {
                case 1:
                    if (area <= 200) {
                        valorIPTU = (float) (area * 1.0);
                        System.out.format("%.2f", valorIPTU);
                        break;
                    }
                    else {
                        valorIPTU = (float) (area * 1.2);
                        System.out.format("%.2f", valorIPTU);
                        break;
                    }
                    
                case 2:
                    if (area <= 200) {
                        valorIPTU = (float) (area * 1.1);
                        System.out.format("%.2f", valorIPTU);
                        break;
                    }
                    else {
                        valorIPTU = (float) (area * 1.3);
                        System.out.format("%.2f", valorIPTU);
                        break;
                    }
            }        
        }
    }
}
