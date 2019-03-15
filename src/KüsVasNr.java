public class KüsVasNr {
    private String Küs;
    private String Vas;
    private int nr;

    public KüsVasNr(String küs, String vas, int nr) {
        Küs = küs;
        Vas = vas;
        this.nr = nr;
    }

    public String getKüs() {
        return Küs;
    }

    public String getVas() {
        return Vas;
    }

    public int getNr() {
        return nr;
    }

    @Override
    public String toString() {
        return "KüsVasNr{" +
                "Küs='" + Küs + '\'' +
                ", Vas='" + Vas + '\'' +
                ", nr=" + nr +
                '}';
    }
}
