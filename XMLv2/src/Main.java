import ConexionBaseDatos.DatabaseConnector;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        databaseConnector.connectAndRetrieveData();
    }
}
