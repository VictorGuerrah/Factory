import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjetoJavaScriptTest {
    @Test
    void deveCadastrarProjetoJavaScript() {
        InterfaceProjeto projeto = ProjetoFactory.obterProjeto("JavaScript");
        assertEquals("Projeto JavaScript cadastrado.", projeto.cadastrar());
    }

    @Test
    void deveRemoverProjetoJavaScript() {
        InterfaceProjeto projeto = ProjetoFactory.obterProjeto("JavaScript");
        assertEquals("Projeto JavaScript removido.", projeto.remover());
    }
}
