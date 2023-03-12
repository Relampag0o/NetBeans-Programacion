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
public class Afiliado extends Persona {

    private int numAfiliado;
    private int sesionesdisponibles;

    public Afiliado(int numAfiliado, int sesionesdisponibles, String dni, String nombrecompleto, int edad) {
        super(dni, nombrecompleto, edad);
        this.numAfiliado = numAfiliado;
        this.sesionesdisponibles = sesionesdisponibles;
    }

    public int getNumAfiliado() {
        return numAfiliado;
    }

    public void setNumAfiliado(int numAfiliado) {
        this.numAfiliado = numAfiliado;
    }

    public int getSesionesdisponibles() {
        return sesionesdisponibles;
    }

    public void setSesionesdisponibles(int sesionesdisponibles) {
        this.sesionesdisponibles = sesionesdisponibles;
    }

    @Override
    public String toString() {
        return "Afiliado{" + super.toString() + "numAfiliado=" + numAfiliado + ", sesiones disponibles=" + sesionesdisponibles + '}';
    }

    public void cargarBono(int sesiones) {
        if (sesiones == 10 || sesiones == 15 || sesiones == 25) {
            this.sesionesdisponibles = this.sesionesdisponibles + sesiones;
            switch (sesiones) {
                case 10:
                    System.out.println("Importe: " + " 20€.");
                    break;
                case 15:
                    System.out.println("Importe: " + " 25€.");
                    break;
                case 25:
                    System.out.println("Importe: " + " 30€.");
                    break;
            }
            System.out.println("Sesiones disponibles: " + this.sesionesdisponibles);
        } else {
            System.out.println("No es posible añadir esa cantidad.");
        }
    }
    // La idea de este método es buena pero pregunta cada vez que se instancia en el main...
    // no es muy óptimo.
/*
    @Override
    public void entrenar() {
        Scanner lecturanombres = new Scanner(System.in);
        Scanner lecturanumeros = new Scanner(System.in);

        String respuesta = "SI";
        int cantidad = 0;
        if (this.sesionesdisponibles > 0) {
            System.out.println("¡Que disfrute su entrenamiento!");
            this.sesionesdisponibles--;
        } else {
            System.out.println("Parece que no le quedan sesiones disponibles.¿Quiere añadir algunas?(SI/NO)");
            respuesta=lecturanombres.nextLine();
            if (respuesta.equalsIgnoreCase("SI")) {
            System.out.println("Inserte la cantidad para añadir al bono:");
            cargarBono(lecturanumeros.nextInt());
        }else
                System.out.println("No puede entrenar sin sesiones disponibles.");
        
            
        }
        
    }
     */

    @Override
    public void entrenar() {
        if (this.sesionesdisponibles > 0) {
            System.out.println("¡Que disfrute de su entrenamiento!");
            this.sesionesdisponibles--;
        } else {
            System.out.println("No le quedan sesiones disponibles. Por favor, asegúrese de añadirlas antes de entrenar.");
        }
    }
    
}
