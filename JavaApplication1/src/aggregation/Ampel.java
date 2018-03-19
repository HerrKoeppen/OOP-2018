package aggregation;

public class Ampel {

    private Kreis lichtOben;
    private Kreis lichtUnten;
    private Rechteck gehaeuse;

    public Ampel() {
        lichtOben = new Kreis("rot",25);
        lichtOben = new Kreis("schwarz",25);
        gehaeuse = new Rechteck();
    }

    public void umschalten() {
        if(lichtOben.gibFarbe().equals("rot")){
            lichtOben.setzeFarbe("schwarz");
            lichtUnten.setzeFarbe("gruen");
        }
        else{
            lichtOben.setzeFarbe("rot");
            lichtUnten.setzeFarbe("schwarz");
        }
    }
    
    public void anzeigen(){
        System.out.println("Licht oben: ");
        lichtOben.anzeigen();
        System.out.println("Licht unten: ");
        lichtUnten.anzeigen();
        System.out.println("Gehäuse: ");
        gehaeuse.anzeigen();
        
        
    }

    
    public static void main(String[] args) {
        Ampel a1 = new Ampel();
        a1.anzeigen();
        a1.umschalten();
        a1.anzeigen();
        a1.umschalten();
        a1.anzeigen();
    }

}
