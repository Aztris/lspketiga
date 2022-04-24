package manajemenbuku_namalengkap;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author azizt
 */
public class koneksi {
    
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/db_manajemenbuku_namalengkap";
    
    public Connection getConnection()throws SQLException{
    Connection con;   
         try {
             Class.forName(driver);
             con = DriverManager.getConnection(url, "root", "");
             
             System.out.println("Koneksi Berhasil");
             return con;
         }catch (ClassNotFoundException | SQLException ex) {
                System.out.println(ex.toString());
                return  null;
            }
    }
}
