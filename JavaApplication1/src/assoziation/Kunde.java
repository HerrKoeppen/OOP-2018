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
public class Kunde {
    private int nr;
    private String name;
    private String vorname;
    
    public Kunde(int dieNr, String derName, String derVorname){
        nr = dieNr;
        name = derName;
        vorname = derVorname;
    }
}
