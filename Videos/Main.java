public class Main {
    public static void main(String[] args) {
        // Criando o gerenciador
        GerenciadorRedesSociais gerenciador = new GerenciadorRedesSociais();

        // Criando o conteúdo
        Conteudo conteudo = new Conteudo("Promoção de lançamento!", "url_imagem");

        // Publicando nas redes sociais
        Publicacao publicacaoTwitter = gerenciador.publicar("Twitter", conteudo);
        Publicacao publicacaoInstagram = gerenciador.publicar("Instagram", conteudo);

        // Obtendo estatísticas
        Estatisticas estatisticasTwitter = gerenciador.obterEstatisticas("Twitter", publicacaoTwitter.getId());
        Estatisticas estatisticasInstagram = gerenciador.obterEstatisticas("Instagram", publicacaoInstagram.getId());

        // Exibindo resultados
        System.out.println("Estatísticas do Twitter: " + estatisticasTwitter.getCurtidas());
        System.out.println("Estatísticas do Instagram: " + estatisticasInstagram.getCurtidas());
    }
}
