package database.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

public class main {

    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/main/resources/database.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        DatabaseConnection dbConnection = new DatabaseConnection();
        try {
            dbConnection.openConnection(properties);
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}