/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;

/**
 *
 * @author krist
 */
public class Colaborador {
    private int cedula;
    private String nombre;
    private LocalDate fechaNac;
    private LocalDate fechaIngreso;
    private LocalDate fechaDespido;
    private String direccion;
    private int telefono;
    private String email;
    private Puestos puesto;
    private int cedJefe;

    public Colaborador(int cedula, String nombre, LocalDate fechaNac, LocalDate fechaIngreso, LocalDate fechaDespido, String direccion, int telefono, String email, Puestos puesto, int cedJefe) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.fechaIngreso = fechaIngreso;
        this.fechaDespido = fechaDespido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.puesto = puesto;
        this.cedJefe = cedJefe;
    }

    public Colaborador() {
        this.cedula = 0;
        this.nombre = "";
        this.fechaNac = null;
        this.fechaIngreso = null;
        this.fechaDespido = null;
        this.direccion = "";
        this.telefono = 0;
        this.email = "";
        this.puesto = null;
        this.cedJefe = 0;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public LocalDate getFechaDespido() {
        return fechaDespido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Puestos getPuesto() {
        return puesto;
    }

    public int getCedJefe() {
        return cedJefe;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaDespido(LocalDate fechaDespido) {
        this.fechaDespido = fechaDespido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPuesto(Puestos puesto) {
        this.puesto = puesto;
    }

    public void setCedJefe(int cedJefe) {
        this.cedJefe = cedJefe;
    }
    
    
    
}
