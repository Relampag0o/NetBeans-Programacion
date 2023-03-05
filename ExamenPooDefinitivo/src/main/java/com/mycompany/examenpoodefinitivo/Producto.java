/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpoodefinitivo;

/**
 *
 * @author josem
 */
public class Producto {
    private int id;
    private String descripcion;
    private double precio;
    private Categoria cat;

    public Producto(int id, String descripcion, double precio, Categoria cat) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cat = cat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return " Producto : [ id: " + this.id + "; descripciÃ³n:" + this.descripcion + "; precio:" + this.precio + "; categoria: " + this.cat + " ]";
    }

}
