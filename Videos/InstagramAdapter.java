// Adapter para Instagram
public class InstagramAdapter implements GerenciadorMidiaSocial {
    @Override
    public Publicacao agendarPost(Conteudo conteudo) {
        // Simula a interação com a API do Instagram
        System.out.println("Agendando post no Instagram: " + conteudo.getTexto());
        return new Publicacao("54321", "Instagram", "Agendado");
    }

    @Override
    public Publicacao publicarConteudo(Conteudo conteudo) {
        // Simula a publicação no Instagram
        System.out.println("Publicando no Instagram: " + conteudo.getTexto());
        return new Publicacao("54321", "Instagram", "Publicado");
    }

    @Override
    public Estatisticas obterEstatisticas(String idPublicacao) {
        // Simula a obtenção de estatísticas do Instagram
        System.out.println("Obtendo estatísticas do Instagram para a publicação " + idPublicacao);
        return new Estatisticas(250, 30, 15); // Exemplo fixo
    }
}
