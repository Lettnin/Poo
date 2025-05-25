package GerenciamentoTurmas;

public class Turma {
  private String codigo;
  private Aluno alunos[];
  private int quantidade;

  public Turma(String codigo){
    this.codigo = codigo;
    this.alunos = new Aluno[5];
    this.quantidade = 0;
  }

  public void adicionarAluno(Aluno a){
    if(quantidade < alunos.length){
      alunos[quantidade] = a;
      quantidade++;
    }
    else{
      System.out.println("TURMA CHEIA!");
    }
  }

  public void listarAlunos(){
    System.out.println("\tTurma " + codigo);
    System.out.println();
    System.out.println("\tAlunos");
    for(int i = 0; i < quantidade; i++){
      alunos[i].mostrarDados();
    }
  }
  
}
