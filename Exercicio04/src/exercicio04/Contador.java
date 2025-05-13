package exercicio04;

public class Contador {
  private int valor;
  private int limite;

  public Contador(int limite){
    this.limite = limite;
    this.valor = 0;
  }

  public void incrementar(){
    valor++;
    if(valor == limite){
      valor = 0;
    }
  }

  public int devolverValor(){
    return valor;
  }

  public String devolveString(){
    return(valor < 10) ? "0" + valor : "" + valor;
  }
}
