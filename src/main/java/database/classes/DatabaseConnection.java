package database.classes;


import database.interfaces.IDatabaseConnection;

import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection implements IDatabaseConnection {

    @Override
    public IDatabaseConnection openConnection(Properties properties) throws SQLException {

        String systemnutzer = System.getProperty("user.home");

        String url =

    }

}
