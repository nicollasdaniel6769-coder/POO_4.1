public class SimulacaoConexao {

    public static void main(String[] args) {
        try {
            System.out.println("Abrindo conexão...");
            throw new RuntimeException("Falha ao ler os dados da conexão");
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Conexão encerrada com sucesso.");
        }
    }
}
