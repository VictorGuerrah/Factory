import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjetoJavaTest {
    @Test
    void deveCadastrarProjetoJava() {
        InterfaceProjeto projeto = ProjetoFactory.obterProjeto("Java");
        assertEquals("Projeto Java cadastrado.", projeto.cadastrar());
    }

    @Test
    void deveRemoverProjetoJava() {
        InterfaceProjeto projeto = ProjetoFactory.obterProjeto("Java");
        assertEquals("Projeto Java removido.", projeto.remover());
    }
}
