package revisandobasicocev;

public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        /*int n1 = 3;
        int n2 = 5;
        int numero = 5;
        float media = (n1 + n2) / 2;
        System.out.println("A média é igual a " + media);
        //numero++;
        //numero--;
        int valor = 5 + ++numero; Pré incremento: Inicialmente, fará a incrementação de + 1 na variavel (6), após ele irá fazer a soma 5 + 6 = 11
        int valor1 = 5 + numero--; Pós incremento: Inicialmente, fará a adição 5 + 5 = 10. Após, ele irá decrementar - 1 na variavel, somente a variável muda de valor (4)
        System.out.println(valor);
        System.out.println(valor1);
        
        //Operadores de Atribuição
        // += Somar e atribuir a+=b  -- > a = a + b
        // -= Subtrair e atribuir a+=b  -- > a = a - b
        // *= Multiplicar e atribuir a+=b  -- > a = a * b
        // /= Dividir e atribuir a+=b  -- > a = a / b
        // %= Resto e atribuir a+=b  -- > a = a % b*/
        
        //Classe Math possui constantes e métodos para cálculo matemático
        System.out.println(Math.PI);
        System.out.println(Math.pow(5, 2)); // Exponenciação 5 ** 2
        System.out.println(Math.sqrt(25)); // Raiz quadrada
        System.out.println(Math.cbrt(27)); // Raiz cúbica de 27
        
        //Arredondamentos 
        System.out.println(Math.abs(-10)); // elimina o valor negativo, vale o absoluto
        System.out.println(Math.floor(3.9)); // arredonda para baixo, truncagem ou divisão inteira
        System.out.println(Math.ceil(4.2)); // arredonda para cima
        System.out.println(Math.round(5.66)); // arrendonda aritmeticamente
        
        float value = 8.9f;
        int arredonda = (int) Math.round(value);
        System.out.println(arredonda);
        
        // Gerando numero aleatorio
        double ale = Math.random(); // por default, gera um numero entre 0 e 1
        System.out.println(ale);  
        double intervalo = (int) 5 + ale * (10-5); //aleatorio entre 5 e 10
        System.out.println(intervalo);
    }
}
