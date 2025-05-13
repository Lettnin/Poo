package exercicio04;

public class Contador {
  private int valor;
  private int limite;

  public Contador(int limite){
    // this.limite = limite;
    // this.valor = 0;
    this(0, limite);
  }

  public Contador(int valor, int limite){
    this.limite = limite;
    alterarValor(valor);
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

  public void alterarValor(int valor){
    if(valor >= 0 && valor < limite){
      this.valor = valor;
    }
  }

}
