public class Bog {

    private int bogId;
    private String titel;
    private String forfatter;
    private boolean udlaant;        //true hvis bogen er udlånt, ellers false
                                    //navnet på den som har lånt bogen, ellers laaner=""
    private String udlaansDato;     //Datoen bogen er udlånt, hvis ikke udlånt så er udlaansDato=""
    private Laaner laaner;

    // Constructor
    public Bog(int bogId, String titel, String forfatter) {
        this.bogId = bogId;
        this.titel = titel;
        this.forfatter = forfatter;
        this.udlaant = udlaant;
        this.udlaansDato = udlaansDato;
        this.laaner = null;
    }

    public Bog() {
    }

    public int getBogId() {
        return bogId;
    }

    public void setBogId(int newBogId) {
        this.bogId = newBogId;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String newTitel) {
        this.titel = newTitel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String newForfatter) {
        this.forfatter = newForfatter;
    }

    public boolean isUdlaant() {
        return udlaant;
    }

    public void setUdlaant(boolean udlaant) {
        this.udlaant = udlaant;
    }

    public Laaner getLaaner() {
        return laaner;
    }

    public void setLaaner(Laaner laaner) {
        this.laaner = laaner;
    }

    public String getUdlaansDato() {
        return udlaansDato;
    }

    public void setUdlaansDato(String udlaansDato) {
        this.udlaansDato = udlaansDato;
    }

    public boolean udlaanBog(Laaner laanerNavn, String dato) {
        if (this.udlaant == false){
            this.laaner = laanerNavn;
            this.udlaansDato = dato;
            this.udlaant = true;
            return true;
            
        } else{
            return false;
        }
    }

    public void afleverBog() {
        this.udlaant = false;
        this.laaner = null;
        this.udlaansDato = "";
    }

    @Override
    public String toString() {
        return "Bog{" +
                "bogId=" + bogId +
                ", titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", udlaant=" + udlaant +
                ", laaner='" + laaner + '\'' +
                ", udlaansDato='" + udlaansDato + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Bog bog1 = new Bog(1, "Software Solutions", "Lewis and Loftus");
        Bog bog2 = new Bog(2, "Core Java", "Horstman Cornell");
        Laaner laaner1 = new Laaner(1, "Mikkel", "pellevænget 3", "55302210");

        bog1.udlaanBog(laaner1, "11-11-2023");
        System.out.println(bog1);
        bog1.afleverBog();
        System.out.println(bog1);

    }
}
