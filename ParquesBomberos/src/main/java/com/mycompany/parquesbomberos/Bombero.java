/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquesbomberos;

/**
 *
 * @author Carlos CG
 */

public class Bombero {
    
    private int id;
    private String nombreCompleto;
    private int edad;
    private Rango rango;
    
    public Bombero(int id, String nombreCompleto, int edad, Rango rango){
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.rango = rango;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Bombero[id: " + this.id + "; nombre: " + 
                this.nombreCompleto + "; edad: " + this.edad +
                "; rango: " + this.rango + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Bombero) obj).id;
    }
    
    
    
    
}
