package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 *
 *
 */
public class SingletonParty {
    private static SingletonParty db = new SingletonParty();
    private static final String URL = "jdbc:mysql://localhost:8891/alfred";

    private Connection con;
    public static SingletonParty getInstance(){
        return db;
    }
    private SingletonParty(){}

    public void connect() throws SQLException {
        con = DriverManager.getConnection(URL);

    }
    public void close() throws SQLException {
        con.close();

    }
    public Connection getConnection(){
        return con;
    }

}
