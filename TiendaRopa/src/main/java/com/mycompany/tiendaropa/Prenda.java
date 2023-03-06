/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaropa;

/**
 *
 * @author josem
 */
public class Prenda {
    private String id;
    private String descripcion;
    private Talla talla;
    private Tipo tipo;
    private double precio;
    private int stock;

    public Prenda(String id, String descripcion, Talla talla, double precio, Tipo tipo, int stock) {
        this.id = id;
        this.descripcion = descripcion;
        this.talla = talla;
        this.tipo = tipo;
        this.precio = precio;
        this.stock=stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Prenda{" + "id=" + id + ", descripcion=" + descripcion + ", talla=" + talla + ", tipo=" + tipo + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
    
}
