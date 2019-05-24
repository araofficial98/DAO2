import java.sql.SQLException;
import java.util.List;

public interface OV_ChipkaartDAO {

    public List<OV_Chipkaart> getKaartvanReiziger(Reiziger rzg) throws SQLException;
    public boolean save(OV_Chipkaart ov) throws SQLException;

}
