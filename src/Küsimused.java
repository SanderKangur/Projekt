public class Küsimused {

    public static void väljastaKüsimused() throws Exception {
        väljastaAjalugu();
        väljastaGeograafia();
        väljastaMatemaatika();
        väljastaMeedia();
        väljastaTeadus();
        väljastaVaria();
    }

    public static void väljastaAjalugu() throws Exception {
        java.io.File fail = new java.io.File("Ajalugu.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }

    public static void väljastaGeograafia() throws Exception {
        java.io.File fail = new java.io.File("Geograafia.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }

    public static void väljastaMatemaatika() throws Exception {
        java.io.File fail = new java.io.File("Matemaatika.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }

    public static void väljastaMeedia() throws Exception {
        java.io.File fail = new java.io.File("Meedia.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }

    public static void väljastaTeadus() throws Exception {
        java.io.File fail = new java.io.File("Teadus.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }

    public static void väljastaVaria() throws Exception {
        java.io.File fail = new java.io.File("Varia.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }
}
