import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Mäng {
    public static void main(String[] args) throws Exception {
        //Reeglid.väljastaReeglid();
        //Küsimused.väljastaKüsimused();
        //Vastused.väljastaVastused();

        List<Koht> väli1=Väli.looVäli();
        List<Koht> väli2=Väli.looVäli();
        List<Koht> väli3=Väli.looVäli();

        Nupud nupud1= new Nupud(false,false,false,false,false,false);
        Nupud nupud2= new Nupud(false,false,false,false,false,false);
        Nupud nupud3= new Nupud(false,false,false,false,false,false);

        Mängija mängija1 = new Mängija(0, "Mängija1");
        Mängija mängija2 = new Mängija(0, "Mängija2");
        Mängija mängija3 = new Mängija(0, "Mängija3");

        boolean mäng=true;
        while (mäng){
            Küsimus.väljastaKüsimus(väli1.get(mängija1.getMängija()).getKüs(), väli1.get(mängija1.getMängija()).getVas(), nupud1, mängija1);
            if(nupud1.isMata() && nupud1.isMeedia() && nupud1.isVaria() && nupud1.isTeadus() && nupud1.isGeo() && nupud1.isAja()){
               System.out.println("võitis mängija1");
               mäng=false;
            }

           Küsimus.väljastaKüsimus(väli2.get(mängija2.getMängija()).getKüs(), väli2.get(mängija2.getMängija()).getVas(), nupud2, mängija2);
           if(nupud2.isMata() && nupud2.isMeedia() && nupud2.isVaria() && nupud2.isTeadus() && nupud2.isGeo() && nupud2.isAja()){
               System.out.println("võitis mängija2");
               mäng = false;
           }

           Küsimus.väljastaKüsimus(väli3.get(mängija3.getMängija()).getKüs(), väli3.get(mängija3.getMängija()).getVas(), nupud3, mängija3);
           if(nupud3.isMata() && nupud3.isMeedia() && nupud3.isVaria() && nupud3.isTeadus() && nupud3.isGeo() && nupud3.isAja()){
               System.out.println("võitis mängija3");
               mäng = false;
           }
        }
    }
}

