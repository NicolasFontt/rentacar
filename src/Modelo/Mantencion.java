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
public class Mantencion {
    private int idMantencion;
    private int idTipoMantencion;
    private String fechaMantencion;
    private String observaciones;
    private double costo;
    private int idUsuario;
    private int idVehiculo;
    private int idEstadoMantencion;
    private Date fechaRegistro;
    private int usuarioRegistro;

    public int getIdMantencion() {
        return idMantencion;
    }

    public void setIdMantencion(int idMantencion) {
        this.idMantencion = idMantencion;
    }

    public int getIdTipoMantencion() {
        return idTipoMantencion;
    }

    public void setIdTipoMantencion(int idTipoMantencion) {
        this.idTipoMantencion = idTipoMantencion;
    }

    public String getFechaMantencion() {
        return fechaMantencion;
    }

    public void setFechaMantencion(String fechaMantencion) {
        this.fechaMantencion = fechaMantencion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdEstadoMantencion() {
        return idEstadoMantencion;
    }

    public void setIdEstadoMantencion(int idEstadoMantencion) {
        this.idEstadoMantencion = idEstadoMantencion;
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
