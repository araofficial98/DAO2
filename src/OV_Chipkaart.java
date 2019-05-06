import java.util.Date;

public class OV_Chipkaart {

    private int kaartNummer;
    private Date geldigTot;
    private int klasse;
    private double saldo;
    private int reizigerID;

    public OV_Chipkaart (int krtNmr, Date gldTot, int klsse, double sld, int rzgID) {
        kaartNummer = krtNmr;
        geldigTot = gldTot;
        klasse = klsse;
        saldo = sld;
        reizigerID = rzgID;
    }
    

}
