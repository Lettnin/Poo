package exercicio03;

public class Main {
  public static void main(String[] args){
    Televisao tv;
    tv = new Televisao(2,15);
    tv.mostrarInfo();

    ControleRemoto controle = new ControleRemoto(tv);
    controle.mostrarInfo();
    controle.aumentarCanal();
    controle.mostrarInfo();

    tv.aumentarCanal();
    tv.aumentarVolume();

    controle.mostrarInfo();

    controle.trocarCanal(800);
    controle.mostrarInfo();
  }
}
