/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Tienda {

    private String id;
    private String ubicacion;
    private Trabajador responsable;
    private LinkedList<Trabajador> trabajadores;

    public Tienda(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.trabajadores = new LinkedList();

    }

    public Tienda(String id, String ubicacion, Trabajador responsable) {
        this.id = id;
        this.ubicacion = ubicacion;
        LinkedList<Trabajador> trabajadores = new LinkedList();
        trabajadores.add(responsable);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Trabajador getResponsable() {
        return responsable;
    }

    public void setResponsable(Trabajador responsable) {
        this.responsable = responsable;
    }

    public void aniadirTrabajadores(Trabajador trabajador) {

        trabajadores.add(trabajador);

    }

    public void borrarElectrodomesticos(Trabajador trabajador) {
        if (trabajadores.contains(trabajador)) {
            trabajadores.remove(trabajador);
        } else {
            System.out.println("El trabajador no pertenece a esta tienda");
        }
    }
    public void borrarTrabajadores(Trabajador trabajador) {
        if (trabajadores.contains(trabajador)) {
            trabajadores.remove(trabajador);
        } else {
            System.out.println("El trabajador no pertenece a esta tienda");
        }
    }

    public void mostrarTrabajadores() {
// Inicializo este bucle a 1 para evitar que nos muestre el responsable, el cual lo tratamos de otra forma. 
// (sabemos que el responsable será el trabajador número 0)
        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores en esta tienda");
        } else {
            for (int i=1; i<trabajadores.size(); i++) {
                System.out.println(trabajadores.get(i));
            }
        }
    }

    // esta es la función que me muestra si la tienda no tiene trabajadores pero finalmente he utilizado el if(.getResponsable==null..);
    public boolean listaTrabajadoresVacia() {
        boolean tam = true;
        if (trabajadores.size() < 0) {
            tam = false;
        }
        return tam;
    }
    public Trabajador elegirTrabajador() {
        Scanner lecturanumeros=new Scanner(System.in);
        int opcion=-1;
        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores en esta tienda");
        } else {
            for (int i=1; i<trabajadores.size(); i++) {
                System.out.println("Número: " + i + trabajadores.get(i));
            }
            System.out.println("Seleccione el trabajador que le interesa:");
        opcion=lecturanumeros.nextInt();
        }
        
        return trabajadores.get(opcion);
    }

    @Override
    public String toString() {
        if (this.responsable == null) 
            return "Tienda [ id: " + this.id + "; " + " ubicacion: " + this.ubicacion + " ; " + " responsable: " + "No hay responsable asignado" + " ]";
         else 
            return "Tienda [ id: " + this.id + "; " + " ubicacion: " + this.ubicacion + " ; " + " responsable: " + this.responsable + " ]";

    
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Tienda) obj).getId());
    }

}
