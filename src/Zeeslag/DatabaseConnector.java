package Zeeslag;

import java.sql.*;

Public class DatabaseConnector
{

    public void runDatabase(String args[])
    {
        try
        {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // here testdb is database name, dbuser is username and dbwachtwoord is password  
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "dbuser", "dbww");
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM drank");
            
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
            }
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Could not connect to database");
            System.out.println(e);
        }
    }
}
