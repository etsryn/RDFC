package bms.utilities.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
    
    public Connection establishConnection() throws ClassNotFoundException, SQLException {
    
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
        String username = "your_mysql_database_user_id";
        String password = "your_mysql_database_password";
        
        Connection con = DriverManager.getConnection(url, username, password);
        
        if(con.isClosed()) {
            return null;
        }
        
        return con;
        
    }
}