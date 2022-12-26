//Q23. WAP to retrieve data from database.
package JAVA_Lab_File;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q23_Retrieve_DB_data {

    private Connection connect() {
        String url = "jdbc:sqlite:Logins.Sqlite3";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public void selectAll(){
        String sql = "SELECT * FROM Members";

        try {
            Statement stmt;
            try (Connection conn = this.connect()) {
                stmt = conn.createStatement();
            }
            ResultSet rs    = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("capacity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q23_Retrieve_DB_data app = new Q23_Retrieve_DB_data();
        app.selectAll();
    }

}