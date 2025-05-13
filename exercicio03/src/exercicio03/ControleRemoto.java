package exercicio03;

public class ControleRemoto {
  private final Televisao tv;

  public ControleRemoto(Televisao tv){
    this.tv = tv;
  }

  public void diminuiCanal(){
    tv.diminuiCanal();
  }

  public void aumentarCanal(){
    tv.aumentarCanal();
  }

  public void diminuirVolume(){
    tv.diminuirVolume();
  }

  public void aumentarVolume(){
    tv.aumentarVolume();
  }

  public void mostrarInfo(){
    tv.mostrarInfo();
  }

  public void trocarCanal(int valor){
    tv.trocarCanal(valor);
  }

}
