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
public class ClaseCalcularSueldo {
   private float Trineos;
    private String Categoria;
   private float TotalDeducciones;
   private float SueldoBase; 

    public ClaseCalcularSueldo(float Trineos, String Categoria, float TotalDeducciones, float SueldoBase) {
        this.Trineos = Trineos;
        this.Categoria = Categoria;
        this.TotalDeducciones = TotalDeducciones;
        this.SueldoBase = SueldoBase;
    }

    public float getTrineos() {
        return Trineos;
    }

    public void setTrineos(float Trineos) {
        this.Trineos = Trineos;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public float getTotalDeducciones() {
        return TotalDeducciones;
    }

    public void setTotalDeducciones(float TotalDeducciones) {
        this.TotalDeducciones = TotalDeducciones;
    }

    public float getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(float SueldoBase) {
        this.SueldoBase = SueldoBase;
    }
     
   
  
}
