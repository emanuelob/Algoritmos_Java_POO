
package revisandobasicocev;

public class UltraEmojiCombat {
    
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[3];
                
        lutador[0] = new Lutador("PrettyBoy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lutador[1] = new Lutador("PutsCript", "Brasil", 29, 1.68f, 57.8f, 14, 1, 3);
        lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.69f, 12, 0, 1);
        
        /*
        for (Lutador player : lutador) {
                player.apresentar();
                player.status();
        }
        */
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutador[0], lutador[1]);
        UEC01.lutar();
    }
  
}
