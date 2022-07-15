/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */

public class Conexion {
    
    public static Connection getConexion(){
            String url = "jdbc:sqlserver://localhost:1433;"
            + "database=ecolastico;"
            + "user=sa;"
            + "password=123456789;";
   
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException e){
             System.out.println(e.toString());
            return null; 
        } 
    }
}
    

