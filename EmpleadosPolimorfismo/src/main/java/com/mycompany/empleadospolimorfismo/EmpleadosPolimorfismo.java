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

        LinkedList<Empleado> empleados = new LinkedList();
        Coche coche1 = new Coche("3456B", "Renault", "Clio");
        Coche coche2 = new Coche("6789C", "Ford", "Fiesta");
        Cliente cli1 = new Cliente("1234", "Juan Perez", "juan.perez@example.com", "12345678");
        Cliente cli2 = new Cliente("5678", "Maria Rodriguez", "maria.rodriguez@example.com", "87654321");
        Cliente cli3 = new Cliente("9123", "Pedro Martinez", "pedro.martinez@example.com", "13579246");
        Cliente cli4 = new Cliente("4567", "Laura Sanchez", "laura.sanchez@example.com", "24681357");
        Cliente cli5 = new Cliente("8901", "Carlos Gomez", "carlos.gomez@example.com", "57913524");
        Secretario secre1 = new Secretario("secre123", "Roberto", "Lopez", "roberto.lopez@example.com", 10, "1234", 0, 0, "a1");
        Secretario secre2 = new Secretario("secre456", "Ana", "Garcia", "ana.garcia@example.com", 12, "5678", 0, 0, "a1");

        empleados.add(new Secretario("emp123", "Juan", "Gonzalez", "juan.gonzalez@example.com", 5, "1234", 1000, 5, "a1"));
        empleados.add(new Secretario("emp456", "Sofia", "Ruiz", "sofia.ruiz@example.com", 6, "5678", 1000, 5, "a1"));
        empleados.add(new Vendedor(coche2, "ven123", "A2", "emp123", "Lolo", "Perez", "lolo.perez@example.com", 6, "1234", 1300));
        empleados.add(new Vendedor(coche1, "ven456", "A3", "emp456", "Lolo", "Rodriguez", "lolo.rodriguez@example.com", 6, "5678", 1300));
        empleados.add(new JefeZona(3, secre1, coche2, "jefe123", "Jorge", "jorge@example.com", "12345678", 6, "1234", 1500, secre1));
        empleados.add(new JefeZona(5, secre2, coche1, "jefe456", "Jose", "jose@example.com", "87654321", 6, "5678", 1500, secre2));
        
        
        
        
        
        
        for (Empleado empleado : empleados) {
            System.out.print("Nombre del empleado: " + empleado.getNombre() + " " + " Salario antes del incremento: " + empleado.getSalario());
            empleado.incrementarSalario();
            System.out.print(" Salario despues del incremento: " + empleado.getSalario());
            System.out.println(""); 
            
          
            

        }
        
    }
}
