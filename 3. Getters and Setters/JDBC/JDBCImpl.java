package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

public class JDBCImpl implements UserDao{
    private final String SQL = "insert * into %s (key, value) where type = '%s' ";
    @Override
    public void save(Object user) {

        Connection con = SingletonParty.getInstance().getConnection();
        try {
            Statement st = con.prepareStatement(SQL);
            st.setCursorName("James");
            st.executeUpdate(SQL);
            st.close();
        } catch (SQLException e) {
            System.out.println("wrong entry");
        }
    }

    @Override
    public Optional retrieveVersionNumber(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public List getAll() {
 Connection con = SingletonParty.getInstance().getConnection();
        try {
            Statement st = con.createStatement();
            var rs = st.executeQuery(SQL);
            st.close();
        } catch (SQLException e) {

    }
        return null;
}
}
