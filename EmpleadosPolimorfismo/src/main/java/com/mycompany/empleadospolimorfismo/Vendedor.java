/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleadospolimorfismo;

import java.util.LinkedList;

/**
 *
 * @author josem
 */
public class Vendedor extends Empleado {

    private Coche coche;
    private String telefonomovil;
    private String areaventa;
    private LinkedList<Cliente> clientes;
    private double comision;
    
    public Vendedor(Coche coche, String telefonomovil, String areaventa, String dni, String nombre, String apellidos, String direccion, int aniosAntiguedad, String telefono, double salario) {
        super(dni, nombre, apellidos, direccion, aniosAntiguedad, telefono, salario);
        this.coche = coche;
        this.telefonomovil = telefonomovil;
        this.areaventa = areaventa;
        this.clientes = new LinkedList<Cliente>();
    }
    
    
    public Vendedor(Coche coche, String telefonomovil, String areaventa, String dni, String nombre, String apellidos, String direccion, int aniosAntiguedad, String telefono, double salario, Empleado supervisor) {
        super(dni, nombre, apellidos, direccion, aniosAntiguedad, telefono, salario, supervisor);
        this.coche = coche;
        this.telefonomovil = telefonomovil;
        this.areaventa = areaventa;
        this.clientes = new LinkedList<Cliente>();
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getTelefonomovil() {
        return telefonomovil;
    }

    public void setTelefonomovil(String telefonomovil) {
        this.telefonomovil = telefonomovil;
    }

    public String getAreaventa() {
        return areaventa;
    }

    public void setAreaventa(String areaventa) {
        this.areaventa = areaventa;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    
    public void aniadirCliente(Cliente cliente){
     if (clientes.size()>9)
            System.out.println("No se pueden añadir mas clientes.");
     else
         clientes.add(cliente);
    }
     public void borrarCliente(Cliente cliente){
     if (clientes.isEmpty() )
            System.out.println("La lista de clientes está vacía.");
     else
         clientes.remove(cliente);
    }
     public void cambiarCoche(Coche coche){
         setCoche(coche);
     }
    
    @Override
    public void incrementarSalario() {
        super.setSalario(super.getSalario()+(super.getSalario()*0.10*super.getAniosAntiguedad()));
    }

    @Override
    public String toString() {
        return "Vendedor{" + super.toString() + "coche=" + coche + ", telefonomovil=" + telefonomovil + ", areaventa=" + areaventa + ", clientes=" + clientes + ", comision=" + comision + '}';
    }

}
