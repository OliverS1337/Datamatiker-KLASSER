public class Studerende {
    private int stdNr;
    private String  fnavn;
    private String enavn;
    private String adresse;
    private String mobil;

    public Studerende(int stdNr, String fnavn, String enavn, String adresse, String mobil){
        this.stdNr = stdNr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.mobil = mobil;
    }
    public Studerende(){

    }

    public void setStdNr(int newStdNr) {
        this.stdNr = newStdNr;

    }
    public int getStdNr() {
        return stdNr;
    }

    public void setFnavn(String newfnavn){
        this.fnavn=newfnavn;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setEnavn(String newEnavn) {
        this.enavn = newEnavn;
    }

    public String getEnavn(){
        return enavn;
    }

    public void setadresse(String newadresse){
        this.adresse=newadresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setMobil(String newMobil) {
        this.mobil = newMobil;
    }

    public String getMobil(){
        return mobil;
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "stdNr=" + stdNr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", mobil='" + mobil + '\'' +
                '}';
    }

    public static void main(String [] args){
        Studerende studerende1 = new Studerende(1,"mikkel","pelle","123 pellevej", "22558351");
        System.out.println(studerende1);

    }
}

