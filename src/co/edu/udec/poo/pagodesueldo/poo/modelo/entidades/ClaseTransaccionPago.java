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
public class ClaseTransaccionPago {
   private int IdPago; 
      private String Cedula; 
        private int NumCuenta; 
      private String Fecha; 
      private int ValorPagar;  

    public ClaseTransaccionPago(int IdPago, String Cedula, int NumCuenta, String Fecha, int ValorPagar) {
        this.IdPago = IdPago;
        this.Cedula = Cedula;
        this.NumCuenta = NumCuenta;
        this.Fecha = Fecha;
        this.ValorPagar = ValorPagar;
    }

    public int getIdPago() {
        return IdPago;
    }

    public void setIdPago(int IdPago) {
        this.IdPago = IdPago;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getValorPagar() {
        return ValorPagar;
    }

    public void setValorPagar(int ValorPagar) {
        this.ValorPagar = ValorPagar;
    }  
}
