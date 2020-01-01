/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import datos.Operacion;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Vehiculo {
    private int marca;
    private int idVehiculo;
    private int tipoVehiculo;
    private int tipoCarroceria;
    private String modelo;
    private int ano;
    private int cilindrada;
    private String patente;
    private int color;
    private int estadoVehiculo;
    private double valorArriendo;
    private int kilometrajeActual;
    private Date fechaRegistro;
    private int usuarioRegistro;

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(int tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(int estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public double getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(double valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public int getKilometrajeActual() {
        return kilometrajeActual;
    }

    public void setKilometrajeActual(int kilometrajeActual) {
        this.kilometrajeActual = kilometrajeActual;
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
    
    public void agregarVehiculo(){
        JOptionPane.showMessageDialog(null, "Modelo: "+this.modelo+ "Año: "+this.ano+ "Cilindrada: "+this.cilindrada+ "Patente: "+this.patente+ "Valor del Arriendo: "+this.valorArriendo+  "Kilometraje inicial: "+this.kilometrajeActual);
        //Generamos la insersion
        Operacion operacion = new Operacion();
        String sql ="inster into Vehiculo(marca,tipoVehiculo,tipoCarroceria,valorArriendo,kilometrajeActual) values('"+this.marca+"', '"+this.tipoVehiculo+"', '"+this.tipoCarroceria+"','"+this.valorArriendo+"','"+this.kilometrajeActual+"')";
        operacion.ejecutar(sql);
    }
    
    public void actualizarVehiculo(){
        Operacion operacion = new Operacion();
        String sql ="update Vehiculo set (marca,tipoVehiculo,tipoCarroceria,valorArriendo,kilometrajeActual) values('"+this.marca+"', '"+this.tipoVehiculo+"', '"+this.tipoCarroceria+"','"+this.valorArriendo+"','"+this.kilometrajeActual+"')";
        operacion.ejecutar(sql);
        
    }
    public void eliminarVehiculo(){
        Operacion operacion = new Operacion();
        String sql ="delete from Vehiculo where idVehiculo = '"+idVehiculo+"'";
        operacion.ejecutar(sql);
    }
    public void listarVehiculos(){
        
    }
}
