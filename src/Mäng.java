import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Mäng {
    public static void main(String[] args) throws Exception {
        //Reeglid.väljastaReeglid();
        //Küsimused.väljastaKüsimused();
        ArrayList mängija1=Väli.looVäli();
        Koht jeu = mängija1.get(1);
        System.out.println(jeu.getKüs());
        //System.out.println((mängija1.get(1)).getKüs());
        Küsimus.väljastaKüsimus(jeu.getKüs(), jeu.getVas());

    }
}

