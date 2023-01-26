import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Brcomdesafio.Brcomdiodesafiodominio.Bootcamp;
import Brcomdesafio.Brcomdiodesafiodominio.Conteudo;
import Brcomdesafio.Brcomdiodesafiodominio.Curso;
import Brcomdesafio.Brcomdiodesafiodominio.Dev;
import Brcomdesafio.Brcomdiodesafiodominio.Mentoria;

public class Main {

    private static final Bootcamp DevMaria = null;
    private static Object Bootcamp;

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescriçao("Descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescriçao("curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescriçao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescriçao("Descriçao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.print(curso1);
        System.out.print(curso2);
        System.out.print(mentoria);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Camila");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito" + devCarlos.qetConteudosInscritos);

        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos" + devCarlos.qetConteudosInscritos);
        System.out.println("Conteudos concluidos" + devCarlos.qetConteudosInscritos);
        System.out.println("XP:" + devCarlos.calcularTotalXP());

        System.out.println(".");

        Dev dvMaria = new Dev();
        DevMaria.setNome("Maria");
        DevMaria.InscreverBootcamp(Bootcamp);
        System.out.println("Conteudo Inscrito" + Brcomdesafio.Brcomdiodesafiodominio.Bootcamp.qetConteudosInscritos);

        DevMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos" + Brcomdesafio.Brcomdiodesafiodominio.Bootcamp.qet.ConteudosInscritos);
        System.out.println("XP:" + DevMaria.calcularTotalXP());

    }

}
