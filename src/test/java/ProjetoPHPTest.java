import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjetoPHPTest {
    @Test
    void deveCadastrarProjetoPHP() {
        InterfaceProjeto projeto = ProjetoFactory.obterProjeto("PHP");
        assertEquals("Projeto PHP cadastrado.", projeto.cadastrar());
    }

    @Test
    void deveRemoverProjetoPHP() {
        InterfaceProjeto projeto = ProjetoFactory.obterProjeto("PHP");
        assertEquals("Projeto PHP removido.", projeto.remover());
    }
}