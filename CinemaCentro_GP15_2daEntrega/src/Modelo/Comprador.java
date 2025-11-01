/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Comprador {
    private int id_comprador;
    private int dni;
    private String nombre;
    private Date fecha_nac;
    private String contraseña;
    private String email;

    public Comprador() {
    }

    public Comprador(int id_comprador, int dni, String nombre, Date fecha_nac, String contraseña, String email) {
        this.id_comprador = id_comprador;
        this.dni = dni;
        this.nombre = nombre;
        this.fecha_nac = fecha_nac;
        this.contraseña = contraseña;
        this.email = email;
    }

    public int getIdcomprador() {
        return id_comprador;
    }

    public void setIdcomprador(int id_comprador) {
        this.id_comprador = id_comprador;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Comprador{" + "id_comprador=" + id_comprador + ", dni=" + dni + ", nombre=" + nombre + ", fecha_nac=" + fecha_nac + ", contrase\u00f1a=" + contraseña + ", email=" + email + '}';
    }
    
    
}
