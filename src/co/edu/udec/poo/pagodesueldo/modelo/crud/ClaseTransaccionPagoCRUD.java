/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.pagodesueldo.modelo.crud;

import co.edu.udec.poo.pagodesueldo.poo.modelo.entidades.ClaseTransaccionPago;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JARK
 */
public class ClaseTransaccionPagoCRUD {
     //SE CREA EL ARRAY QUE GUARDARA LA INFORMACIÓN DE LOS EMPLEADOS
    public static ArrayList<ClaseTransaccionPago> listaClaseTransaccionPagos ;
    
    
    // 
    
    public void crearArrayList(){
    
         listaClaseTransaccionPagos=new ArrayList();
    
    }
    
    public void registrarEmpleado(ClaseTransaccionPago transaccionPago){
        
        listaClaseTransaccionPagos.add(transaccionPago);
    
    }
    
    public void actualizarEmpleado(int index, ClaseTransaccionPago transaccionPago){
        
        listaClaseTransaccionPagos.set(index, transaccionPago);
    
    }
    
    
    
    public int tamaArreglo(){
        
        int tam = listaClaseTransaccionPagos.size();
        
        return tam;
     
      }
}


