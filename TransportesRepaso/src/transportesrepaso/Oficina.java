/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportesrepaso;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Oficina {

    private int id;
    private Ubicacion ubicacion;
    private LinkedList<Trabajador> trabajadores;
    private LinkedList<Paquete> paquetes;

    public Oficina(int id, Ubicacion ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.trabajadores = new LinkedList<>();
        this.paquetes = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void aniadirTrabajador(Trabajador trabajador) {
        this.trabajadores.add(trabajador);
    }

    public void borrarTrabajador(Trabajador trabajador) {
        this.trabajadores.remove(trabajador);
    }

    public void mostrarTrabajadores() {
        System.out.println("Trabajadores de la oficina " + this.id + ":");
        for (Trabajador trabajador : this.trabajadores) {
            System.out.println(trabajador);
        }
    }

    public void aniadirPaquete(Paquete paquete) {
        this.paquetes.add(paquete);
    }

    public void borrarPaquete(Paquete paquete) {
        this.paquetes.remove(paquete);
    }

    public void mostrarPaquetes() {
        System.out.println("Paquetes de la oficina " + this.id + ":");
        for (Paquete paquete : this.paquetes) {
            System.out.println(paquete);
        }
    }

    public Paquete elegirPaquete() {

        Scanner lecturanumeros = new Scanner(System.in);
        int numeropaquete = -1;
        Paquete elegido = null;
        if (!paquetes.isEmpty()) {
            System.out.println("A continuación se mostrarán los paquetes para que elija uno:");
            for (int i = 0; i < paquetes.size(); i++) {
                System.out.println("Paquete número:" + i + "." + "" + paquetes.get(i));
            }
            do {
                System.out.println("Inserte el número del paquete:");
                numeropaquete = lecturanumeros.nextInt();
            } while (numeropaquete < 0 || numeropaquete >= paquetes.size());
            elegido = paquetes.get(numeropaquete);

            return elegido;

        } else {
            return elegido;
        }

    }

    public int obtenertrabajadoresTAM() {
        return trabajadores.size();
    }

    public int obtenerpaquetesTAM() {
        return trabajadores.size();
    }

    @Override
    public String toString() {
        return "Oficina [id:" + this.id + "; ubicacion:" + this.ubicacion + "; paquetes asociados:" + this.paquetes + "; trabajadores:" + this.trabajadores + "]";
    }
}
