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
public class JefeZona extends Empleado {
    private int idDespacho;
    private Secretario secretarioacargo;
    private Coche coche;
    private LinkedList<Vendedor> vendedores;

    public JefeZona(int idDespacho, Secretario secretarioacargo, Coche coche, String dni, String nombre, String apellidos, String direccion, int aniosAntiguedad, String telefono, double salario, Empleado supervisor) {
        super(dni, nombre, apellidos, direccion, aniosAntiguedad, telefono, salario, supervisor);
        this.idDespacho = idDespacho;
        this.secretarioacargo = secretarioacargo;
        this.coche = coche;
        this.vendedores = new LinkedList<Vendedor>();
    }

    public int getIdDespacho() {
        return idDespacho;
    }

    public void setIdDespacho(int idDespacho) {
        this.idDespacho = idDespacho;
    }

    public Secretario getSecretarioacargo() {
        return secretarioacargo;
    }

    public void setSecretarioacargo(Secretario secretarioacargo) {
        this.secretarioacargo = secretarioacargo;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
    
    
    
    
    
    public void aniadirVendedor(Vendedor vendedor){
     
         vendedores.add(vendedor);
    }
     public void borrarVendedor(Vendedor vendedor){
     if (vendedores.isEmpty() )
            System.out.println("La lista de vendedores está vacía.");
     else
         vendedores.remove(vendedor);
    }
     public void cambiarCoche(Coche coche){
         setCoche(coche);
     }
    
    @Override
    public void incrementarSalario() {
super.setSalario(super.getSalario()+(super.getSalario()*0.20*super.getAniosAntiguedad()));    }

    @Override
    public String toString() {
        return "JefeZona{" + super.toString()+ "idDespacho=" + idDespacho + ", secretarioacargo=" + secretarioacargo + ", coche=" + coche + ", vendedores=" + vendedores + '}';
    }

}
