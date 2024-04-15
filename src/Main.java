//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ///////////////////////////////////////////////
        //////// Gyvunai

        System.out.println();
        System.out.println("Gyvunai");
        System.out.println();

        Prieglauda prieglauda = new Prieglauda();

        Gyvunas sou1 = new Sou("Mikis",5.7,8,SunsVeisle.Buldogas);
        Gyvunas sou2 = new Sou("Ukis",1.7,1,SunsVeisle.Labradoro);
        Gyvunas sou3 = new Sou("Jojis",8.7,5,SunsVeisle.Terjeras);
        Gyvunas kate1 = new Kate("Raine",4.7,5,KailioSpalva.Margas);
        Gyvunas kate2 = new Kate("Baltusi",2.7,2,KailioSpalva.Baltas);
        Gyvunas kate3 = new Kate("Murke",1.7,1,KailioSpalva.Juodas);
        Gyvunas paukstis1 = new Paukstis("Akis",0.5,1,6.45);
        Gyvunas paukstis2 = new Paukstis("Igis",0.8,2,5.10);
        Gyvunas paukstis3 = new Paukstis("Akis",1.5,5,15.20);

        prieglauda.idetiGyvuna(sou1);
        prieglauda.idetiGyvuna(sou2);
        prieglauda.idetiGyvuna(sou3);
        prieglauda.idetiGyvuna(kate1);
        prieglauda.idetiGyvuna(kate2);
        prieglauda.idetiGyvuna(kate3);
        prieglauda.idetiGyvuna(paukstis1);
        prieglauda.idetiGyvuna(paukstis2);
        prieglauda.idetiGyvuna(paukstis3);


        while(true){
            prieglauda.paleistiPrieglaudosUI();
            System.out.println("Ar norite testi? (T/N)");
            if (!prieglauda.atsakymas()) break;
        }

    }
}