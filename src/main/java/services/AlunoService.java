package services;

import dominio.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoService {
    ArrayList<Aluno> lista = new ArrayList<Aluno>();
    Scanner teclado = new Scanner(System.in);

    public void cadastrarAluno() {
        Scanner cad = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        String nome = cad.nextLine();
        System.out.print("Matricula do Aluno: ");
        int NumMatricula = cad.nextInt();
        Aluno aluno = new Aluno(nome, NumMatricula);
        lista.add(aluno);
        System.out.println("Aluno cadastrado com sucesso! \n ------------------------------");
    }

    public void listarAlunos() {
        System.out.println("\nM | Nome | matematica | portugues | informatica | historia | média final | situação");
        for (Aluno aluno : lista) {
            System.out.println(aluno);
        }
        System.out.println("------------------\n");
    }
    public void insercaoNoBoletim() {
        listarAlunos();
        Aluno a = pegarMatriculaAluno();
        if(a == null){
            System.out.println("Matricula não encontrada");
            return;
        }else {
            System.out.print("MAT = ");
            a.boletim.setMatematica(teclado.nextFloat());
            System.out.print("POR = ");
            a.boletim.setPortugues(teclado.nextFloat());
            System.out.print("HIS = ");
            a.boletim.setHistoria(teclado.nextFloat());
            System.out.print("INF = ");
            a.boletim.setInformatica(teclado.nextFloat());
        }
        System.out.println("Notas cadastradas com sucesso! \n ------------------------------");
    }
    public void mostrarMediaAluno() {
        Aluno a = pegarMatriculaAluno();
        if (a == null) {
            System.out.println("Matricula não encontrada");
        } else {
            System.out.println(a.getNome() + " | média = " + a.boletim.mediaFinalAluno());
        }
    }

    private Aluno pegarMatriculaAluno() {
        System.out.print("Insira o Numero de Matricula do Aluno: ");
        int mat = teclado.nextInt();
        return buscarAlunoPorMatricula(mat);
    }

    private Aluno buscarAlunoPorMatricula(int mat) {
        for(Aluno aluno: lista){
            if(aluno.getMatricula() == mat){
                return aluno;
            }
        }
        return null;
    }
}
