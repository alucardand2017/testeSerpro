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
            System.out.println("DIGITE UMA DAS OPÇÕES: \n1) listar alunos \n2) inserir aluno \n3) \n4) \n5) \n6) Sair");
            String opcaoMenu1 = teclado.next();
            switch (opcaoMenu1) {
                case "1":
                    alunoService.listarAlunos();
                    break;
                case "2":
                    alunoService.cadastrarAluno();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    loopPrograma = false;
                    break;
            }
            System.out.println("Saindo do programa");
        }
    }
}
