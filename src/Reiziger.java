import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public class Reiziger {

    private List<OV_Chipkaart> ov_kaarten = new ArrayList<>();
    private String achternaam;
    private Date gbdatum;
    private int reizigerID;
    private String voorletters;
    private String tussenvoegsel;


    public List<OV_Chipkaart> getOv_kaarten() {
        return ov_kaarten;
    }

    public void setOv_kaarten(OV_Chipkaart ov_kaart) {
        ov_kaarten.add(ov_kaart);
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

    @Override
    public String toString() {
        return "Reiziger{" +
                "naam='" + achternaam + '\'' +
                ", gbdatum=" + gbdatum +
                '}';
    }
}
