public class Kate extends Gyvunas{
    KailioSpalva kailioSpalva;
    public Kate() {
    }

    public Kate(String vardas, double srovis, int amzius, KailioSpalva kailioSpalva) {
        super(vardas, srovis, amzius);
        this.kailioSpalva = kailioSpalva;
    }

    public void setKailioSpalva(KailioSpalva kailioSpalva) {
        this.kailioSpalva = kailioSpalva;
    }

    public KailioSpalva getKailioSpalva() {
        return kailioSpalva;
    }

    @Override
    public String toString() {
        return "Gyvunas: Kate ** Vardas: " + super.getVardas() + " ** Sroris: " + super.getSrovis() +
                " ** Amzius: " + getAmzius()+  " ** Kailio Spalva: "  + getKailioSpalva().toString();
    }
}
