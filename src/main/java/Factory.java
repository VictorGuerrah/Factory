




    public class Factory {
        public static Interface obterProduto(String produto) {
            Class classe = null;
            Object objeto = null;
            try {
                classe = Class.forName("Produto" + produto);
                objeto = classe.newInstance();
            } catch (Exception ex) {
                throw new IllegalArgumentException("Produto inexistente");
            }
            if (!(objeto instanceof Interface)) {
                throw new IllegalArgumentException("Produto inválido");
            }
            return (Interface) objeto;
        }
    }