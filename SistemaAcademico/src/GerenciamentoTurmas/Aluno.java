package GerenciamentoTurmas;

public class Aluno {
  private String nome;
  private String matricula;
  private String curso;

  public Aluno(String nome, String curso, String matricula){
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
  }

  public void mostrarDados(){
    System.out.println("\tNome: " + nome);
    System.out.println("\tMatricula: " + matricula);
    System.out.println("\tCurso: " + curso);
    System.out.println();
  }
}
