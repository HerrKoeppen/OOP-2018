
package assoziation;

import java.util.ArrayList;


public class hat_Kunde_Konto {
    private ArrayList<KundeKonto> hatKundeKonto;
    
    public hat_Kunde_Konto(){
        hatKundeKonto = new ArrayList<>();
    }
    
    public void ergaenzeBeziehung(Kunde ku, Konto ko){
        hatKundeKonto.add(new KundeKonto(ku, ko));
    }
}
