package CursoSistema;

public class Curso {

    private String nome;
    private Professor professor;
    private Aluno[] alunos;
    private double cargaHoraria;

    
    public Curso(String nome, Professor professor, Aluno[] alunos, double cargaHoraria) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = alunos;
        this.cargaHoraria = cargaHoraria;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Professor getProfessor() {
        return professor;
    }


    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public Aluno[] getAlunos() {
        return alunos;
    }


    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public double getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
    
}
