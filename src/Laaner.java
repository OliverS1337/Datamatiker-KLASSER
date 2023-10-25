public class Laaner {
    int laanerID;
    String laanerNavn;
    String laanerAdresse;
    String laanerMobil;
    public Laaner(int laanerID, String laanerNavn, String laanerAdresse, String laanerMobil){
        this.laanerID = laanerID;
        this.laanerNavn=laanerNavn;
        this.laanerAdresse = laanerAdresse;
        this.laanerMobil = laanerMobil;
    }
    public int getLaanerID() {
        return laanerID;
    }
    public void setLaanerID(int laanerID) {
        this.laanerID = laanerID;
    }
    public String getLaanerNavn() {
        return laanerNavn;
    }
    public void setLaanerNavn(String laanerNavn) {
        this.laanerNavn = laanerNavn;
    }
    public String getLaanerAdresse() {
        return laanerAdresse;
    }
    public void setLaanerAdresse(String laanerAdresse) {
        this.laanerAdresse = laanerAdresse;
    }
    public String getLaanerMobil() {
        return laanerMobil;
    }
    public void setLaanerMobil(String laanerMobil) {
        this.laanerMobil = laanerMobil;
    }
    @Override
    public String toString() {
        return "Laaner{" +
                "laanerID=" + laanerID +
                ", laanerNavn='" + laanerNavn + '\'' +
                ", laanerAdresse='" + laanerAdresse + '\'' +
                ", laanerMobil='" + laanerMobil + '\'' +
                '}';
    }
    public static void main(String [] args){
     Laaner laaner1 = new Laaner(2,"Mads","Hørve","iphone");
        System.out.println(laaner1);

    }
}
