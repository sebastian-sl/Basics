// needs Maven/Src Files for dependencies (MySQL, Postgres, MSSQL)
import java.sql.*;

public class databases {
    public static void main(String[] args) {
        // MYSQL CONNECTION
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM excel_data LIMIT 2");

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (Exception e) {e.printStackTrace();}

        // POSTGRESQL CONNECTION
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "test");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mytest");

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (Exception e) {e.printStackTrace();}

        // MS SQL SERVER CONNECTION
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=testdb;queryTimeout=1;encrypt=false", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM test");

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (Exception e) {e.printStackTrace();}
    }
}
