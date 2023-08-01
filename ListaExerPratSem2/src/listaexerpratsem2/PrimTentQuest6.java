
//package listaexerpratsem2;

//import java.util.Arrays;
import java.util.Scanner;

public class CorretorOrtografico {
    
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
        String palavratestada = null;
        for (String dicionario : lista_palavras){
            if (verifica_palavra.equals(dicionario)){
                System.out.println("palavra correta");
                acheiapalavra = true;
            }
            else {
                if (dicionario.length() == verifica_palavra.length()){
                    for (int cont = 0; cont < dicionario.length(); cont++) {
                        if (dicionario.charAt(cont) != verifica_palavra.charAt(cont))
                            semelhanca += 1;
                        //System.out.println(semelhanca); TESTE
                    }
                    if (acheiapalavra == false)
                        System.out.println("palavra incorreta");
                        if (semelhanca == 1 || semelhanca == 2)
                            System.out.println(dicionario + "?");        
                }
            }    
        }
                    
    }
}
    

