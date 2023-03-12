/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacenpoli;

import java.util.LinkedList;

/**
 *
 * @author josem
 */
public class Estanteria {

    private String id;
    private int capacidad;
    private LinkedList<Bebida> bebidas;

    public Estanteria(String id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
        this.bebidas = new LinkedList();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void aniadirBebida(Bebida bebida) {
        if (this.capacidad > 0) {
            bebidas.add(bebida);
            this.capacidad--;
            // restamos uno a la capacidad porque estamos añadiendo una bebida..
        }else
        System.out.println("No hay más capacidad en la estantería seleccionada.");
    }

    public void borrarBebida(Bebida bebida) {
        if (bebidas.contains(bebida)) {
            bebidas.remove(bebida);
        } else {
            System.out.println("El producto no se encuentra en esta estantería.");
        }
    }
    public void calcularPrecio(){
        double acum=0;
        if (!bebidas.isEmpty()){
        for (Bebida bebida : bebidas) {
            if (bebida instanceof BebidaAzucarada){
                System.out.println(((BebidaAzucarada) bebida).calcularprecioConPromocion());
        }else
                bebida.calcularPrecioTodasLasBebidas();
    }
        
    }else
            System.out.println("La estantería no tiene productos.");
    }

    @Override
    public String toString() {
        return "Estanteria{" + "id=" + id + ", capacidad=" + capacidad + ", bebidas=" + bebidas + '}';
    }

}
