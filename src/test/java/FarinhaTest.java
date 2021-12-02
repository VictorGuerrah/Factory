import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarinhaTest {
    @Test
    void deveCadastrarFarinha() {
        Interface produto = Factory.obterProduto("Farinha");
        assertEquals("Farinha cadastrada", produto.cadastrar());
    }

    @Test
    void deveRemoverFarinha() {
        Interface produto = Factory.obterProduto("Farinha");
        assertEquals("Farinha removida", produto.remover());
    }
}
