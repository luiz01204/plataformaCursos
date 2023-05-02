import com.luiz01204.modelos.Aluno;
import com.luiz01204.modelos.BootCamp;
import com.luiz01204.modelos.Curso;
import com.luiz01204.modelos.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java basico","Introdução ao java!",8);
        Curso curso2 = new Curso("Java Intermediario","Avançando no java!",12);
        Mentoria mentoria1 = new Mentoria("Dicas Java","3h de muitas dicas Java.");

        BootCamp bootCamp1 = new BootCamp("Java developer","Tudo sobre java!");
        bootCamp1.getConteudos().add(curso1);
        bootCamp1.getConteudos().add(curso2);
        bootCamp1.getConteudos().add(mentoria1);

        Aluno aluno1 = new Aluno("Luiz");
        Aluno aluno2 = new Aluno("Afonso");

        aluno1.increverBootCamp(bootCamp1);
        aluno1.increverBootCamp(bootCamp1);

        System.out.println(aluno1);
        aluno1.progredir();
        System.out.println(aluno1);
        System.out.println("Xp do aluno: " + aluno1.calculaXp());

        System.out.println(bootCamp1.getAlunosInscritos());



    }
}