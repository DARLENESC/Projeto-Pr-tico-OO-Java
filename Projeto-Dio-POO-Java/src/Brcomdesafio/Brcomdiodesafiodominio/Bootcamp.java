package Brcomdesafio.Brcomdiodesafiodominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    public static final String qetConteudosInscritos = null;

    public static final String qet = null;

    private String nome;

    private String descriçao;

    private final LocalDate datainicial = LocalDate.now();

    private final LocalDate datafinal = datainicial.plusDays(45);

    private Set<Dev> devsInscritos = new HashSet<>();

    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void InscreverBootcamp(Object bootcamp) {
    }

    public void progredir() {
    }

    public String calcularTotalXP() {
        return null;
    }

}