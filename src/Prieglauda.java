import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Prieglauda {
    private ArrayList<Gyvunas> gyvunuSarasas;
    private Scanner scanner;
    private static String ERRORZINUTE = "Ivyko Klaida, bandykite dar karta.";

    public Prieglauda() {
        this.gyvunuSarasas = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public ArrayList<Gyvunas> getGyvunuSarasas() {
        return gyvunuSarasas;
    }

    public void setGyvunuSarasas(ArrayList<Gyvunas> zaisluSarasas) {
        this.gyvunuSarasas = zaisluSarasas;
    }

    public void idetiGyvuna(){
        Gyvunas gyvunas = gautiGyvunoTipa();
        gyvunas.setVardas(gautiGyvunoVarda());
        gyvunas.setAmzius(gautiGyvunoAmziu());
        gyvunas.setSrovis(gautiGyvunoSrovi());
        gyvunuSarasas.add(gyvunas);
    }

    public Gyvunas pasalintiGyvuna(){

        if(gyvunuSarasas.size()==0){
            System.out.println("Gyvunu prieglaudoje nera");
            return null;
        }

        String gyvunoVardas = gautiGyvunoVarda();

        for(int indeksas = 0 ; indeksas < gyvunuSarasas.size(); indeksas++){
            if(gyvunuSarasas.get(indeksas).getVardas().equals(gyvunoVardas)){
                System.out.println("Pasalintas gyvunas:");
                System.out.println(gyvunuSarasas.get(indeksas));
                Gyvunas gyvunas;
                gyvunas = gyvunuSarasas.remove(indeksas);
                return gyvunas;
            }
        }

        System.out.println("Tokio gyvuno nera");
        return null;
    }
    public void idetiGyvuna(Gyvunas gyvunas){
        gyvunuSarasas.add(gyvunas);
    }

    public void paleistiPrieglaudosUI(){
        System.out.println(
                "********************************************************************\n" +
                "Pasirintike norima paslauga: \n" +
                "Spauzdinti gyvunu sarasa(1) \n" +
                "Ivesti gyvuna i prieglauda (2) \n" +
                "Isimti gyvuna is prieglaudos (3) \n"+
                "********************************************************************");

        int pasirinkimas = nuskanuotiIntVerte();

        switch (pasirinkimas){
            case 1:
                spauzdintiGyvunuSarasa();
                break;
            case 2:
                idetiGyvuna();
                break;
            case 3:
                pasalintiGyvuna();
                break;
            default:
                System.out.println(ERRORZINUTE);
                break;
        }
    }


    private void spauzdintiGyvunuSarasa(){
        for(Gyvunas g : gyvunuSarasas){
            System.out.println(g);
        }
    }
    private Gyvunas gautiGyvunoTipa(){
        System.out.println("Iveskite gyvuno tipa: Sou (1), Kate (2), Paukstis (3)");
        return  nuskanuotiGyvunoTipa();
    }

    private String gautiGyvunoVarda(){
        System.out.println("Iveskite gyvuno varda: ");
        return nuskanuotiStringVerte();
    }

    private int gautiGyvunoAmziu(){
        System.out.println("Iveskite gyvuno amziu:");
        return nuskanuotiIntVerte();
    }

    private double gautiGyvunoSrovi(){
        System.out.println("Ivesti gyvuno svori:");
        return nuskanuotiDoubleVerte();
    }

    private SunsVeisle gautiVeisle() {
        System.out.println("Pasirinkite veisle: \n" +
                "Labradoro (1), Aviganis (2), Biglis (3), Terjeras (4), Buldogas (5)");
        return nuskanuotiVeisle();
    }

    private KailioSpalva gautiKatesKailioSpava(){
        System.out.println("Pasirinkite Kailio Spalva: \n" +
                "Baltas (1), Juodas (2), Rudas (3), Margas (4), Ryzas (5)");
        return nuskanuotiKatesKailioSpava();
    }

    private double gautiSparnuIlgi(){
        System.out.println("Iveskite sparnu ilgi: ");
        return nuskanuotiDoubleVerte();
    }

    private SunsVeisle nuskanuotiVeisle() {
        int index = nuskanuotiIntVerte()-1;

        if (index > SunsVeisle.values().length) {
            System.out.println(ERRORZINUTE);
            return nuskanuotiVeisle();
        }
        return SunsVeisle.values()[index];
    }


    private KailioSpalva nuskanuotiKatesKailioSpava(){
        int index = nuskanuotiIntVerte()-1;

        if (index > KailioSpalva.values().length) {
            System.out.println(ERRORZINUTE);
            return nuskanuotiKatesKailioSpava();
        }
        return KailioSpalva.values()[index];
    }


    private Gyvunas nuskanuotiGyvunoTipa(){
        int gyvunoTipas = -1;
        gyvunoTipas = nuskanuotiIntVerte();

        Gyvunas gyvunas = null;
        switch(gyvunoTipas){
            case 1:
                gyvunas = new Sou();
                ((Sou) gyvunas).setVeisle(gautiVeisle());
                break;
            case 2:
                gyvunas = new Kate();
                ((Kate) gyvunas).setKailioSpalva(gautiKatesKailioSpava());
                break;
            case 3:
                gyvunas = new Paukstis();
                ((Paukstis) gyvunas).setSparnuIlgis(gautiSparnuIlgi());
                break;
            default:
                System.out.println(ERRORZINUTE);
                return nuskanuotiGyvunoTipa();
        }
        return gyvunas;
    }

    private String nuskanuotiStringVerte(){
        return nuskaityti();
    }

    private int nuskanuotiIntVerte(){
        int i;
        try {
            i = Integer.parseInt(nuskaityti());
        } catch (NumberFormatException e) {
            System.out.println(ERRORZINUTE);
            return nuskanuotiIntVerte();
        }
        return i;
    }

    private double nuskanuotiDoubleVerte(){
        double i;
        try {
            i = Double.parseDouble(nuskaityti());
        } catch (NumberFormatException e) {
            System.out.println(ERRORZINUTE);
            return nuskanuotiDoubleVerte();
        }
        return i;
    }

    private String nuskaityti(){
        String verte = null;
        try {
            verte = scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return verte;
    }

    public boolean atsakymas() {
        while(true) {
            String scVerte = scanner.nextLine();
            if(scVerte.toUpperCase().equals("T")) return true;
            else if (scVerte.toUpperCase().equals("N")) return false;
            else System.out.println(ERRORZINUTE);
        }
    }


}
