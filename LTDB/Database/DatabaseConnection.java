package LTDB.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/ltdb2";

    private static final String USER =
            "root";

    private static final String PASSWORD =
            "admin123";

    public static Connection getConnection() {
        try {
            Connection connection =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Connect database successfully!");

            return connection;

        } catch (SQLException e) {
            System.out.println("Connect database failed!");
            e.printStackTrace();
            return null;
        }
    }
}
