import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReizigerOracleDaoImpl implements ReizigerDAO {


    public List<Reiziger> findAll() throws SQLException {
        OracleBaseDao d = new OracleBaseDao();
        List<Reiziger> lst = new ArrayList<>();
        PreparedStatement psmnt = d.getConnection().prepareStatement("SELECT * FROM reiziger");
        ResultSet rs = psmnt.executeQuery();
        while (rs.next()) {
            Reiziger r = new Reiziger();
            r.setReizigerID(rs.getInt("reizigerid"));
            r.setAchternaam(rs.getString("achternaam"));
            r.setVoorletters(rs.getString("voorletters"));
            r.setTussenvoegsel(rs.getString("tussenvoegsel"));
            r.setGbdatum(rs.getDate("gebortedatum"));
            lst.add(r);
        }
        System.out.println(lst);
        return lst;
    }

    public Reiziger findbyID(int id) throws SQLException {
        OracleBaseDao oracle = new OracleBaseDao();
        String query = "SELECT * FROM reiziger WHERE reizigerid = " + id;
        PreparedStatement pstmnt = oracle.getConnection().prepareStatement(query);
        ResultSet rs = pstmnt.executeQuery();
        Reiziger r = new Reiziger();
        while (rs.next()) {
            r.setReizigerID(rs.getInt("reizigerid"));
            r.setGbdatum(rs.getDate("gebortedatum"));
            r.setVoorletters(rs.getString("voorletters"));
            r.setTussenvoegsel(rs.getString("tussenvoegsel"));
            r.setAchternaam(rs.getString("achternaam"));
            OV_ChipkaartDaoImpl ovdao = new OV_ChipkaartDaoImpl();
        }
        rs.close();
        pstmnt.close();
        System.out.println(r.getAchternaam());
        return r;
    }

    public boolean save(Reiziger rzg) throws SQLException {
        OracleBaseDao oracle = new OracleBaseDao();

        PreparedStatement prst = oracle.getConnection().prepareStatement("INSERT INTO reiziger VALUES (" + rzg.getReizigerID() + ", '" + rzg.getVoorletters()
        + "', '" + rzg.getTussenvoegsel() + "', '" + rzg.getAchternaam() + "', " + rzg.getGbdatum() + ")");

        ResultSet rs = prst.executeQuery();
        return true;


    }

    public Reiziger update(Reiziger rzg){
        return rzg;

    }

    public boolean delete(Reiziger rzg){
        return true;
    };

}
