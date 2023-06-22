    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.pagodesueldo.modelo.crud;

//import co.edu.udec.poo.pagodesueldo.poo.modelo.entidades.ClaseEmpleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author JARK
 */
public class ClaseEmpleadoCRUD {
    
    String strConexionDB="jdbc:sqlite:src/db/sistemanomina.s3db";
    
    Connection conn=null;
    
    public ClaseEmpleadoCRUD(){
        
        try {
            Class.forName("org.sqlite.JDBC");
            
            conn=DriverManager.getConnection(strConexionDB);
            System.out.println("Conexion Establecida");
            
        } catch (Exception e) {
            System.out.println("Error de conexion" + e);
        }
        
    }
    
    
    public int ejecutarSentenciaQLS(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta=pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }


    
    
}
   