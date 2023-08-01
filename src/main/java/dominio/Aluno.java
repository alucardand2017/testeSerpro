package dominio;

public class Aluno {
    private String nome;
    private int matricula;
    public Aluno(String nome, int numMatricula) {
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+" | Matricula: " + getMatricula();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
