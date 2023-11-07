package ConexionBaseDatos;

import Model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnector {
    public void connectAndRetrieveData() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/xmlcosas";
        String username = "root";
        String password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");

        List<User> userList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios")) {

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }
        }
    }
}
