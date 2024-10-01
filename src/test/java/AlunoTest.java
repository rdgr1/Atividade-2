import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    @Test
    void exibirInfo(){
        Aluno aluno = new Aluno("João",23,"U918293C");
        Assertions.assertEquals("João",aluno.getNome());
        Assertions.assertEquals(23,aluno.getIdade());
        Assertions.assertEquals("U918293C",aluno.getMatricula());
    }
}
