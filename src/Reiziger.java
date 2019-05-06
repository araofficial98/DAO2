import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Reiziger {

    private String naam;
    private Date gbdatum;

    public Reiziger(String nm, Date gb) {
        naam = nm;
        gbdatum = gb;

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
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
                "naam='" + naam + '\'' +
                ", gbdatum=" + gbdatum +
                '}';
    }
}
