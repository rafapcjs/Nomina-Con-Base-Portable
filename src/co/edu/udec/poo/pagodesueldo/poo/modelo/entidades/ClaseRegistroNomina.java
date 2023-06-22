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
public class ClaseRegistroNomina {
   private int IdNomina; 
   private int Cedula; 
   private int SalarioBase; 
   private int IdComplemento; 
   private int IdDeducciones; 
  

 private int TotalComplementos; 
   private int TotalDeducciones; 
private int TotalPago;

    public int getIdNomina() {
        return IdNomina;
    }

    public void setIdNomina(int IdNomina) {
        this.IdNomina = IdNomina;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(int SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public int getIdComplemento() {
        return IdComplemento;
    }

    public void setIdComplemento(int IdComplemento) {
        this.IdComplemento = IdComplemento;
    }

    public int getIdDeducciones() {
        return IdDeducciones;
    }

    public void setIdDeducciones(int IdDeducciones) {
        this.IdDeducciones = IdDeducciones;
    }

    public int getTotalComplementos() {
        return TotalComplementos;
    }

    public void setTotalComplementos(int TotalComplementos) {
        this.TotalComplementos = TotalComplementos;
    }

    public int getTotalDeducciones() {
        return TotalDeducciones;
    }

    public void setTotalDeducciones(int TotalDeducciones) {
        this.TotalDeducciones = TotalDeducciones;
    }

    public int getTotalPago() {
        return TotalPago;
    }

    public void setTotalPago(int TotalPago) {
        this.TotalPago = TotalPago;
    }

}