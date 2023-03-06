/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleadospolimorfismo;

/**
 *
 * @author josem
 */
public abstract class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int aniosAntiguedad;
    private String telefono;
    private double salario;
    private Empleado supervisor;
    
    public Empleado(String dni, String nombre, String apellidos, String direccion, int aniosAntiguedad, String telefono, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.aniosAntiguedad = aniosAntiguedad;
        this.telefono = telefono;
        this.salario = salario;
       
    }

    public Empleado(String dni, String nombre, String apellidos, String direccion, int aniosAntiguedad, String telefono, double salario, Empleado supervisor) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.aniosAntiguedad = aniosAntiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor=supervisor;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void cambiarSupervisor(Empleado empleado){
        setSupervisor(supervisor);
    }
    
    public abstract void incrementarSalario();
    
    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", aniosAntiguedad=" + aniosAntiguedad + ", telefono=" + telefono + ", salario=" + salario + '}';
    }
     
}
