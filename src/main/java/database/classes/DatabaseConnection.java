package database.classes;


import database.interfaces.IDatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class DatabaseConnection implements IDatabaseConnection {

    private Connection _connection;
    private DbHelperService _helperService;
    private String _databaseName;

    @Override
    public IDatabaseConnection openConnection(Properties properties) throws SQLException {

        String systemnutzer = System.getProperty("user.home");
        String[] parts = systemnutzer.split("\\\\");
        systemnutzer = parts[parts.length - 1];

        String url = "jdbc:mariadb://" + properties.getProperty(systemnutzer + ".db.url");
        String user = properties.getProperty(systemnutzer + ".db.user");
        String password = properties.getProperty(systemnutzer);

        List<String> urlParts = Arrays.asList(properties.getProperty(systemnutzer + ".db.url").split("/"));
        this._databaseName = urlParts.get(urlParts.size() - 1);
        _connection = DriverManager.getConnection(url, user, password);

        return this;

    }

    @Override
    public void createAllTables() throws SQLException {

    }

    @Override
    public void truncateAllTables() throws SQLException {

    }

    @Override
    public void removeAllTables() throws SQLException {

    }

    @Override
    public void closeConnection() throws SQLException {

    }

}
