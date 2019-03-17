import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Väli {
    //Loob mänguvälja mängijale

    public static ArrayList<Koht> looVäli(){
        File mata = new File("Matemaatika.txt");
        File matav = new File("MatemaatikaVastused.txt");
        File aja = new File("Ajalugu.txt");
        File ajav = new File("AjaluguVastused.txt");
        File meedia = new File("Meedia.txt");
        File meediav = new File("MeediaVastused.txt");
        File varia = new File("Varia.txt");
        File variav = new File("VariaVastused.txt");
        File geo = new File("Geograafia.txt");
        File geov = new File("GeograafiaVastused.txt");
        File teadus = new File("Teadus.txt");
        File teadusv = new File("TeadusVastused.txt");
        File tühi = new File("tühi.txt");
        File üles=new File("üles.txt");
        File alla=new File("alla.txt");


        ArrayList<Koht> väli = new ArrayList<>();
        väli.add(0, new Koht(0,"0", tühi, tühi));
        for (int i = 1; i<56; i=i+9){
            String koht = Integer.toString(i);
            väli.add(i, new Koht(i, koht, üles, üles));
            väli.add(i+1, new Koht(i, koht, aja, ajav));
            väli.add(i+2, new Koht(i, koht, meedia, meediav));
            väli.add(i+3, new Koht(i, koht, mata, matav));
            väli.add(i+4, new Koht(i, koht, tühi, tühi));
            väli.add(i+5, new Koht(i, koht, geo, geov));
            väli.add(i+6, new Koht(i, koht, teadus, teadusv));
            väli.add(i+7, new Koht(i, koht, varia, variav));
            väli.add(i+8, new Koht(i, koht, alla, alla));
        }
        return väli;
    }
}
