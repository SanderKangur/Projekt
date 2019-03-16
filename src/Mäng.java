import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Mäng {
    public static void main(String[] args) throws Exception {
        Reeglid.väljastaReeglid();
        Küsimused.väljastaKüsimused();
        Vastused.väljastaVastused();
        ArrayList mängija1=Väli.looVäli();
        System.out.println("HELLo");
        Koht jeu = new Koht(0, "jeu", new File("C:\\Users\\Sander\\IdeaProjects\\Projekt\\Matemaatika.txt"), new File ("C:\\Users\\Sander\\IdeaProjects\\Projekt\\MatemaatikaVastused.txt"));
        Küsimus.väljastaKüsimus(jeu.getKüs(), jeu.getVas());


    }
}

