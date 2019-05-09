import java.sql.SQLException;
import java.util.List;

public interface ReizigerDAO {
    public List findAll() throws SQLException;
    public Reiziger findbyID(int id) throws SQLException;
    public boolean save(Reiziger rzg) throws SQLException;
    public Reiziger update(Reiziger rzg);
    public boolean delete(Reiziger rzg);
}
