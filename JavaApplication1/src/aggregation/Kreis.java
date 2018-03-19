package aggregation;


public class Kreis {
    private String farbe;
    private int radius;
    
    
    public Kreis(String dieFarbe, int derRadius){
        farbe = dieFarbe;
        radius = derRadius;
   }
    
    public String gibFarbe(){
        return farbe;
    }
    
    public void setzeFarbe(String neueFarbe){
        if(neueFarbe.equals("rot")||neueFarbe.equals("gruen")||neueFarbe.equals("schwarz")){
            farbe=neueFarbe;
        }
        else{
            System.out.println(neueFarbe+" ist nicht zulässig.");
            System.out.println("Das Licht bleibt bei "+farbe);
        }
    }
    
    public int gibRadius(){
        return radius;
    }
    
    public void setzeRadius(int neuerRadius){
        radius = neuerRadius;
    }
    
    public void anzeigen(){
        System.out.println("Farbe: "+farbe);
        System.out.println("Radius: "+radius);
    }
}
