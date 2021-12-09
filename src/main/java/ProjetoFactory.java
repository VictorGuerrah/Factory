public class ProjetoFactory {
    public static InterfaceProjeto obterProjeto(String projeto) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Projeto" + projeto);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Projeto inexistente.");
        }
        if (!(objeto instanceof InterfaceProjeto)) {
            throw new IllegalArgumentException("Projeto inválido.");
        }
        return (InterfaceProjeto) objeto;
    }
}
