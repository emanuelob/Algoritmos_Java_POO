
package listaexersem3;

import java.util.Scanner;

class Impressora {
    
    public String modelo; 
    public String cor; 
    public String tipoPapel; 
    public boolean bluetooth; 
    public boolean wifi; 
    public boolean colorida; 
    public boolean ligada; 
    public boolean papel; 
    public boolean digitalizadora; 
    public boolean copiadora;
    
    public void ligar() { 
        if (this.ligada == false) {
            System.out.println("ligando...");    
            this.ligada = true; 
        } 
    }

    public void desligar() { 
        if (this.ligada == true) { 
            System.out.println("desligando..."); 
            this.ligada = false;
        }
    } 

    public void imprimir() { 
        if (this.ligada == true && this.papel == true) 
            System.out.println("imprimindo..."); 
        else { 
            if (this.ligada == true && this.papel == false) 
                System.out.println("sem papel"); 
            else{ 
                System.out.println("impressora desligada"); 
            }        
        } 
    } 

    public void digitalizar() { 
        if (this.ligada == true && this.digitalizadora == true) 
            System.out.println("Digitalização sendo realizada..."); 
        else{ 
            if (this.ligada == true && this.digitalizadora == false) 
                System.out.println("Não é possível digitalizar"); 
            else { 
                System.out.println("impressora desligada"); 
            } 
        } 
    }  

    public void copiar () { 
        if (this.ligada == true && this.copiadora == true) 
            System.out.println("cópia sendo realizada"); 
        else { 
            if (this.ligada == true && this.copiadora == false) 
                System.out.println("não é possível copiar"); 
            else { 
                System.out.println("impressora desligada"); 
            } 
        } 
    } 
    
    public void status () { 
        System.out.println(this.modelo); 
        System.out.println(this.cor); 
        System.out.println(this.tipoPapel); 

        if (this.bluetooth == true) 
            System.out.println("bluetooth on"); 
        if (this.bluetooth == false) 
            System.out.println("bluetooth off"); 
        if (this.wifi == true) 
            System.out.println("wifi on"); 
        if (this.wifi == false) 
            System.out.println("wifi off"); 
        if (this.colorida == true) 
            System.out.println("impressão colorida"); 
        if (this.colorida == false) 
            System.out.println("impressão preto e branco"); 
        if (this.ligada == true) 
            System.out.println("impressora on"); 
        if (this.ligada == false) 
            System.out.println("impressora off"); 
        if (this.papel == true) 
            System.out.println("tem papel"); 
        if (this.papel == false) 
            System.out.println("não tem papel"); 
        if (this.digitalizadora == true) 
            System.out.println("digitalizadora on"); 
        if (this.digitalizadora == false) 
            System.out.println("digitalizadora off");     
        if (this.copiadora == true) 
            System.out.println("copiadora on"); 
        if (this.copiadora == false) 
            System.out.println("copiadora off"); 
    } 
} 

public class ListaExerSem3 { 

    public static void main(String[] args) { 

        Impressora impressora = new Impressora(); 
        impressora.bluetooth = true; 
        impressora.wifi = true; 
        impressora.colorida = true; 
        impressora.ligada = false; 
        impressora.papel = true; 
        impressora.digitalizadora = true; 
        impressora.copiadora = false; 

        Scanner dadosimpressora = new Scanner(System.in, "ISO-8859-1"); 

        String modeloImpressora = dadosimpressora.nextLine(); 
        String[] listaImpressora = modeloImpressora.split("\\s"); 
        impressora.modelo = listaImpressora[0]; 
        impressora.cor = listaImpressora[1]; 
        impressora.tipoPapel = listaImpressora[2]; 

        impressora.status(); 
        impressora.ligar(); 
        impressora.digitalizar(); 
        impressora.copiar(); 
        impressora.desligar(); 
        impressora.imprimir(); 
    } 
} 
    

