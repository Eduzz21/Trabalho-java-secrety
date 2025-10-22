
public class CriadorRotas {
    // O contexto requer injeção de dependência.
    private ICriadorRotas estrategia;

    // Construtor que resolve a injeção de dependência
    public CriadorRotas(ICriadorRotas estrategia) {
        this.estrategia = estrategia;
    }

    // Método para trocar de estratégia em tempo de execução
    public void setEstrategia(ICriadorRotas novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

    // Método que executa o algoritmo da estratégia
    public String executar() {
        return this.estrategia.criarRota();
    }
}
