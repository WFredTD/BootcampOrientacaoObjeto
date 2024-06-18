import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1. setTitulo("Curso Java");
        curso1.setDescricao("Descrição curo Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2. setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curo JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWalter = new Dev();
        devWalter.setNome("Walter");
        devWalter.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Walter: " + devWalter.getConteudosInscritos());
        devWalter.progredir();
        devWalter.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Walter: " + devWalter.getConteudosInscritos());
        System.out.println("Conteudos concluidos Walter: " + devWalter.getConteudosConcluidos());
        System.out.println("XP: " + devWalter.calcularTotalXp());

        System.out.println("====x===x===x===");
        
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }

    
}
