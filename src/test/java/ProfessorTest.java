import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProfessorTest {
    @Test
    void exibirInfo(){
        Professor p = new Professor("Claudio",49,2000.00);
        Assertions.assertEquals("Claudio",p.getNome());
        Assertions.assertEquals(49,p.getIdade());
        Assertions.assertEquals(2000.00,p.getSalario());
    }
}
