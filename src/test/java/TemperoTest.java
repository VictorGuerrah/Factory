import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperoTest {
    @Test
    void deveCadastrarTempero() {
        Interface produto = Factory.obterProduto("Tempero");
        assertEquals("Tempero cadastrado", produto.cadastrar());
    }

    @Test
    void deveRemoverTempero() {
        Interface produto = Factory.obterProduto("Tempero");
        assertEquals("Tempero removido", produto.remover());
    }
}
