package LTDB.Database;

import java.sql.Connection;

public class Test {

    public static void main(String[] args) {

        Connection connection = DatabaseConnection.getConnection();

        if (connection != null) {
            System.out.println("Java connected to MySQL!");
        }

        

    }
}