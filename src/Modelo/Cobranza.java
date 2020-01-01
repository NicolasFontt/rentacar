/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Nicolas
 */
public class Cobranza {
    private int idCobranza;
    private int idArriendo;
    private double neto;
    private double iva;
    private double total;
    private int idEstadoCobranza;
    private Date fechaRegistro;
    private int usuarioRegistro;

    public int getIdCobranza() {
        return idCobranza;
    }

    public void setIdCobranza(int idCobranza) {
        this.idCobranza = idCobranza;
    }

    public int getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(int idArriendo) {
        this.idArriendo = idArriendo;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdEstadoCobranza() {
        return idEstadoCobranza;
    }

    public void setIdEstadoCobranza(int idEstadoCobranza) {
        this.idEstadoCobranza = idEstadoCobranza;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(int usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }
    
}
