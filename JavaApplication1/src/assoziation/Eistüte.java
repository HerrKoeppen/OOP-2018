package assoziation;

public class Eistüte {
    private Waffel meineWaffel;
    private Kugel[] eiskugeln;
    private int naechstesFeld;

    public Eistüte() {
        meineWaffel = new Waffel();
        eiskugeln = new Kugel[7];
        naechstesFeld = 0;
    }

    public void kugelHinzufuegen(Kugel k) {
        if (naechstesFeld < 7) {
            eiskugeln[naechstesFeld] = k;
            naechstesFeld = naechstesFeld + 1;
        }

    }

    public void kugelHinzufuegen(String sorte) {
        if (naechstesFeld < 7) {
            eiskugeln[naechstesFeld] = new Kugel(sorte);
            naechstesFeld = naechstesFeld + 1;
        }
    }
    public void ausgabe(){
        System.out.println("Ich bin eine Eistüte.");
        System.out.println("Meine Waffel:");
        meineWaffel.ausgabe();
        System.out.println("Meine Kugeln:");
        for(int i=0;i<naechstesFeld;i++){
            System.out.println("Kugel "+(i+1));
            eiskugeln[i].ausgabe();
        }
        System.out.println();
    }

}
