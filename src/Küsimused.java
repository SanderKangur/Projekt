 class Küsimused {

     static void väljastaKüsimused() throws Exception {
        väljastaAjalugu();
        väljastaGeograafia();
        väljastaMatemaatika();
        väljastaMeedia();
        väljastaTeadus();
        väljastaVaria();
    }

     static void väljastaAjalugu() throws Exception {
        java.io.File fail = new java.io.File("Ajalugu.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }

     static void väljastaGeograafia() throws Exception {
        java.io.File fail = new java.io.File("Geograafia.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }

     static void väljastaMatemaatika() throws Exception {
        java.io.File fail = new java.io.File("Matemaatika.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("5+5");
            pw.println("16/2");
            pw.println("55-8");
            pw.println("14*0");
            pw.println("|-15|");
        }
    }

     static void väljastaMeedia() throws Exception {
        java.io.File fail = new java.io.File("Meedia.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }

     static void väljastaTeadus() throws Exception {
        java.io.File fail = new java.io.File("Teadus.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }

     static void väljastaVaria() throws Exception {
        java.io.File fail = new java.io.File("Varia.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Küsimuste stackid");
        }
    }
}
