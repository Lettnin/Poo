import sistemabanco.Conta;

public class Conta {
  // Atributos
  int numero;
  String dono;
  double saldo;
  double limite;

  // Métodos
  void deposita(double quantidade) {
    saldo = saldo + quantidade;
  }

  boolean saca(double valor) {
    if (saldo + limite < valor) {
      return false;
    }

    else {
      saldo = saldo - valor;
      return true;
    }
  }

  void imprimeDono(String dono) {
    System.out.println("Dono: " + dono);
  }

  double devolveSaldo(double saldo) {
    return saldo;
  }

  boolean transferePara(Conta destino, double valor) {
    if (saca(valor)) {
      destino.deposita(valor);
      return true;
    } else {
      return false;
    }
  }

  void imprimeDados(int numero, String dono, double saldo, double limite) {
    System.out.println("Numero: " + numero);
    System.out.println("Dono: " + dono);
    System.out.println("Saldo: R$ " + saldo);
    System.out.println("Limite: R$ " + limite);

  }

  // Método Principal//
  public static void main(String[] args) {
    Conta maria = new Conta();
    maria.numero = 123;
    maria.dono = "Maria Silva";
    maria.saldo = 1000.0;
    maria.limite = 500.0;

    Conta joao = new Conta();
    joao.numero = 456;
    joao.dono = "João Souza";
    joao.saldo = 500.0;
    joao.limite = 200.0;

    System.out.println("Dados da conta 1:");
    maria.imprimeDados(maria.numero, maria.dono, maria.saldo, maria.limite);

    System.out.println("\nDepositando R$ 200 na conta de Maria...");
    maria.deposita(200);
    System.out.println("Novo saldo: " + maria.saldo);

    System.out.println("\nSacando R$ 1500 da conta de Maria...");
    if (maria.saca(1500)) {
      System.out.println("Saque realizado!");
    } else {
      System.out.println("Saque não efetuado");
    }
    System.out.println("Saldo atual: " + maria.saldo);

    System.out.println("Transferindo R$ 300 para Joao...");
    if (maria.transferePara(joao, 300)) {
      System.out.println("\ntransferencia realizada");
    }
    else{
      System.out.println("\ntranferencia falhou");
    }

    System.out.println("\nSaldo final das contas:");
    System.out.println("Conta 1 - Saldo: R$ " + maria.saldo);
    System.out.println("Conta 2 - Saldo: R$ " + joao.saldo);
  }
}
