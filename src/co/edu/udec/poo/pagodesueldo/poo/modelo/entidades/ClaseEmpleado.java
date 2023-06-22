/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.pagodesueldo.poo.modelo.entidades;

/**
 *
 * @author JARK
 */
public class ClaseEmpleado{
    
    int ID, NUM_CEDULA, NUM_CUENTA, COD_CATEGORIA,NUM_CONTRATO;
    String EMP_NOMBRE, EMP_APELLIDO, TELEFONO, EMP_DIRECCION;
    
    
        public int getID() {
        return ID;
    }

    public int getNUM_CONTRATO() {
        return NUM_CONTRATO;
    }

    public void setNUM_CONTRATO(int NUM_CONTRATO) {
        this.NUM_CONTRATO = NUM_CONTRATO;
    }
        
        

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNUM_CEDULA() {
        return NUM_CEDULA;
    }

    public void setNUM_CEDULA(int NUM_CEDULA) {
        this.NUM_CEDULA = NUM_CEDULA;
    }

    public int getNUM_CUENTA() {
        return NUM_CUENTA;
    }

    public void setNUM_CUENTA(int NUM_CUENTA) {
        this.NUM_CUENTA = NUM_CUENTA;
    }

    public int getCOD_CATEGORIA() {
        return COD_CATEGORIA;
    }

    public void setCOD_CATEGORIA(int COD_CATEGORIA) {
        this.COD_CATEGORIA = COD_CATEGORIA;
    }

    public String getEMP_NOMBRE() {
        return EMP_NOMBRE;
    }

    public void setEMP_NOMBRE(String EMP_NOMBRE) {
        this.EMP_NOMBRE = EMP_NOMBRE;
    }

    public String getEMP_APELLIDO() {
        return EMP_APELLIDO;
    }

    public void setEMP_APELLIDO(String EMP_APELLIDO) {
        this.EMP_APELLIDO = EMP_APELLIDO;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getEMP_DIRECCION() {
        return EMP_DIRECCION;
    }

    public void setEMP_DIRECCION(String EMP_DIRECCION) {
        this.EMP_DIRECCION = EMP_DIRECCION;
    }
  


}
