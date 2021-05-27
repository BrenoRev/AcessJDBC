package db;

import java.sql.Connection;
import java.sql.SQLException; 
import java.sql.Statement;

public class Jdbc1 {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try{
            
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
