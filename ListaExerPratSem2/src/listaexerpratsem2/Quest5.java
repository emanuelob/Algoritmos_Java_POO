
package listaexerpratsem2;

import java.util.Arrays;
import java.util.Scanner;

public class Quest5 {
    
    public static void main(String[] args) {
        
        Scanner entradas = new Scanner(System.in);
        int qtdd_produtos = entradas.nextInt();
        String produtos[] = new String[qtdd_produtos];
        int quantidade[] = new int[qtdd_produtos]; 
        
        for (int cont = 0; cont < qtdd_produtos; cont++) {
            Scanner entradas_estoque = new Scanner(System.in);
            String estoque = entradas_estoque.nextLine();
            String lista_estoque[] = estoque.split("\\s");
            System.out.println(Arrays.toString(lista_estoque));
            produtos[cont] = lista_estoque[0];
            quantidade[cont] = Integer.parseInt(lista_estoque[1]);
            }
        System.out.println(Arrays.toString(produtos)); //TESTE
        System.out.println(Arrays.toString(quantidade)); //TESTE
        
        while (true) {
            //Scanner entradas_vendas = new Scanner(System.in);
            String produto_vendido = entradas.next();
            String finalizar = "fim";
          
            if (finalizar.equals(produto_vendido)) {
                break;
            }
                
            else {
                
                int posicao = 0;
                for (String item : produtos) {
                    if (item.equals(produto_vendido)) {
                        int qtdd_vendido = entradas.nextInt();
                        System.out.println(produto_vendido + " " + qtdd_vendido);
                        int atualiza_estoque = (quantidade[posicao] - qtdd_vendido);
                        quantidade[posicao] = atualiza_estoque;
                        break;
                    }
                      
                    else {
                        posicao++;
                        if (posicao == produtos.length) {
                            System.out.println(produto_vendido + " produto não encontrado");
                            }
                        }
                }
               
            }
        }
        for (int cont = 0; cont < qtdd_produtos; cont++) {
            System.out.println(produtos[cont]+ " " + quantidade[cont]);
        }
    }
}
