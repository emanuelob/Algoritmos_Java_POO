
package listaexersem3;

import java.util.Scanner;

class Temperatura {
    private double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    public String toString() {
        String imprime = "";
        imprime = imprime + "temperatura: " + this.temperatura + " graus";
        return imprime;
    }
    
    public void celsiusFahrenheit(double temperatura) {
        this.temperatura = (temperatura * 9.0 / 5.0 + 32);
    }
    
    public void fahrenheitCelsius() {
        this.temperatura = ((this.temperatura - 32) * 5.0 / 9.0);
    }

}
public class Converte {
    
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        double grau = entrada.nextDouble();
                
        Temperatura temp = new Temperatura(grau);  
        temp.celsiusFahrenheit(grau);
        System.out.println(temp + " fahrenheit");
        temp.fahrenheitCelsius();
        System.out.println(temp + " celsius");
    }
}
