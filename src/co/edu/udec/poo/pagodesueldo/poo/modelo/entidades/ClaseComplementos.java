/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.pagodesueldo.poo.modelo.entidades;

import javax.swing.JTextField;

/**
 *
 * @author JARK
 */
public class ClaseComplementos {

    private int IdComplementos;
    private String Descripcion;
    private String Fecha;
    private String Cedula;
    private int Cantidad;
    private int ValorComplemento;

    public int getIdComplementos() {
        return IdComplementos;
    }

    public void setIdComplementos(int IdComplementos) {
        this.IdComplementos = IdComplementos;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getValorComplemento() {
        return ValorComplemento;
    }

    public void setValorComplemento(int ValorComplemento) {
        this.ValorComplemento = ValorComplemento;
    }
     
}
