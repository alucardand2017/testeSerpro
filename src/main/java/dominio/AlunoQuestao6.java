package dominio;

public class AlunoQuestao6 {
        private String nomeAluno;
        private int matriculaAluno;
        private double notaMatematica, notaPortugues, notaCiencias;

        public AlunoQuestao6(){

        }
        public AlunoQuestao6(String nomeAluno, int matriculaAluno) {
            this.nomeAluno = nomeAluno;
            this.matriculaAluno = matriculaAluno;
        }
        public double getNotaMatematica() {
            return notaMatematica;
        }
        public void setNotaMatematica(double notaMatematica) {
            this.notaMatematica = notaMatematica;
        }
        public double getNotaPortugues() {
            return notaPortugues;
        }
        public void setNotaPortugues(double notaPortugues) {
            this.notaPortugues = notaPortugues;
        }
        public double getNotaCiencias() {
            return notaCiencias;
        }
        public void setNotaCiencias(double notaCiencias) {
            this.notaCiencias = notaCiencias;
        }
        public String getNome() {
            return nomeAluno;
        }
        public void setNome(String nome) {
            this.nomeAluno = nome;
        }
        public int getMatricula() {
            return matriculaAluno;
        }
        public void setMatricula(int matricula) {
            this.matriculaAluno = matricula;
        }
        public double calculaMedia() {
            return (notaMatematica + notaPortugues + notaCiencias) / 3;
        }
}

