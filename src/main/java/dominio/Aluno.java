package dominio;

public class Aluno {
    private String nome;
    private int matricula;
    public Boletim boletim = new Boletim();

    public Aluno(String nome, int numMatricula) {
        this.nome = nome;
        this.matricula = numMatricula;
    }
    @Override
    public String toString() {
        return  getMatricula() +" | " + getNome() + " | " + boletim;
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
