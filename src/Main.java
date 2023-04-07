import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição Curso Python");
        curso2.setCargaHoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        //devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Matheus:" + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());

        System.out.println("-------");

        Dev devTunnex = new Dev();
        devTunnex.setNome("Tunnex");
        devTunnex.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tunnex:" + devTunnex.getConteudosInscritos());
        devTunnex.progredir();
        devTunnex.progredir();
        devTunnex.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Tunnex:" + devTunnex.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Tunnex:" + devTunnex.getConteudosConcluidos());
        System.out.println("XP:" + devTunnex.calcularTotalXp());

    }

}
