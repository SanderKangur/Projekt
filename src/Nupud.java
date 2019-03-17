public class Nupud {
    private boolean aja;
    private boolean geo;
    private boolean mata;
    private boolean meedia;
    private boolean teadus;
    private boolean varia;

    public Nupud(boolean aja, boolean geo, boolean mata, boolean meedia, boolean teadus, boolean varia) {
        this.aja = aja;
        this.geo = geo;
        this.mata = mata;
        this.meedia = meedia;
        this.teadus = teadus;
        this.varia = varia;
    }

    public boolean isAja() {
        return aja;
    }

    public boolean isGeo() {
        return geo;
    }

    public boolean isMata() {
        return mata;
    }

    public boolean isMeedia() {
        return meedia;
    }

    public boolean isTeadus() {
        return teadus;
    }

    public boolean isVaria() {
        return varia;
    }

    public void setAja(boolean aja) {
        this.aja = aja;
    }

    public void setGeo(boolean geo) {
        this.geo = geo;
    }

    public void setMata(boolean mata) {
        this.mata = mata;
    }

    public void setMeedia(boolean meedia) {
        this.meedia = meedia;
    }

    public void setTeadus(boolean teadus) {
        this.teadus = teadus;
    }

    public void setVaria(boolean varia) {
        this.varia = varia;
    }
}
