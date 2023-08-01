

package revisandobasicocev;

import java.util.Arrays;

public class Vetores {
    
    public static void main(String[] args) {
    //Vetor é declarado dentro da área var. É uma variável composta, que pode receber n valores/dados.
    //vetor[0..3] --> vetor com 4 espaços acessados com índices.
    int n[] = new int[4]; // criando 4 objetos inteiros dentro de um vetor
    //Colocando individualmente os valores:
    n[0] = 3;
    n[1] = 5;
    n[2] = 8;
    n[3] = 2;
    //Atribuindo valores na instanciação:
    int vetor[] = {3, 5, 8, 2}; //utiliza-se bloco "{}" para a atribuição
    
    for (int c=0; c<=(vetor.length - 1); c++) {
        System.out.print("Na posição " + c + ", temos o valor " + n[c] + ".");
        System.out.println("");
    }
    String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
    int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    for (int c=0; c<=(mes.length - 1); c++) {
        System.out.print("O mês " + mes[c] + " possui " + dias[c] + " dias.\n");
    }
    
    //Para cada --> For it funciona apenas para vetores
    double forit[] = {3.5, 2.75, 9, -4.5};
    for (double valor : forit) { // (tipo valor : vetor)
        System.out.print(valor + " ");
    }
    
    //Organizando um vetor
    Arrays.sort(forit); //Array é uma classe utilizada para vetores
    for (double valores : forit) { // (tipo valor : vetor)
        System.out.print(valores + " ");
    }
    //Busca Binária para achar posição
    int numeros[] = {3, 7, 6, 1, 9, 4, 2};
    int posicao = Arrays.binarySearch(numeros, 1); //key é o valor que estou procurando
        System.out.println("Encontrei o valor na posiçao " + posicao + ".");
        
    //Preenchimento automático de vetores
    int preenche[] = new int[20]; //criando vetor com 20 posições
    Arrays.fill(preenche, 0); // preenche todos as posições com 0
    for (int preenc : preenche) { // (tipo valor : vetor)
        System.out.print(preenc + " ");
    }
    }
}
