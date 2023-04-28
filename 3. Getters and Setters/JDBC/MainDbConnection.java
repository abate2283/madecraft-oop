package JDBC;

import java.sql.SQLException;

public class MainDbConnection {
    public static void main(String[] args) {
        SingletonParty db = SingletonParty.getInstance();

        try {
            db.connect();
        } catch (SQLException e) {
            System.out.println("Can not connect to database!");
        }

        UserDao userDao = new JDBCImpl();
        userDao.save(new Object());

        try {
            db.close();
        } catch (SQLException e) {
            System.out.println("Connection to database still open! ");
        }

    }

}
