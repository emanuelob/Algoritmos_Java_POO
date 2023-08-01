
package revisandobasicocev;

//import java.util.Date;

import java.util.Scanner;

public class RevisandoBasicoCEV {

    public static void main(String[] args) {
        //System.out.println("Olá, mundo!");
        //Date relogio = new Date();
        //System.out.println("A hora do sistema é");
        //System.out.println(relogio.toString());
        
        //Testando os tipos primitivos do Java
        int idade = 3; // declaracao e atribuicao
        //int idade = (int)3; // typecast
        //Integer idade = new Integer(3); // new cria um objeto, precisa de uma classe referenciando ele
        float sal = 1825.54f; //precisa do f no final do numero
        //float sal = (float) 1825.54;
        //Float sal = new Float(1825.54);
        char letra = 'G';//somente uma letra, usar aspas simples
        //char letra = (char) 'G';
        //Character letra = new Character('G');
        boolean casado = false;
        //boolean casado = (boolean) false;
        //Boolean casado = new Boolean(false);
        
        //String é uma classe no Java, utiliza-se aspas duplas
        
        //Saídas de dados
        String nome = "Gustavo";
        float nota = 8.58f;
        System.out.println("Sua nota é " + nota);
        System.out.printf("A nota de %s é %.1f.\n", nome, nota);

        //Entrada de dados
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno: ");
        String nome1 = teclado.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade1 = teclado.nextInt();
        System.out.println("Digite a nota do Aluno: ");
        float nota1 = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f.\n", nome1, nota1);
        System.out.printf("A idade de %s é %d.\n", nome1, idade1);
        
        //Trnasformando inteiro em string
        String valor = Integer.toString(idade1); //Utiliza um método da classe String
        
        //Transformando string para int e float
        String valorTeste = "89";
        int idade2 = Integer.parseInt(valorTeste); //Utiliza um método da classe Integer
        float idade3 = Float.parseFloat(valorTeste);
        
    }
    
}
