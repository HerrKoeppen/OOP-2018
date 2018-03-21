package assoziation;


public class Kugel {
    private String form;
    private String sorte;
    
    public Kugel(String dieSorte){
        form = "Kreis";
        setzeSorte(dieSorte);
    }
    
    public String gibSorte(){
        return sorte;
    }
    
    public void setzeSorte(String neueSorte){
        if (neueSorte.equals("Erdbeer")||neueSorte.equals("Schokolade")||neueSorte.equals("Vanille")){
            sorte = neueSorte;
        }
    }
    
    public void ausgabe(){
        System.out.println("Ich bin eine Kugel.");
        System.out.println("Meine Form ist: "+form);
        System.out.println("Meine Sorte ist: "+sorte);
    }
}
