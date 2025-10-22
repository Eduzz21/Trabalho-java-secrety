// Classe Conteudo - Representa o conteúdo a ser postado
public class Conteudo {
    private String texto;
    private String imagemUrl;

    public Conteudo(String texto, String imagemUrl) {
        this.texto = texto;
        this.imagemUrl = imagemUrl;
    }

    // Getters e Setters
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }
}

