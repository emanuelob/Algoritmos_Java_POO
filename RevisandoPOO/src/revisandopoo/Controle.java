
package revisandopoo;

public class Controle {
    
    public static void main(String[] args) {
        ControleRemoto control1 = new ControleRemoto();
        control1.ligar();
        control1.maisVolume();
        control1.play();
        control1.abrirMenu();
        control1.fecharMenu();
    }
}
