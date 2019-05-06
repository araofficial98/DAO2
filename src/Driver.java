// Vergeet deze import niet
import java.sql.*;

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
        //Besluit welke driver je gaat gebruiken voor je verbinding
        try {
            Class.forName(DB_DRIV).newInstance();
        }
        catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        // Leg de connectie met de database
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        //System.out.println("Connection made");

        conn.close();

    }
}
