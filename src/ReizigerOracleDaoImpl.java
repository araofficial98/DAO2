import java.sql.*;
import java.util.List;

public class ReizigerOracleDaoImpl implements ReizigerDAO {

    private static Connection conn;
    private List<Reiziger> lst;

    public List<Reiziger> findAll() throws SQLException {
        Statement stmnt = conn.createStatement();
        ResultSet rs1 = stmnt.executeQuery("SELECT * FROM reiziger");
        String achternaam;
        Date geb_datum;
        while (rs1.next()) {
            achternaam = rs1.getString(3);
            geb_datum = rs1.getDate(4);
            Reiziger r = new Reiziger(achternaam, geb_datum);
            lst.add(r);
        }
        return lst;

    };

    public List<Reiziger> findByGBDatum(String gbDatum) throws SQLException {
        Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * FROM reiziger WHERE gebortedatum = " + gbDatum);
        String achternaam;
        Date geb_datum;
        while (rs.next()) {
            achternaam = rs.getString(3);
            geb_datum = rs.getDate(4);
            Reiziger r = new Reiziger(achternaam, geb_datum);
            lst.add(r);
        }
        return lst;
    };

    public Reiziger save(Reiziger rzg){
        if () {
            
        }
    };
    public Reiziger update(Reiziger rzg){

    };
    public boolean delete(Reiziger rzg){
        
    }

    @Override
    public boolean closeConnection() {
        return false;
    }

    ;

}
