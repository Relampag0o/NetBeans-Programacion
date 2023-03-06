/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleadospolimorfismo;

import java.util.LinkedList;

/**
 *
 * @author josem
 */
public class EmpleadosPolimorfismo {

    public static void main(String[] args) {
        
        /*
        
          super(dni, nombre, apellidos, direccion, aniosAntiguedad, telefono, salario);
        this.coche = coche;
        this.telefonomovil = telefonomovil;
        this.areaventa = areaventa;
        this.clientes = new LinkedList<Cliente>();
        */
        LinkedList<Empleado>empleados=new LinkedList();
        Coche coche1=new Coche("1234A", "Seat", "Ibiza");
        Coche coche2=new Coche("1234R", "VW", "Passat");
        Cliente cli1=new Cliente("1234", "pepito", "asdf", "asdf");
        Cliente cli2=new Cliente("123I", "gonzalo", "asdf", "asdf");
        Cliente cli3=new Cliente("1234R", "andres", "asdf", "asdf");
        Cliente cli4=new Cliente("1234T", "joaquin", "asdf", "asdf");
        Cliente cli5=new Cliente("1234E", "alejandro", "asdf", "asdf");
        Secretario secre1=new Secretario("prueba", "asdf", "asdf", "asdf", 7, "asdf", 0, 0, "asdf");
        Secretario secre2=new Secretario("prueba2", "asdf", "asdf", "asdf", 7, "asdf", 0, 0, "asdf");
        
        
        empleados.add(new Secretario("12Q", "Pepe", "roberto", "asdf", 5, "1234", 1000, 5, "1234"));
        empleados.add(new Secretario("12E", "Juan", "roberto", "asdf", 6, "1234", 1100, 5, "1234"));
        empleados.add(new Vendedor(coche2, "1234", "A2", "12E", "lolo", "perez", "asdf", 1300, "1234", 6));
        empleados.add(new Vendedor(coche1, "1234", "A2", "12E", "lolo", "perez", "asdf", 1300, "1234", 6));
        empleados.add(new JefeZona(3, secre1, coche2, "QWERT", "Jorge", "asdf", "asdf", 6, "1234", 1500, secre1));
        empleados.add(new JefeZona(5, secre2, coche1, "QWERT", "Jose", "asdf", "asdf", 6, "1234", 1500, secre1));
        
        
        for (Empleado empleado : empleados) {
            empleado.incrementarSalario();
            System.out.println(empleado.getSalario());
            
        }
    }
}
