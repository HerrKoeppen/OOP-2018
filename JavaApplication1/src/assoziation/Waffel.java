package assoziation;


public class Waffel {
    private String form;
    public Waffel(){
        form = "Dreieck";
    }
    
    public void ausgabe(){
        System.out.println("Ich bin eine Waffel.");
        System.out.println("Meine Form ist: "+form);
    }
}
