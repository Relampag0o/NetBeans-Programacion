/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacenpoli;

/**
 *
 * @author josem
 */
public class AguaMineral extends Bebida {
    
    private String origen;

    public AguaMineral(String origen, String id, int litros, double precio, String marca) {
        super(id, litros, precio, marca);
        this.origen = origen;
    }

    
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "AguaMineral{" + super.toString() + "origen=" + origen + '}';
    }
    
    
    

    @Override
    public void calcularPrecioTodasLasBebidas() {
         System.out.println(super.getPrecio() + "€");
    }

    @Override
    public void calcularPrecioMarca(String marca) {
        if (super.getMarca().equals(marca))
            System.out.println(super.getPrecio());
            
    }
    
    
}
