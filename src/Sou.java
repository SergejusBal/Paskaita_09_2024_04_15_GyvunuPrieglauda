public class Sou extends Gyvunas{


    SunsVeisle veisle;
    public Sou(){}
    public Sou(String vardas, double srovis, int amzius, SunsVeisle veisle) {
        super(vardas, srovis, amzius);
        this.veisle = veisle;
    }

    public void setVeisle(SunsVeisle veisle) {
        this.veisle = veisle;
    }

    public SunsVeisle getVeisle() {
        return veisle;
    }
    @Override
    public String toString() {
        return "Gyvunas: Suo ** Vardas: " + super.getVardas() + " ** Sroris: " + super.getSrovis() +
                " ** Amzius: " + getAmzius()+  " ** Veisle: "  + getVeisle().toString();
    }
}
