package Brcomdesafio.Brcomdiodesafiodominio;

public abstract class Conteudo {

    protected final double XP_PADRAO = 10d;

    private String Titulo;
    private String Descriçao;

    public abstract double calcularXP();

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescriçao() {
        return Descriçao;
    }

    public void setDescriçao(String descriçao) {
        Descriçao = descriçao;
    }

}
