
package jdbc_d;
import java.sql.*;  
import java.util.Scanner;

public class JDBC_D
{

    public static void main(String[] args) throws Exception 
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
        
         
            System.out.println("Connection Estab.");
        
        Statement st=con.createStatement();
       
        String s="select * from student";
        ResultSet rs=st.executeQuery(s);
        while (rs.next())
        {
            System.out.println(rs.getString("Id")+"  "+rs.getString("Name"));
        }
            
        

        
        
    }
    

}

