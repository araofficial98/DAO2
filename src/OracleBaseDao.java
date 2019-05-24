import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleBaseDao extends OV_ChipkaartDaoImpl {

    //private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    private static final String DB_USER = "ARA2";
    private static final String DB_PASS = "Goeni1998";
    private static Connection conn;

    public OracleBaseDao() throws SQLException {

        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

    }

    public Connection getConnection() {return conn;}


    public void closeConnection() throws SQLException {
        conn.close();
    }
}
