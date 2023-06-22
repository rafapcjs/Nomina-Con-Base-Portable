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
public class ClaseDeducciones {

     private int IdDeduccion;
    private String Nombre;
    private int PorcentajeDedu;
    private int ValorRangoInicial;
     private int ValorRangoFinal ; 

    public int getIdDeduccion() {
        return IdDeduccion;
    }

    public void setIdDeduccion(int IdDeduccion) {
        this.IdDeduccion = IdDeduccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPorcentajeDedu() {
        return PorcentajeDedu;
    }

    public void setPorcentajeDedu(int PorcentajeDedu) {
        this.PorcentajeDedu = PorcentajeDedu;
    }

    public int getValorRangoInicial() {
        return ValorRangoInicial;
    }

    public void setValorRangoInicial(int ValorRangoInicial) {
        this.ValorRangoInicial = ValorRangoInicial;
    }

    public int getValorRangoFinal() {
        return ValorRangoFinal;
    }

    public void setValorRangoFinal(int ValorRangoFinal) {
        this.ValorRangoFinal = ValorRangoFinal;
    }

  
    
    
}
