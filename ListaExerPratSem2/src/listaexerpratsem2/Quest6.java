
package listaexerpratsem2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Quest6 {

//public class SiglasInternet {

    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in, "UTF-8");
        int qtdd_siglas = entradas.nextInt();

        HashMap <String, String> dicionariosiglas = new HashMap<>();
        for (int cont = 0; cont < qtdd_siglas; cont++) {
            Scanner entrada_siglas = new Scanner(System.in, "UTF-8");
            String siglas = entrada_siglas.nextLine();
            String[] siglas_separadas = siglas.split("\\s");
            //System.out.println(Arrays.toString(siglas_separadas)); TESTE
            dicionariosiglas.put(siglas_separadas[0], siglas_separadas[1]);
        }
        //System.out.println(dicionariosiglas); //TESTE
        
        Scanner entrada_frase = new Scanner(System.in, "UTF-8");
        String frase = entrada_frase.nextLine().toLowerCase();
        String[] palavras_frase = frase.split("\\s");
        //String[] palavrasMinusculas;
        //for (String palavra : palavras_frase) {
            //char letra;
            //for (int aux = 0; aux < palavra.length(); aux++)
                //letra = palavra[aux].toUpperCase;
                                   
        for (int i = 0; i < palavras_frase.length; i++) {
            /*
            if (dicionariosiglas.containsKey(palavras_frase[i])) {
                    palavras_frase[i] = dicionariosiglas.get(palavras_frase[i]);
            */
            if (i == 0) {
                String verificaMinusculo = palavras_frase[i].toLowerCase();
                if (dicionariosiglas.containsKey(verificaMinusculo)) 
                    palavras_frase[i] = dicionariosiglas.get(verificaMinusculo);
            }
            else {
                if (dicionariosiglas.containsKey(palavras_frase[i])) 
                    palavras_frase[i] = dicionariosiglas.get(palavras_frase[i]);
            }
        }
        System.out.println(Arrays.toString(palavras_frase));
        //frase = String.join(" ", palavras_frase);
        //System.out.println(frase);
        for (String palavra : palavras_frase) {
            System.out.print(palavra + " ");
        }
    }
}

