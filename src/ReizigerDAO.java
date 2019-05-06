import java.sql.SQLException;
import java.util.List;

public interface ReizigerDAO {
    public List findAll() throws SQLException;
    public List<Reiziger> findByGBDatum(String gbDatum) throws SQLException;
    public Reiziger save(Reiziger rzg) throws SQLException;
    public Reiziger update(Reiziger rzg);
    public boolean delete(Reiziger rzg);
    public boolean closeConnection();
}
