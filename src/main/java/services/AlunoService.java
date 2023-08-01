package services;

import dominio.Aluno;

import javax.management.timer.Timer;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoService {
    ArrayList<Aluno> lista = new ArrayList<Aluno>();
    public void cadastrarAluno(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome do Aluno: ");
        String nome = teclado.nextLine().trim();
        System.out.print("Matricula do Aluno: ");
        int NumMatricula = Integer.parseInt(teclado.nextLine().trim());
        Aluno aluno = new  Aluno(nome, NumMatricula);
        lista.add(aluno);
        System.out.println("Aluno cadastrado com sucesso! \n ------------------------------");
    }
    public void listarAlunos() {
        for(int i = 0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
