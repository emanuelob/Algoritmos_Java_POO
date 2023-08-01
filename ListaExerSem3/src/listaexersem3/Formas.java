
package listaexersem3;

//import java.util.Arrays;
import java.util.Scanner;

class Retangulo {
    private int comprimento = 1;
    private int largura = 1;

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        if (0 <= comprimento && comprimento <= 20) {
            this.comprimento = comprimento;
        }
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        if (0 <= largura && largura <= 20) {
            this.largura = largura;
        }
    }
    
    public int perimetroRetangulo() {
        return (2 * (this.getComprimento() + this.getLargura()));
    }
    
    public int areaRetangulo() {
        return (this.getComprimento() * this.getLargura());
    }   
}

public class Formas {
    
    public static void main(String[] args) { 
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();

        Scanner retangulos = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            String[] retangulo = retangulos.nextLine().split("\\s");
            //System.out.println(Arrays.toString(retangulo)); TESTE
            if (i == 0) {
                ret1.setComprimento(Integer.parseInt(retangulo[0]));
                ret1.setLargura(Integer.parseInt(retangulo[1]));
                System.out.println(ret1.getComprimento() + " " + ret1.getLargura() + " " + ret1.perimetroRetangulo() + " " + ret1.areaRetangulo());
            }
            else {
                ret2.setComprimento(Integer.parseInt(retangulo[0]));
                ret2.setLargura(Integer.parseInt(retangulo[1]));
                System.out.println(ret2.getComprimento() + " " + ret2.getLargura() + " " + ret2.perimetroRetangulo() + " " + ret2.areaRetangulo());
            }
        }
    }
}

