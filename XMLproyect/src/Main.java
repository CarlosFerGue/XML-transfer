import javax.swing.plaf.nimbus.State;
import java.io.File;
import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        DatabaseConnector databaseConnector = new DatabaseConnector();
        String xml_exportado = "output.txt";
        File outputfile = new File(xml_exportado);
        System.out.println("La ruta del archivo es " + outputfile.getAbsolutePath());

        databaseConnector.connectAndRetrieveData();

    }
}