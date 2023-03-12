/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacenpoli;

/**
 *
 * @author josem
 */
public class BebidaAzucarada extends Bebida {

    private double porcentajeazucar;
    private boolean tienepromocion;

    public BebidaAzucarada(double porcentajeazucar, boolean tienepromocion, String id, int litros, double precio, String marca) {
        super(id, litros, precio, marca);
        this.porcentajeazucar = porcentajeazucar;
        this.tienepromocion = tienepromocion;
    }

    public double getPorcentajeazucar() {
        return porcentajeazucar;
    }

    public void setPorcentajeazucar(double porcentajeazucar) {
        this.porcentajeazucar = porcentajeazucar;
    }

    public boolean isTienepromocion() {
        return tienepromocion;
    }

    public void setTienepromocion(boolean tienepromocion) {
        this.tienepromocion = tienepromocion;
    }

    @Override
    public String toString() {
        return "BebidaAzucarada{" + super.toString() + "porcentajeazucar=" + porcentajeazucar + ", tienepromocion=" + tienepromocion + '}';
    }

    @Override
    public double calcularPrecioTodasLasBebidas() {
        if (tienepromocion) {
            super.setPrecio(super.getPrecio() - (super.getPrecio() * 0.10));
        }
        return super.getPrecio();
    }
    // sigo teniendo la misma duda que con la clase anterior..
    // se calcula el precio total pero si quisiese ir calculando 
    // su precio unitario, no veo la forma de hacerlo sin que
    // devuelva un null o un 0 cuando encuentre un producto
    // que no sea de esa marca indicada.
    @Override
    public double calcularPrecioMarca(String marca) {
        double preciototal=0;
        if (super.getMarca().equals(marca)) {
            if (tienepromocion) {
                super.setPrecio(super.getPrecio() - (super.getPrecio() * 0.10));
                preciototal=preciototal+super.getPrecio();
            }else
                preciototal=preciototal+super.getPrecio();
        }
        return preciototal;
    }

    
    
}
