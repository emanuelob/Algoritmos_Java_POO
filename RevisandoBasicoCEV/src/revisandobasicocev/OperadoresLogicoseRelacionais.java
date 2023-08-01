
package revisandobasicocev;

public class OperadoresLogicoseRelacionais {
    
    public static void main(String[] args) {
        /*Pseudo-código
        Se (n1 > n2) entao
        maior = n1
        Senao
        maior = n2
        */
        
        //Operador Ternário
        //Atribuir um valor a uma mesma variavel 
        //maior = n1 > n2 ? n1 : n2; ternario = função ? valor caso verdadeiro : valor caso falso
        int n1, n2, resultado, resultado1;
        n1 = 14;
        n2 = 8;
        resultado = (n1 > n2) ? n1 : n2;
        resultado1 = (n1 > n2) ? n1+n2 : n1-n2;
        System.out.println(resultado);
        System.out.println(resultado1);
        /*
        >= maior ou igual  
        <= menor ou igual
        == igual a 
        != diferença
        */
        
        //Comparando String
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res, res1;
        res = (nome1==nome3) ? "igual":"diferente";
        System.out.println(res); // dará diferente por se tratar de objetos distindos, mas com mesmo valor
        res1 = (nome1.equals(nome3)) ? "igual":"diferente";
        System.out.println(res1); // verifica igualdade dos valores
        
        //Operadores Lógicos
        //&& para 'e' (and no python)
        //|| para 'ou' (or no python)
        //^ para 'ou exclusivo' (XOR - tem que ser distintos para dar verdadeiro)
        // ! para 'não' (!false dará true)
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean teste;
        teste = (x < y && y < z) ? true:false;
        System.out.println(teste);
        
        //Expressões Lógicas Compostas
        //Exemplo de pessoas elegíveis ao voto: idade a partir de 16 e menor que 70
        int ano = 1978;
        int idade = 2015 - ano;
        String pode_votar = (idade>=16 && idade<70) ? "Pode votar.":"Não pode votar.";
        System.out.println(pode_votar);
        
        
                
    }
    
}
