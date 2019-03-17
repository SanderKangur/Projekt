import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Küsimus {
    //Võtab küsimuse ja kontrollib kohe ära, kas vastus on õige

    public static void väljastaKüsimus(File f1, File f2,Nupud nupud, Mängija mängija) throws Exception {

        KüsVasNr põhi = choose(f1, f2);
        String küss = põhi.getKüs();
        System.out.println(põhi);
        String kategooria = f1.getName().replaceFirst("[.][^.]+$", "");
        if(kategooria.equalsIgnoreCase("Üles")){
            mängija.setMängija(mängija.getMängija()+4);
        }
        if(kategooria.equalsIgnoreCase("Alla")){
            mängija.setMängija(mängija.getMängija()-4);
        }
        if(kategooria.equalsIgnoreCase("Tühi")){
        }
        else {
            String paus = JOptionPane.showInputDialog(null, "Vajuta enterit", kategooria, JOptionPane.QUESTION_MESSAGE);
            String sisestatakse = JOptionPane.showInputDialog(null, küss, kategooria, JOptionPane.QUESTION_MESSAGE);
            if (sisestatakse.equalsIgnoreCase(põhi.getVas())) {
                System.out.println("Õige");
                if (kategooria.equalsIgnoreCase("Matemaatika")) {
                    nupud.setMata(true);
                }
                if (kategooria.equalsIgnoreCase("Meedia")) {
                    nupud.setMeedia(true);
                }
                if (kategooria.equalsIgnoreCase("Ajalugu")) {
                    nupud.setAja(true);
                }
                if (kategooria.equalsIgnoreCase("Geograafia")) {
                    nupud.setGeo(true);
                }
                if (kategooria.equalsIgnoreCase("Teadus")) {
                    nupud.setTeadus(true);
                }
                if (kategooria.equalsIgnoreCase("Varia")) {
                    nupud.setVaria(true);
                }
            } else {
                System.out.println("Vale");
            }
        }
    }

    public static KüsVasNr choose(File f1, File f2) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(f1));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        int nr = (int) (Math.random() * lines);
        String küs = Files.readAllLines(Paths.get(f1.getPath())).get(nr);
        String vas = Files.readAllLines(Paths.get(f2.getPath())).get(nr);

        return new KüsVasNr(küs, vas, nr);
    }

}
