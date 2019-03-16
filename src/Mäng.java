import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Mäng {
    public static void main(String[] args) throws Exception {
        //Reeglid.väljastaReeglid();
        //Küsimused.väljastaKüsimused();
        //Vastused.väljastaVastused();
        List<Koht> väli1=Väli.looVäli();

        int a=0;
        int mängija1 = 0;
        while (a<10){
            int i = (int)(Math.random()*6)+1;
            mängija1=mängija1+i;
            System.out.println(mängija1);
            //Küsimus.väljastaKüsimus(väli1.get(m1).getKüs(), väli1.get(m1).getVas());
            a++;
        }


    }
}

