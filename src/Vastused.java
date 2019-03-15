public class Vastused {
    public static void väljastaVastused() throws Exception {
        väljastaAjalugu();
        väljastaGeograafia();
        väljastaMatemaatika();
        väljastaMeedia();
        väljastaTeadus();
        väljastaVaria();
        väljastaTühi();
    }

    public static void väljastaAjalugu() throws Exception {
        java.io.File fail = new java.io.File("AjaluguVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Vastuste stackid");
        }
    }

    public static void väljastaGeograafia() throws Exception {
        java.io.File fail = new java.io.File("GeograafiaVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Vastuste stackid");
        }
    }

    public static void väljastaMatemaatika() throws Exception {
        java.io.File fail = new java.io.File("MatemaatikaVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("10");
            pw.println("8");
            pw.println("47");
            pw.println("0");
            pw.println("15");
        }
    }

    public static void väljastaMeedia() throws Exception {
        java.io.File fail = new java.io.File("MeediaVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Vastuste stackid");
        }
    }

    public static void väljastaTeadus() throws Exception {
        java.io.File fail = new java.io.File("TeadusVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Vastuste stackid");
        }
    }

    public static void väljastaVaria() throws Exception {
        java.io.File fail = new java.io.File("VariaVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Vastuste stackid");
        }
    }
    public static void väljastaTühi() throws Exception {
        java.io.File fail = new java.io.File("VariaVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("tühi");
        }
    }
}