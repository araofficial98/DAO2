import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Reiziger {

    private String achternaam;
    private Date gbdatum;

    public int getReizigerID() {
        return reizigerID;
    }

    public void setReizigerID(int reizigerID) {
        this.reizigerID = reizigerID;
    }

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    private int reizigerID;
    private String voorletters;
    private String tussenvoegsel;

    public Reiziger(int rzgID, String voorL, String tussen, String anm, Date gb) {
        reizigerID = rzgID;
        voorletters = voorL;
        tussenvoegsel = tussen;
        achternaam = anm;
        gbdatum = gb;

    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String naam) {
        this.achternaam = naam;
    }

    public Date getGbdatum() {
        return gbdatum;
    }

    public void setGbdatum(Date gbdatum) {
        this.gbdatum = gbdatum;
    }

    @Override
    public String toString() {
        return "Reiziger{" +
                "naam='" + achternaam + '\'' +
                ", gbdatum=" + gbdatum +
                '}';
    }
}
