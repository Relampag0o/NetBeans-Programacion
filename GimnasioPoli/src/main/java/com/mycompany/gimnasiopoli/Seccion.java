/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gimnasiopoli;

import java.util.LinkedList;

/**
 *
 * @author josem
 */
public class Seccion {

    private String id;
    private String nombre;
    private LinkedList<Incidencia> incidencias;
    private LinkedList<Material> materiales;

    public Seccion(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.incidencias = new LinkedList();
        this.materiales = new LinkedList();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // este metodo solo se deberia poder invocar desde el trabajador.
    public void aniadirIncidencia(Incidencia incidencia) {
        incidencias.add(incidencia);
    }

    public void borrarIncidencia(Incidencia incidencia) {
        if (incidencias.contains(incidencia)) {
            incidencias.remove(incidencia);
        }
    }

    public void mostrarIncidencias() {
        for (Incidencia incidencia : incidencias) {
            System.out.println(incidencia);
        }
    }

    public void aniadirMaterial(Material mat) {
        materiales.add(mat);
    }

    public void borrarMaterial(Material mat) {
        if (materiales.contains(mat)) {
            incidencias.remove(mat);
        }
    }

    public void mostrarMateriales() {
        for (Material mat : materiales) {
            System.out.println(mat);
        }
    }

    @Override
    public String toString() {
        return "seccion{" + "id=" + id + ", nombre=" + nombre + ", incidencias=" + incidencias + ", materiales=" + materiales + '}';
    }

}
