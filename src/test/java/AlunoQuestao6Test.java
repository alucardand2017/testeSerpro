import dominio.AlunoQuestao6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoQuestao6Test {
    @Test
    public void CalculaAMediaDeNotasDeUmAluno(){
        AlunoQuestao6 alunoQuestao6 = new AlunoQuestao6();
        alunoQuestao6.setNotaCiencias(10);
        alunoQuestao6.setNotaMatematica(10);
        alunoQuestao6.setNotaPortugues(10);
        Assertions.assertTrue(alunoQuestao6.calculaMedia() == 10);
    }
}
