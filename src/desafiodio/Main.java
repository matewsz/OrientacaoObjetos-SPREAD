
package desafiodio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("BootCamp java");
        curso1.setDescricao("Spread development");
        curso1.setCargaHoraria(20);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript web");
        curso2.setDescricao("Criando seu primeiro site com javascript");
        curso2.setCargaHoraria(10);
        
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao da mentoria java");
        mentoria.setData(LocalDate.now());
        
        /*System.out.println(curso1); 
        System.out.println(curso2);
        System.out.println(mentoria);*/
        
        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        
        System.out.println("\n=*=*=*=*=*=*=*=*= [DEV 1] *=*=*=*=*=*=*=*=\n");

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootCamp(bootcamp);
        System.out.println("CONTEÚDOS INSCRITOS MATEUS: "+ devMateus.getConteudosInscritos());
        System.out.println("");
        devMateus.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("CONTEÚDOS CONCLUÍDOS MATEUS: "+ devMateus.getConteudosConcluidos());
        System.out.println("XP:"+devMateus.calcularTotalXp());
        
        System.out.println("\n=*=*=*=*=*=*=*=*= [DEV 2] *=*=*=*=*=*=*=*=\n");
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("CONTEÚDOS INSCRITOS JOÃO: "+ devJoao.getConteudosInscritos());
        System.out.println("");
        devJoao.progredir();
        System.out.println("CONTEÚDOS CONCLUÍDOS JOÃO: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP:"+devJoao.calcularTotalXp());
        
        
    }
    
}
