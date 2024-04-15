public class Gyvunas {

    private String vardas;
    private double srovis;
    private int amzius;

    public Gyvunas(){}
    public Gyvunas(String vardas, double srovis, int amzius) {
        this.vardas = vardas;
        this.srovis = srovis;
        this.amzius = amzius;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setSrovis(double srovis) {
        this.srovis = srovis;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public String getVardas() {
        return vardas;
    }

    public double getSrovis() {
        return srovis;
    }

    public int getAmzius() {
        return amzius;
    }
}
