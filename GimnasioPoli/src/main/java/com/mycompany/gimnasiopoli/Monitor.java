/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gimnasiopoli;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Monitor extends Persona {

    private int experiencia;
    private Seccion seccion;

    public Monitor(int experiencia, String dni, String nombrecompleto, int edad) {
        super(dni, nombrecompleto, edad);
        this.experiencia = experiencia;

    }

    public Monitor(int experiencia, Seccion seccion, String dni, String nombrecompleto, int edad) {
        super(dni, nombrecompleto, edad);
        this.experiencia = experiencia;
        this.seccion = seccion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public void notificarIncidencia() {
        Scanner lecturanombres = new Scanner(System.in);
        int id=1;
        if (this.seccion != null) {
            System.out.println("Inserte la descripción: ");
            String descripcion = lecturanombres.nextLine();
        this.seccion.aniadirIncidencia(new Incidencia(id, descripcion));
            System.out.println("Incidencia creada con éxito.");
        id++;
            
        }else
            System.out.println("No hay sección asignada a este monitor.");
        
    }

    @Override
    public void entrenar() {
        System.out.println("Realizando entrenamiento..");
        this.experiencia++;
    }

    @Override
    public String toString() {
        return "Monitor{" + super.toString() + "experiencia=" + experiencia + ", seccion=" + seccion + '}';
    }

}
