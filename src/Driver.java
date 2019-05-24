// Vergeet deze import niet
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Driver {
    //Zorg ter voorbereiding dat je ojdbc.jar download en toevoegt aan je project.

    //Aanmaken van de variabelen die je connectie specificeren. In dit geval een gebruiker "harry" met password "harry"
    private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    private static final String DB_USER = "ARA";
    private static final String DB_PASS = "Goeni1998";
    private static Connection conn;

    // De methode die met JDBC aan de slag gaat moet een SQLException opvangen of gooien
    public static void main(String[] args) throws SQLException, ParseException {

        ReizigerOracleDaoImpl i = new ReizigerOracleDaoImpl();
        i.findAll();

        Reiziger r = new Reiziger();
        System.out.println(i.findbyID(4));
        r.setVoorletters("B");
        r.setTussenvoegsel(null);
        r.setAchternaam("Dropveters");
        r.setReizigerID(19);
        r.setGbdatum(null);



        OV_Chipkaart ovc = new OV_Chipkaart();
        ovc.setKlasse(1);
        ovc.setEigenaar(r);
        ovc.setSaldo(900.00);
        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        Date dt = date.parse("2010/03/20");
        ovc.setGeldigTot(dt);
        ovc.setKaartNummer(51090);
        

        r.setOv_kaarten(ovc);

        OV_ChipkaartDaoImpl ovdao = new OV_ChipkaartDaoImpl();
        ovdao.getKaartvanReiziger(r);
        ovdao.save(ovc);


    }
}
