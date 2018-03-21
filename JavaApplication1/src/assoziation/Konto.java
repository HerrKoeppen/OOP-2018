package assoziation;

public class Konto {
    private int nr;
    private String typ;
    private int dispo;
    
    //jetzt neu: die Assoziation zur Bank
    
    private Bank meineBank;
    
    public Konto(int dieNr, String derTyp, int derDispo){
        nr = dieNr;
        typ = derTyp;
        dispo = derDispo;
    }
    /**
     * 
     * @return 
     */
    public Bank gibBank(){
        return meineBank;
    }
    
    public void setzeBank(Bank neueBank){
        meineBank = neueBank;
    }
}
