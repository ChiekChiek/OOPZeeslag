package Zeeslag;

import java.sql.*;

public class DatabaseConnector
{

    public void runDatabase(String args[])
    {
        try
        {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // here testdb is database name, dbuser is username and dbwachtwoord is password  
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://cfranken.gc-webhosting.nl:2083//cfranken_ZeeslagDB", "cfranken_cfranken", "ChicoGraafschap");
            Statement stmt = con.createStatement();

            //Tabellen in de database bestaan nog niet
            ResultSet rs = stmt.executeQuery("SELECT * FROM test");
            
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + "  " /**+ rs.getString(2)*/);
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
