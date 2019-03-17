public class Mängija {
    private int mängija;
    private String nimi;

    public int getMängija() {
        return mängija;
    }

    public void setMängija(int mängija) {
        this.mängija = mängija;
    }

    public String getNimi() {
        return nimi;
    }

    public Mängija(int mängija, String nimi) {
        this.mängija = mängija;
        this.nimi = nimi;
    }
}
