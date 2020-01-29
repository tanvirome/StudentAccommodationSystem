
package studentaccommodationsystem;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author taome
 */
class DBConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // step 1 > get a connection to database
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accommodationsystem", "root", "");
            //step 2> create a statement
            st = con.createStatement();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error : " + e);
        }
    }
    
    public int insertIntoHDB(ArrayList row, int flag)
    {
        
        try
        {
            String sqlQuery = "insert into houseownerdetails(name, email, phonenumber, password) values('"
                    + row.get(0) + "','" + row.get(1) + "'," + row.get(2) + ",'" 
                    + row.get(3) + "' " + ");";

            st.executeUpdate(sqlQuery);
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
    
    public int updateOwnerInfo(ArrayList row, String hemail, int flag)
    {
        String status = "Unverified";
        try
        {
            String sqlQuery = "Update houseownerdetails set name = '" + row.get(0) + "', email = '" + row.get(1) + "', phonenumber = '" + row.get(2) + "', nid = '" + row.get(3) + "', address = '" + row.get(4) + "', status = '" + status + "' where email ='"+hemail+"' ;";
            
            st.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "Updated Successfully!!!");
            flag = 1;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Wrong Input");
            System.out.println(e);
            flag = 0;
        }
        return flag;
    }
    
    public int insertIntoSDB(ArrayList row, int flag)
    {
        
        try
        {
            String sqlQuery = "insert into studentdetails(name, email, phonenumber, password) values('"
                    + row.get(0) + "','" + row.get(1) + "'," + row.get(2) + ",'" 
                    + row.get(3) + "' " + ");";

            st.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "SignUp Succesfully!!! By clicking OK You will get to the LogIn Page");
            
            flag = 1;
            return flag;
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Already SignedUp By This E-mail/Check Your Details");
            flag =0;
            return flag;
        }
        
    }
    
    public int updateStudentInfo(ArrayList row, String hemail, int flag)
    {
        
        try
        {
            String unveri = "Unverified";
            String sqlQuery = "Update studentdetails set name = '" + row.get(0) + "', email = '" + row.get(1) + "', phonenumber = '" + row.get(2) + "', nid = '" + row.get(3) + "', address = '" + row.get(4) + "', studentid = '" + row.get(5) + "', institutename = '" + row.get(6) + "', status = '" + unveri + "' where email ='"+hemail+"' ;";
            
            st.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "Updated Successfully!!!");
            flag = 1;
            return flag;
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Wrong Input");
            System.out.println(e);
            flag = 0;
            return flag;
        }
        
    }
    
    public ResultSet logInToHAcc(String email)
    {
        try{
            String sqlQuery= "Select email, password, name from houseownerdetails where email ='"+email+"'";
            rs=st.executeQuery(sqlQuery); 
        }catch(SQLException e){
            System.out.println("Error : " + e);
        }
        return rs;
    }
    
    public ResultSet logInToSAcc(String email)
    {
        try{
            String sqlQuery= "Select email, password, name from studentdetails where email ='"+email+"'";
            rs=st.executeQuery(sqlQuery); 
        }catch(SQLException e){
            System.out.println("Error : " + e);
        }
        return rs;
    }
    
    public void setDetails(String sqlQuery)
    {
        
        try
        {
            st.executeUpdate(sqlQuery);
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
        }catch(SQLException e){
            System.out.println("Error : " + e);
        }
        return rs;
    }
    
    public void updateDetails(String sqlQuery)
    {
        
        try
        {
            st.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "Updated Successfully!!!");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Wrong Input");
            System.out.println(e);
        }
        
    }
    
    public void deleteDetails(String sqlQuery)
    {
        
        try
        {
            st.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "Deleted Successfully!!!");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Wrong Input");
            System.out.println(e);
        }
        
    }   
}
