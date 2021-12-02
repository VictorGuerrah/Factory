import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OvoTest {
    @Test
    void deveCadastrarOvo() {
        Interface produto = Factory.obterProduto("Ovo");
        assertEquals("Ovo cadastrado", produto.cadastrar());
    }

    @Test
    void deveRemoverOvo() {
        Interface produto = Factory.obterProduto("Ovo");
        assertEquals("Ovo removido", produto.remover());
    }
}
