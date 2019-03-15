public class Reeglid {

    public static void väljastaReeglid() throws Exception {
        java.io.File fail = new java.io.File("Reeglid.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Tere!");
            pw.println();
            pw.println("Mängu võitmiseks on kaks võimalust: ");
            pw.println("1) Kogu kokku kõigi 6 kategooria nupud");
            pw.println("2) Jõua esimesena lõppu");
            pw.println("Kategooriad on: Matemaatika, Meedia, Ajalugu, Geograafia, Teadus, Varia");
            pw.println();
            pw.println("Kasutajal on mängu alguses võimalik valida: ");
            pw.println("Täringutahkude arv - Mõjutab esimesena lõppu jõudmise võiduvõimalusi");
            pw.println("Mängutüüp - Saab lisada joomise või füüsilised tegevused");
            pw.println("Raskusaste - Mõjutab shoots/ladders arvu ja küsimuste raskust");
            pw.println();
            pw.println("Mänguväli: ");
            pw.println("Väljal on kategooriatele vastavad kohad, shoots/ladders");
            pw.println();
            pw.println("EDU!");
        }
    }
}
