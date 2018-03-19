/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assoziation;

/**
 *
 * @author koeppen
 */
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
    
    public Bank gibBank(){
        return meineBank;
    }
    
    public void setzeBank(Bank neueBank){
        meineBank = neueBank;
    }
}
