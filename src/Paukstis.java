public class Paukstis extends Gyvunas{
    double sparnuIlgis;
    public Paukstis() {
    }
    public Paukstis(String vardas, double srovis, int amzius,double sparnuIlgis) {
        super(vardas, srovis, amzius);
        this.sparnuIlgis = sparnuIlgis;
    }

    public void setSparnuIlgis(double sparnuIlgis) {
        this.sparnuIlgis = sparnuIlgis;
    }

    public double getSparnuIlgis() {
        return sparnuIlgis;
    }

    @Override
    public String toString() {
        return "Gyvunas: Paukstis ** Vardas: " + super.getVardas() + " ** Sroris: " + super.getSrovis() +
                " ** Amzius: " + getAmzius()+  " ** Sparnu Ilgis: "  + getSparnuIlgis() + " cm";
    }
}
