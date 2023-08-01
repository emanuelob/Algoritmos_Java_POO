
package listaexerpratsem2;

//import java.util.Arrays;
import java.util.Scanner;

public class Quest7 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int palavras_cadastradas = entrada.nextInt();
        String lista_palavras[] = new String[palavras_cadastradas];

        for (int i = 0; i < palavras_cadastradas; i++) {
            String palavras = entrada.next();
            lista_palavras[i] = palavras;
        }
        //System.out.println(Arrays.toString(lista_palavras)); TESTE
        
        String verifica_palavra = entrada.next();
        boolean acheiapalavra = false;
        int semelhanca = 0;
        //String palavratestada = null;
        for (String dicionario : lista_palavras){
            if (verifica_palavra.equals(dicionario)){
                System.out.println("palavra correta");
                acheiapalavra = true;
            }
            else {
                String desigualdade[] = new String[2];
                if (dicionario.length() == verifica_palavra.length()){
                    for (int cont = 0; cont < dicionario.length(); cont++) {
                        //System.out.println(Arrays.toString(desigualdade));
                        if ((dicionario.charAt(cont) != verifica_palavra.charAt(cont) && (semelhanca < 2))) {
                            String caractere = Character.toString(dicionario.charAt(cont));
                            //System.out.println(caractere);
                            if (verifica_palavra.contains(caractere) == true) {
                                desigualdade[semelhanca] = String.valueOf(dicionario.charAt(cont));
                                semelhanca += 1;
                            }
                        }
                        if ((verifica_palavra.contains(desigualdade[0]+desigualdade[1])) || (verifica_palavra.contains(desigualdade[1]+desigualdade[0]))) {
                            System.out.println("palavra incorreta");
                            System.out.println(dicionario + "?");
                            acheiapalavra = true;
                            break;  
                        }
                        if (cont == dicionario.length() - 1) 
                            semelhanca = 0;
                    }
                }    
            }
        }
        if (acheiapalavra == false) {
            System.out.println("palavra incorreta");
            System.out.println("nenhuma sugestao");
        }
    }
}
    

