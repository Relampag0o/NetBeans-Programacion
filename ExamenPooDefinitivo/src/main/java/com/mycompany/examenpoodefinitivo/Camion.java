/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpoodefinitivo;

import java.util.LinkedList;

/**
 *
 * @author josem
 */
public class Camion {
   private String matricula;
    private LinkedList<Producto> carga;

    public Camion(String matricula) {
        this.matricula = matricula;
        this.carga = new LinkedList<Producto>();

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void aniadirProducto(Producto producto) {
        carga.add(producto);
    }

    public void borrarProducto(Producto producto) {
        carga.remove(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : carga) {
            System.out.println(producto);
        }
    }

    public double calcularvalorCamion(Camion camion) {
        double valor = 0;
        for (int i = 0; i < camion.carga.size(); i++) {
            valor = valor + camion.carga.get(i).getPrecio();
        }
        return valor ;
    }

    public boolean estavacio(Camion camion) {
        boolean vacio = false;
        if (camion.carga.isEmpty()) {
            vacio = true;
        }
        return vacio;
    }

    public Producto descargarProductos(Camion camion) {
        if (estavacio(camion)==false) {
            return camion.carga.remove(0);

        
    }
        else return null;
    }

    @Override
    public String toString() {
        return " Camión : [ MatrÃ­cula: " + this.matricula + "; productos contenidos: " + this.carga + " ]";
    }

 
}
