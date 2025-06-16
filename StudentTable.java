package heiio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String password = "supriya@777";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb4", "root","supriya@777");

            String createTableSQL = "CREATE TABLE IF NOT EXISTS students ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(100), "
                    + "marks INT"
                    + ")";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTableSQL);

            System.out.println("Table 'students' created successfully.");
            stmt.close();
            con.close();
        } catch (Exception e) {
        	
            e.printStackTrace();
        }
    }
}
