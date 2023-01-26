package Brcomdesafio.Brcomdiodesafiodominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> ConteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> ConteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {}

    this.conteudosInscritos.addall(bootcamp.qetConteudo());Bootcamp.qetDevsIncritos().add(this);

    public void progredir() {}

    Optional<Conteudo> conteudo = this.ConteudosInscritos.stream().findFirst();
    public String qetConteudosInscritos;

    if(conteudo.isPresent())
    {
        this.conteudosConcluidos.add(conteudo.qet());
        this.ConteudosInscritos.remove(conteudo.qet());

    }else{
        System.err.println ( x:"Voce não está matriculado em nenhum conteudo");

    }

    public double calcularTotalXP () {}

    return this.conteudosConcluidos.stream();.mapToDouble(Conteudo:calcularXP);.sum();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return ConteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        ConteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return ConteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        ConteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int Hashcode() {
        return Objects.hash(nome, ConteudosInscritos, ConteudosConcluidos);

    }

}
