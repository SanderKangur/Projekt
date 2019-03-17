import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Mäng {
    public static void main(String[] args) throws Exception {
        //Reeglid.väljastaReeglid();
        //Küsimused.väljastaKüsimused();
        //Vastused.väljastaVastused();
        List<Koht> väli1=Väli.looVäli();
        Nupud nupud1= new Nupud(false,false,false,false,false,false);

        boolean mäng=true;
        Mängija mängija1 = new Mängija(0);
        while (mäng==true){
            int i= (int)(Math.random()*6)+1;
            System.out.println("Täring: " + i);
            mängija1.setMängija(mängija1.getMängija()+i);
            Küsimus.väljastaKüsimus(väli1.get(mängija1.getMängija()).getKüs(), väli1.get(mängija1.getMängija()).getVas(), nupud1, mängija1);
           if(nupud1.isMata()==true){
               break;
           }

        }


    }
}

