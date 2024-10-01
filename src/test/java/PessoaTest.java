import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    void exibirInfo(){
        Pessoa p = new Pessoa("Rodger",21);
        Assertions.assertEquals("Rodger",p.getNome());
        Assertions.assertEquals(21,p.getIdade());
    }
}
