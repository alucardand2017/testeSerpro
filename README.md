# Como o programa funciona:

* Commit 1 - Implementado as funcionalidades referentes as questoes 1 e 3
* Commit 2 - Implementado as funcionalidades referentes as questoes 2, 4, 5 e 6.


**(TELA INICIAL)**

```
DIGITE UMA DAS OPÇÕES: 
1) inserir novo aluno 
2) listar alunos 
3) inserir notas 
4) mostrar media aluno 
6) Sair
```
1. Permite que voce insira um aluno no banco de dados, onde você deverá digitar nome (caracteres) e matricula (apenas numeros)
```
Nome do Aluno: Anderson
Matricula do Aluno: 1000
```
2. Lista os alunos alunos do banco de dados, mostrando a matricula, nome e notas das matérias especificas.
```
M | Nome | matematica | portugues | informatica | historia
1000 | Anderson | MAT: 0.0 | POR: 0.0 | HIS: 0.0 | INF: 0.0 | média = 0.0
------------------------------
```
3. Permite que você insira as notas do aluno, solicitando que você digite a matricula do aluno inicialmente, e caso confirmado a existencia no banco de dados, as notas das materias espeficicas.
```
Insira o Numero de Matricula do Aluno: 1000
MAT = 9
POR = 8
HIS = 7
INF = 10
Notas cadastradas com sucesso! 
------------------------------
```
5. Exibe a média que um aluno tem mediante a pesquisa pelo seu numero de matricula.
```
Insira o Numero de Matricula do Aluno: 1000
Anderson | média = 8.5
```
6. Sai do programa.

 
# Enunciado
Teste da prova do Serpro elaborado por um colega de grupo.

Contexto: Uma instituição de ensino deseja desenvolver um sistema simples de gerenciamento de alunos. Este sistema deve ser capaz de armazenar informações básicas dos alunos, como nome, matrícula e notas das disciplinas cursadas.

Requisitos:

O sistema deve permitir a inserção de um novo aluno, com nome e número de matrícula.
Deve ser possível inserir notas para cada aluno em disciplinas específicas.
O sistema deve listar todos os alunos e suas respectivas notas.
Deve ser possível calcular a média das notas de um aluno.
O sistema deve identificar e listar alunos com média abaixo de 7.0, considerando-os como "em recuperação".

Questão 1: Desenvolver um programa que permita a inserção de um novo aluno com as informações de nome e matrícula. (Avaliação da funcionalidade básica do sistema)

Questão 2: Expanda o programa anterior para que possa inserir notas para cada aluno em disciplinas específicas. (Manipulação de estruturas de dados)

Questão 3: Desenvolva uma funcionalidade que liste todos os alunos e suas respectivas notas. (Manipulação e exibição de dados)

Questão 4: Implemente uma função que calcule a média das notas de um aluno específico. (Cálculo e manipulação de dados)

Questão 5: No código a seguir, identifique e corrija os erros que impedem o correto funcionamento do sistema. (Análise e correção de código-fonte)

```Java
    public class Aluno {
    
    private String nome;
    private int matricula;
    private double nota1, nota2, nota3;
    
    public String getNome() {
        return nome
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula == matricula;
    }
    
    public double calculaMedia() {
        return (nota1 + nota2 + nota3) / 2;
    }
    }
```
* Questão 6: Refatore o código acima para que esteja de acordo com as boas práticas de desenvolvimento, mantendo a sua funcionalidade. (Refatoração e Clean Code)
```Java
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

```
  
* Questão 7: Desenvolva um teste unitário para validar a funcionalidade de cálculo da média das notas de um aluno. (Elaboração de testes)
* Instruções:
Utilize a linguagem Java para o desenvolvimento da solução.
Atenção à sintaxe e boas práticas de programação.
Avalie o resultado (saída do software) e garanta a correta execução do software a partir dos requisitos descritos.

