import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OV_ChipkaartDaoImpl implements OV_ChipkaartDAO{

    public List<OV_Chipkaart> getKaartvanReiziger(Reiziger rzg) throws SQLException {
        OracleBaseDao od = new OracleBaseDao();
        String qry = "SELECT * FROM ov_chipkaart WHERE reizigerid = ?";
        List<OV_Chipkaart> lst = new ArrayList<>();
        PreparedStatement pstmnt = od.getConnection().prepareStatement(qry);
        pstmnt.setInt(1, rzg.getReizigerID());
        ResultSet rs = pstmnt.executeQuery();
        OV_Chipkaart ov = new OV_Chipkaart();
        while (rs.next()) {
            ov.setEigenaar(rzg);
            ov.setGeldigTot(rs.getDate("geldigtot"));
            ov.setKaartNummer(rs.getInt("kaartnummer"));
            ov.setKlasse(rs.getInt("klasse"));
            ov.setSaldo(rs.getDouble("saldo"));

            lst.add(ov);
        }
        return lst;
    }

    public boolean save(OV_Chipkaart ov) throws SQLException {
        OracleBaseDao oracle = new OracleBaseDao();

        PreparedStatement prst = oracle.getConnection().prepareStatement("INSERT INTO ov_chipkaart VALUES (" + ov.getKaartNummer() + ", " + ov.getGeldigTot()
                + ", " + ov.getKlasse() + ", " + ov.getSaldo() + ", " + ov.getEigenaar().getReizigerID() + ")");

        ResultSet rs = prst.executeQuery();
        return true;


    }



}
