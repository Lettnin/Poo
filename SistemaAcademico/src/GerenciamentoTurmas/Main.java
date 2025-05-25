package GerenciamentoTurmas;

public class Main {
  public static void main(String[] args){
    Aluno a = new Aluno("Roberto", "Matematica", "23425");
    Aluno b = new Aluno("Marcelo", "Historia", "01234");
    Aluno c = new Aluno("Helena", "Odontologia", "223355");
    Aluno d = new Aluno("Lara", "Medicina", "987654");

    Turma M1 = new Turma("M1");

    M1.adicionarAluno(a);
    M1.adicionarAluno(b);
    M1.adicionarAluno(c);
    M1.adicionarAluno(d);

    M1.listarAlunos();
  }

}

