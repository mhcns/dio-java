import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descricao curso C#");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Janailson Freitas");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Janailson:" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Janailson: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Janailson: " + dev1.getConteudosConcluidos());
        System.out.println("XP Janailson: " + dev1.calcularTotalXP());


        /*Dev dev2 = new Dev();
        dev2.setNome("Maria Janaina");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + dev2.getConteudosInscritos());*/

    }
}
