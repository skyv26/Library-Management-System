package library;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aakash Verma
 */
import java.sql.*;
public class DataBase {
    Connection con ;
    Statement stmt ; 
    ResultSet ak;
    
    public DataBase()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/dblibrary";
            con = DriverManager.getConnection(url, "root", "########");
            stmt=con.createStatement();
        }
        catch(Exception ae){
          System.out.println(ae);
        }
    }
    
    public void update(String qry) throws Exception
    {
        stmt.executeUpdate(qry);
    }
    
    public ResultSet execute(String qry) throws Exception
    {
        ak=stmt.executeQuery(qry);
        return ak;
    }
}
