/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaropa;

import java.util.LinkedList;

/**
 *
 * @author josem
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String direccion;
    private LinkedList<Prenda> carrito;

    public Cliente(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.carrito=new LinkedList<Prenda>();
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void aniadirAlCarrito(Prenda prenda,int cantidad){
     carrito.add(prenda);
     prenda.setStock(prenda.getStock()- cantidad);
        
        
    }
    public Prenda eliminarCarrito(){
        return this.carrito.get(0);
    }
    
    public int prendasCarrito(){
        return this.carrito.size();
    }
   
    
    
    
    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
