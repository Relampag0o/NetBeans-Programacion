/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpoodefinitivo;

import java.util.LinkedList;

/**
 *
 * @author josem
 */
public class Reponedor {
     private String dni;
    private String nombre;

    public Reponedor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
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
    
    public void descargarCamion(LinkedList<Producto>productossupermercado,Producto produ){
    
         productossupermercado.add(produ);
     
        System.out.println("Se ha completado la descarga.");  
        
    }
    
    @Override
    public String toString() {
        return " Reponedor : [ id: " + this.dni + "; nombre:"  + " ]";
    }
}
