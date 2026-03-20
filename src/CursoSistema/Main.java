package CursoSistema;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Dr. Smith", "Matemática");
        Aluno aluno1 = new Aluno("João", "2023001");
        Aluno aluno2 = new Aluno("Maria", "2023002");   
        Curso curso1 = new Curso("Cálculo", professor1, new Aluno[]{aluno1, aluno2}, 60.0);
        
        System.out.println("Professor: " + professor1.getNome() + ", Especialidade: " + professor1.getEspecialidade());
        System.out.println("Aluno: " + aluno1.getNome() + ", Matrícula: " + aluno1.getMatricula());
        System.out.println("Aluno: " + aluno2.getNome() + ", Matrícula: " + aluno2.getMatricula());
        System.out.println("Curso: " + curso1.getNome() + ", Carga Horária: " + curso1.getCargaHoraria());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : curso1.getAlunos()) {
            System.out.println(" - " + aluno.getNome());
        }
    }
}
