/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaropa;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Trabajador {

    private String dni;
    private String nombre;
    private Rango rango;

    public Trabajador(String dni, String nombre, Rango rango) {
        this.dni = dni;
        this.nombre = nombre;
        this.rango = rango;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public void elegirPrenda(LinkedList<Prenda> prendasdelsuper, Cliente cliente) {
        Scanner lecturanumeros = new Scanner(System.in);
        Scanner lecturanombres = new Scanner(System.in);
        int cantidad = 0;
        int opcion = -1;
        double acum = 0;
        String eleccion = "SI";
        Prenda elegido = null;
        do {
            System.out.println("A continuación se mostrarán las prendas para que seleccione una: ");
            for (int i = 0; i < prendasdelsuper.size(); i++) {
                System.out.println("Prenda número: " + i + prendasdelsuper.get(i));
            }
            System.out.println("Seleccione el número de prenda:");
            opcion = lecturanumeros.nextInt();
            System.out.println("Seleccione la cantidad que desea:");
            cantidad = lecturanumeros.nextInt();
            elegido = prendasdelsuper.get(opcion);
            cliente.aniadirAlCarrito(elegido, cantidad);
            acum = acum + (elegido.getPrecio() * cantidad);
            System.out.println("¿Quiere seguir añadiendo prendas?(SI/NO):");
            eleccion = lecturanombres.nextLine();

        } while (eleccion.equalsIgnoreCase("SI"));
        System.out.println("El precio total del carrito es:" + acum + "€.");
    }

    public void eliminarCarrito(Cliente clien) {
        for (int i = 0; i < clien.prendasCarrito(); i++) {
            clien.eliminarCarrito();
        }
    }
    public void aniadirStock(Prenda p, int stock){
        p.setStock(stock + p.getStock());
}

    @Override
    public String toString() {
        return "Trabajador{" + "dni=" + dni + ", nombre=" + nombre + ", rango=" + rango + '}';
    }

}
