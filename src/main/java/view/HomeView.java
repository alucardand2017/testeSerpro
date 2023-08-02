package view;

import dominio.Aluno;
import services.AlunoService;

import java.util.Scanner;

public class HomeView {
    public static void menuPrincipal() {
        AlunoService alunoService = new AlunoService();
        Scanner teclado = new Scanner(System.in);
        boolean loopPrograma = true;
        while (loopPrograma) {
            System.out.println("DIGITE UMA DAS OPÇÕES: \n1) inserir novo aluno \n2) listar alunos \n3) inserir notas \n4) mostrar media aluno \n6) Sair");
            String opcaoMenu1 = teclado.next();
            switch (opcaoMenu1) {
                case "1":
                    alunoService.cadastrarAluno();
                    break;
                case "2":
                    alunoService.listarAlunos();
                    break;
                case "3":
                    alunoService.insercaoNoBoletim();
                    break;
                case "4":
                    alunoService.mostrarMediaAluno();
                    break;
                case "5":
                    break;
                case "6":
                    loopPrograma = false;
                    break;
            }
        }
        System.out.println("Saindo do programa");
    }
}
