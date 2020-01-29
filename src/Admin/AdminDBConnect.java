
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author taome
 */
public class AdminDBConnect {
    
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public AdminDBConnect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // step 1 > get a connection to database
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accommodationsystem", "root", "");
            //step 2> create a statement
            st = con.createStatement();
            
        } catch (Exception e) {
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
    }
    
    public int insertIntoAdmin(ArrayList row, int flag)
    {
        
        try
        {
            String sqlQuery = "insert into admindetails(name, email, phonenumber, password) values('"
                    + row.get(0) + "','" + row.get(1) + "'," + row.get(2) + ",'" 
                    + row.get(3) + "' " + ");";

            //step 3> Execute SQL query

            st.executeQuery(sqlQuery);
            JOptionPane.showMessageDialog(null, "SignUp Succesfully!!! By clicking OK You will get to the LogIn Page");
            
            flag = 1;
            return flag;
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Already SignUp By This E-mail");
            flag =0;
            return flag;
        }
        
    }
    
    public ResultSet logInToAdmin(String email)
    {
        //String sqlQuery = "Select password from studentdetails where email ='"+email+"'";
        try{
            String sqlQuery= "Select email, password, name from admindetails where email ='"+email+"'";
            rs=st.executeQuery(sqlQuery); 
        }catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getAdminDetails(String email)
    {
        try{
            String sqlQuery= "Select name, email, phonenumber, nid, address from admindetails where email ='"+email+"'";
            rs=st.executeQuery(sqlQuery); 
        }catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
        return rs;
    }
    
    public void updateAdminInfo(ArrayList row, String aemail)
    {
        try
        {
            String sqlQuery = "Update admindetails set name = '" + row.get(0) + "', email = '" + row.get(1) + "', phonenumber = '" + row.get(2) + "', nid = " + row.get(3) + ", address = '" + row.get(4) + "' where email ='"+aemail+"' ;";
            
            //step 3> Execute SQL query

            st.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "Updated Successfully!!!");
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Wrong Input");
            System.out.println(e);
        }
        
    }
    
    public ResultSet getDetails(String sqlQuery)
    {
        try{
            rs=st.executeQuery(sqlQuery);
        }catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
        return rs;
    }
    
    public void setDetails(String sqlQuery)
    {
        try{
            st.executeUpdate(sqlQuery);
        }catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
    }
}
