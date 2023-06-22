/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.pagodesueldo.modelo.crud;

//import static co.edu.udec.poo.pagodesueldo.modelo.crud.ClaseComplementosCRUD.listaComplemento;
import co.edu.udec.poo.pagodesueldo.poo.modelo.entidades.ClaseComplementos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author JARK
 */
public class ClaseComplementosCRUD {

    String strconexiondb = "jdbc:sqlite:src/db/sistemanomina.s3db";
    Connection conn = null;

    public ClaseComplementosCRUD() {

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strconexiondb);
            System.out.println("se creó la conexión");

        } catch (Exception e) {
            System.out.println("no se creó la conexión");
        }

    }

    public int ejecuarsentencia(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
        }
        return 0;
    }

    public ResultSet consultardato(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }
   
}
