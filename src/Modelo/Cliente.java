/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import datos.Operacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Cliente {
    private int idCliente;
    private String rut;
    private String dv;
    private String nombres;
    private String apellidos;
    private String email;
    private String celular;
    private String fechaRegistro;
    private String usuarioRegistro;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(String usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }
    
    public void agregarCliente(){
        JOptionPane.showMessageDialog(null, "Rut: "+this.rut+"-"+this.dv+ "Nombres: "+this.nombres+ "Apellidos: "+this.apellidos+ "Numero: "+this.celular+ "Correo: "+this.email);
        //Generamos la insersion
        Operacion operacion = new Operacion();
        String sql ="inster into Cliente(rut,dv,nombres,apellidos,celular,email) values('"+this.rut+"', '"+this.dv+"', '"+this.nombres+"','"+this.apellidos+"','"+this.celular+"','"+this.email+"')";
        operacion.ejecutar(sql);
    }
}
