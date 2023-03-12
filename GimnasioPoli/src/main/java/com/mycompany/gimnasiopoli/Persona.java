/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gimnasiopoli;

/**
 *
 * @author josem
 */
public abstract class Persona {
    private String dni;
    private String nombrecompleto;
    private int edad;
    

    public Persona(String dni, String nombrecompleto, int edad) {
        this.dni = dni;
        this.nombrecompleto = nombrecompleto;
        this.edad = edad;
        
        
    }
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombrecompleto=" + nombrecompleto + ", edad=" + edad + '}';
    }

    

    
    
    public abstract void entrenar();
        
    
    
    
}
