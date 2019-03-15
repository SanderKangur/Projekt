import java.io.File;

public class Koht {
    private int nr;
    private String nimi;
    private File küs;
    private File vas;

    public int getNr() {
        return nr;
    }

    public String getNimi() {
        return nimi;
    }

    public File getKüs() {
        return küs;
    }

    public File getVas() {
        return vas;
    }

    public Koht(int nr, String nimi, File küs, File vas) {
        this.nr = nr;
        this.nimi = nimi;
        this.küs = küs;
        this.vas = vas;
    }
}
