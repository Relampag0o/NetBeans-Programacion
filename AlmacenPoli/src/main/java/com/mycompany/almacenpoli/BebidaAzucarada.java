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
        System.out.println(super.getPrecio() + "€");
    }

    @Override
    public void calcularPrecioMarca(String marca) {
        if (super.getMarca().equals(marca)) {
            if (tienepromocion) {
                super.setPrecio(super.getPrecio() - (super.getPrecio() * 0.10));
                System.out.println(super.getPrecio());
            }else
                System.out.println(super.getPrecio());
        }
    }

    public double calcularprecioConPromocion(){
        if (tienepromocion){
            super.setPrecio(super.getPrecio() - (super.getPrecio() * 0.10));
         
        }
            return super.getPrecio();
    }
    
}
