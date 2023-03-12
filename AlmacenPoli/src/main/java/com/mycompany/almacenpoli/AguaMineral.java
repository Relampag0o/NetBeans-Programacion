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
    public double calcularPrecioTodasLasBebidas() {
        return super.getPrecio();
    }

    @Override
    public double calcularPrecioMarca(String marca) {
        double preciototal = 0;
        if (super.getMarca().equalsIgnoreCase(marca)) {
            preciototal = preciototal + super.getPrecio();
        }
        return preciototal;
    }

    // ahora lo hare calculando el precio individual de una marca en vez de devolviendo el importe total de sus productos..
    // evidentemente el metodo ya esta implementado arriba y este deberia ser el que hereda de la clase Bebida
    // pero lo dejaré así para que no se me pase preguntarlo
    
    //@override
    public double calcularPrecioMarcaIndividual(String marca) {
        double precio = 0;
        if (super.getMarca().equalsIgnoreCase(marca)) {
            precio = super.getPrecio();

        }
        return precio;

        // no se como hacer para que si la marca no coincide devuelva un valor correcto y
        // no un null o un 0. Es decir, si metemos la marca "Coca-Cola" y hay productos que no son Coca-Cola,
        // no quiero que devuelva un 0 o un null. Es aquí donde reside mi duda.
    }
}
