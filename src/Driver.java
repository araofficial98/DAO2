// Vergeet deze import niet
import java.sql.*;
import java.text.SimpleDateFormat;
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
    public static void main(String[] args) throws SQLException{

        ReizigerOracleDaoImpl i = new ReizigerOracleDaoImpl();
        i.findAll();
        Reiziger r = new Reiziger();
        System.out.println(i.findbyID(4));
        Reiziger bob = new Reiziger();
        bob.setVoorletters("B");
        bob.setTussenvoegsel(null);
        bob.setAchternaam("Peters");
        bob.setReizigerID(9);
        bob.setGbdatum(null);
        i.save(bob);


    }
}
