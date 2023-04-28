package JDBC;
import java.sql.*;

/**
 * 1. import java.sql
 * 2. Load and register the driver - com.mysql.jdbc.Driver
 * 3. Create connection --- Connection
 * 4. Create a statement --- Statement
 * 5. Execute Query
 * 6. Process the result
 * 7. Close
 *
 *
 */
public class DbConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:8891/alfred"; // database name
        String userName ="admin";
        String password = "password22";
        String query = "select * from db  ";


        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        String name = rs.getString("username");
        System.out.println(name);

        st.close();
        con.close();

    }
}
