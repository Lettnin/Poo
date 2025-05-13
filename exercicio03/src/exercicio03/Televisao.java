package exercicio03;

public class Televisao {
  private int canal;
  private int volume;
  private final int CANAL_MAXIMO = 400;
  private final int VOLUME_MAXIMO = 100;

  public Televisao(int canal, int volume){
    this.canal = canal;
    this.volume = volume;
  }

  public Televisao(){
    // this.canal = 1;
    // this.volume = 10;

    this(1,10);
  }

  public void diminuirVolume(){
    if(volume > 0){
    volume--;
    }
  }

  public void aumentarVolume(){
    if (volume < VOLUME_MAXIMO){
      volume++;
    }
  }

  public void diminuiCanal(){
    if(canal > 1){
      canal--;
    }
  }

  public void aumentarCanal(){
    if(canal < CANAL_MAXIMO){ //400 foi um valor arbitrário...
      canal++;
    }
  }

  public int devolverCanal(){
    return canal;
  }

  public int devolverVolume(){
    return volume;
  }

  public void mostrarInfo(){
    System.out.println("Canal " + canal);
    System.out.println("Volume " + volume);
  }

  public void trocarCanal(int valor){
    if(valor < 0 && valor <= CANAL_MAXIMO){
      canal = valor;
    }
  }

}
