package exercicio04;

public class RelogioDigital {
  private Contador minutos;
  private Contador horas;

  public RelogioDigital(){
    minutos = new Contador(60);
    horas = new Contador(24);
  }

  public void atualizaVisor(){
    System.out.println(horas.devolveString() + ":" + minutos.devolveString());
  }

  public void eventoDoRelogio(){
    minutos.incrementar();
    if(minutos.devolverValor() == 0){
      horas.incrementar();
    }
  }
}
