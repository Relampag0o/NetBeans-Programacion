/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoorepaso;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Trabajador {

    private String dni;
    private String nombre;
    private Rango rango;
    
    private LinkedList<Aviso> avisos;

    public Trabajador(String dni, String nombre, Rango rango) {
        this.dni = dni;
        this.nombre = nombre;
        this.rango = rango;
        
        this.avisos = new LinkedList<Aviso>();
    }

    public Trabajador(String id, String nombre, Rango rango, Animal animal, Aviso aviso) {
        this.dni = id;
        this.nombre = nombre;
        this.rango = rango;
        
        this.avisos = new LinkedList<Aviso>();
        avisos.add(aviso);
    }

    public String getDni() {
        return dni;
    }

    public void setId(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

   

   

    public void aniadirAviso(Aviso aviso) {
        avisos.add(aviso);
    }

    public void borrarAviso(Aviso aviso) {
        avisos.remove(aviso);
    }

    public void mostrarAvisos() {
        for (Aviso avis : avisos) {
            System.out.println(avis);
        }
    }

    @Override
    public String toString() {

        return "Trabajador [ dni: " + this.dni  + "; nombre:" + this.nombre  + "; rango: " + this.rango   + "; avisos asociados: " + this.avisos + " ]";

    }

    @Override
    public boolean equals(Object obj) {
        return this.dni.equals(((Trabajador) obj).getDni());
    }

}
