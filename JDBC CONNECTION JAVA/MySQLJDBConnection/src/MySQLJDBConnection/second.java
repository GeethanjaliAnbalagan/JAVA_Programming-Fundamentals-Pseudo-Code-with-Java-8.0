package MySQLJDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class second {
    public static void main(String[] args) {
 
    	        
        try {

        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Test123@");  
        	//here university is database name, root is username and password  
            if (con!= null) {
                System.out.println("Connected sucessfully");
            }
 
            // connect way #2
           
        } catch (Exception ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}
