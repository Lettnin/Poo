package exercicio04;

public class teste {
  public static void main(String[] args) {
      RelogioDigital relogio;
      relogio = new RelogioDigital(16,37);

      relogio.alterarHora(17);
      relogio.alterarMinuto(80);

      relogio.atualizaVisor();

      for(int i=0; i < 80; i++){
        relogio.eventoDoRelogio();
        relogio.atualizaVisor();
      }
  }
}
