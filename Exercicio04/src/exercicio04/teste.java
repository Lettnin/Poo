package exercicio04;

public class teste {
  public static void main(String[] args) {
      RelogioDigital relogio;
      relogio = new RelogioDigital();

      relogio.atualizaVisor();

      for(int i=0; i < 200; i++){
        relogio.eventoDoRelogio();
        relogio.atualizaVisor();
      }
  }
}
