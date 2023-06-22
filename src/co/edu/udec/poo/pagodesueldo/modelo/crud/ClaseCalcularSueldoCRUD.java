/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.pagodesueldo.modelo.crud;

import co.edu.udec.poo.pagodesueldo.poo.modelo.entidades.ClaseCalcularSueldo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JARK
 */
public class ClaseCalcularSueldoCRUD {
  
    public static ArrayList<ClaseCalcularSueldo> listaCalcularSueldos ;
    
 
    
    public void crearArrayList(){
    
         listaCalcularSueldos=new ArrayList();
    
    }
    
    public void registrarEmpleado(ClaseCalcularSueldo sueldo){
        
        listaCalcularSueldos.add(sueldo);
    
    }
    
    public void actualizarEmpleado(int index, ClaseCalcularSueldo sueldo){
        
        listaCalcularSueldos.set(index, sueldo);
    
    }
    
    
    
    public int tamaArreglo(){
        
        int tam = listaCalcularSueldos.size();
        
        return tam;
    }} 
