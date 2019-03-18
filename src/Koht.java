import java.io.File;

 class Koht {
    private int nr;
    private String nimi;
    private File küs;
    private File vas;

     int getNr() {
        return nr;
    }

     String getNimi() {
        return nimi;
    }

     File getKüs() {
        return küs;
    }

     File getVas() {
        return vas;
    }

     Koht(int nr, String nimi, File küs, File vas) {
        this.nr = nr;
        this.nimi = nimi;
        this.küs = küs;
        this.vas = vas;
    }
}
