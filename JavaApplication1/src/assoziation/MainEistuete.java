
package assoziation;

public class MainEistuete {
    public static void main(String[] args){
        Eistüte e1 = new Eistüte();
        Eistüte e2 = new Eistüte();
        Eistüte e3 = new Eistüte();
        
        e1.ausgabe();
        e1.kugelHinzufuegen("Vanille");
        e1.kugelHinzufuegen("Vanille");
        e1.kugelHinzufuegen("Vanille");
        e1.kugelHinzufuegen("Vanille");
        
        e1.ausgabe();
        
        e2.kugelHinzufuegen("Erdbeer");
        e2.kugelHinzufuegen("Schokolade");
        e2.kugelHinzufuegen("Vanille");
        
        e2.ausgabe();
    }
    
}
