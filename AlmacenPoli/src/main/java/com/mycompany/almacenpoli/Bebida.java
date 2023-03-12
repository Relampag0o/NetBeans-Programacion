/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacenpoli;

/**
 *
 * @author josem
 */
public abstract class Bebida {
    
    private String id;
    private int litros;
    private double precio;
    private String marca;

    public Bebida(String id, int litros, double precio, String marca) {
        this.id = id;
        this.litros = litros;
        this.precio = precio;
        this.marca = marca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Bebida{" + "id=" + id + ", litros=" + litros + ", precio=" + precio + ", marca=" + marca + '}';
    }
   
    public abstract void calcularPrecioTodasLasBebidas();
    
    public abstract void calcularPrecioMarca(String marca);
    
}
