/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleadospolimorfismo;

/**
 *
 * @author josem
 */
public class Secretario extends Empleado {
    private int idDespacho;
    private String fax;
    
    public Secretario(String dni, String nombre, String apellidos, String direccion, int aniosAntiguedad, String telefono, double salario, int idDespacho,String fax) {
        super(dni, nombre, apellidos, direccion, aniosAntiguedad, telefono, salario);
        this.idDespacho=idDespacho;
        this.fax=fax;
    }

    public Secretario(String dni, String nombre, String apellidos, String direccion, int aniosAntiguedad, String telefono, double salario, Empleado supervisor,int idDespacho,String fax) {
        super(dni, nombre, apellidos, direccion, aniosAntiguedad, telefono, salario, supervisor);
        this.idDespacho=idDespacho;
        this.fax=fax;
    }

    public int getIdDespacho() {
        return idDespacho;
    }

    public void setIdDespacho(int idDespacho) {
        this.idDespacho = idDespacho;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    

    @Override
    public void incrementarSalario() {
        super.setSalario(super.getSalario()+(super.getSalario()*0.05*super.getAniosAntiguedad()));
    }

    @Override
    public String toString() {
        return "Secretario{ " + super.toString() + "idDespacho=" + idDespacho + ", fax=" + fax + '}';
    }
    
}
