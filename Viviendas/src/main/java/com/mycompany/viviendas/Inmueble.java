/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viviendas;

/**
 *
 * @author josem
 */
public class Inmueble {
    private int id;
    private int area;
    private String direccion;

    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "id=" + id + ", area=" + area + ", direccion=" + direccion + '}';
    }
    
}
