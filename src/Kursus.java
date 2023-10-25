import java.util.Arrays;

public class Kursus {
    // Class
    private int kursusNr;
    private String kursusNavn;
    private int antalEcts;
    private String ugeDag;
    private String tid;
    private int antalDeltagere;
    private Studerende[] studerende;

    //constructor
    public Kursus(int kursusNr, String kursusNavn, int antalEcts, String ugeDag, String tid, int antalDeltagere){
        this.kursusNr = kursusNr;
        this.kursusNavn = kursusNavn;
        this.antalEcts = antalEcts;
        this.ugeDag = ugeDag;
        this.tid = tid;
        this.antalDeltagere = 0;
        this.studerende = new Studerende[40];
    }

    public Kursus(){

    }
    public int getKursusNr(){
        return kursusNr;
    }
    public void setKursusNr(int newkursusnr){
        this.kursusNr=newkursusnr;
    }
    public String getKursusNavn(){
        return kursusNavn;
    }
    public void setKursusNavn(String newkursusnavn){
        this.kursusNavn=newkursusnavn;
    }

    public int getAntalEcts(){
        return antalEcts;
    }

    public void setAntalEcts(int newantaletcs){
        this.antalEcts=newantaletcs;

    }
    public String getUgeDag(){
        return ugeDag;
    }

    public void setUgeDag(String newUgeDag){
        this.ugeDag = newUgeDag;
    }
    public String getTid(){
        return tid;
    }
    public void setTid(String newTid){
        this.tid = newTid;
    }

    public int getAntalDeltagere(){
        return antalDeltagere;
    }

    public void setAntalDeltagere(int newAntalDeltagere){
        this.antalDeltagere = newAntalDeltagere;
    }

    public Studerende[] getDeltager(){
        return studerende;
    }

    public void setDeltager(Studerende[] newDeltager){
        this.studerende = newDeltager;
    }

    @Override
    public String toString() {
        return "Kursus{" +
                "kursusNr=" + kursusNr +
                ", kursusNavn='" + kursusNavn + '\'' +
                ", antalEcts=" + antalEcts +
                ", ugeDag='" + ugeDag + '\'' +
                ", tid='" + tid + '\'' +
                ", Antal deltager= " + antalDeltagere;
    }

    public boolean tilfoejStuderende(Studerende s) {
        if (antalDeltagere <studerende.length) {
            studerende[antalDeltagere] = s;
            antalDeltagere++;
            return true;
        } else {
            return false;
        }
    }

    public void frameld(Studerende s) {
        for (int i = 0; i < antalDeltagere; i++) {
            if (studerende[i] == s) {
                for (int j = i; j < antalDeltagere - 1; j++) {
                    studerende[j] = studerende[j + 1];
                }
                studerende[antalDeltagere -1] = null;
                antalDeltagere--;
                return;
            }
        }
        System.out.println("Studerende eksisterer ikke i dette kursus");
    }
    public static void udskrivKursus(Kursus k){
        System.out.println(k);
        System.out.println("Deltager: ");
        for (int i = 0; i < k.getAntalDeltagere(); i++)
            System.out.println(k.getDeltager()[i]);
        }

    public static void main(String[] args){

        Kursus kursus1 = new Kursus(101, "Matematik", 5, "Mandag","10-12", 0);
        Studerende studerende1 = new Studerende(1,"mikkel","pelle","123 pellevej", "22558351");
        Studerende studerende2 = new Studerende(1,"Oliver","pelle","124 pellevej", "22558355");

        boolean res=kursus1.tilfoejStuderende(studerende1);
        if(res == false){
            System.out.println("Der er ikke plads");
        }
        kursus1.tilfoejStuderende(studerende2);
        udskrivKursus(kursus1);
        kursus1.frameld(studerende1);
        udskrivKursus(kursus1);
    }
}
