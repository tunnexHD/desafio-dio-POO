import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição Curso Python");
        curso2.setCargaHoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Python");
        mentoria.setDescricao("Descrição Mentoria Python");
        mentoria.setData(LocalDate.now());



        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
    }
}
