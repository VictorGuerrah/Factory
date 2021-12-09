import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjetoFactoryTest {
    @Test
    void deveRetornarExcecaoParaProjetoInexistente() {
        try {
            InterfaceProjeto projeto = ProjetoFactory.obterProjeto("C#");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Projeto inexistente.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaProjetoInvalido() {
        try {
            InterfaceProjeto projeto = ProjetoFactory.obterProjeto("Java");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Projeto inválido.", e.getMessage());
        }
    }
}
