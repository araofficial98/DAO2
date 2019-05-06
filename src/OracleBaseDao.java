public class OracleBaseDao extends ReizigerOracleDaoImpl {

    protected boolean getConnection() {
        return false;
    };

    @Override
    public boolean closeConnection() {
        return false;
    }
}
