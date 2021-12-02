

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    @Test
    void deveRetornarExcecaoParaProdutoInexistente() {
        try {
            Interface produto = Factory.obterProduto("Arroz");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Produto inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaProdutoInvalido() {
        try {
            Interface produto = Factory.obterProduto("Bolo");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Produto inválido", e.getMessage());
        }
    }
}
