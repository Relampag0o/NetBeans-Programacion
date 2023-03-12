/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gimnasiopoli;

import java.util.LinkedList;

/**
 *
 * @author josem
 */
public class GimnasioPoli {

    public static void main(String[] args) {
       
        LinkedList<Persona> personas= new LinkedList();
        Seccion maquinas= new Seccion("1", "maquinas");
        Seccion salafitness= new Seccion("2", "sala de fitness");
        Seccion futbol= new Seccion("3", "pistas de futbol");
        Seccion tenis= new Seccion("1", "pista de tenis");
        // monitores
        Monitor joselu= new Monitor(0, maquinas, "12P", "Jose Luis", 29);
        
       personas.add(new Monitor(0, tenis, "12Q", "José", 25));
       personas.add(new Monitor(5, maquinas, "12E", "Pepe", 30));
       personas.add(new Monitor(10, salafitness, "12W", "Carlos", 27));
       // afiliados
       personas.add(new Afiliado(1,5, "12R", "Alfonso", 40));
       personas.add(new Afiliado(2,10,"12G", "Roberto", 50));
       personas.add(new Afiliado(2,0,"12X", "Julian", 37));
       
       // probando que el añadir incidencias funciona correctamente.
       joselu.notificarIncidencia();
       maquinas.mostrarIncidencias();
       
       
       System.out.println("Mostrando sesiones de afiliados: ");
        for (Persona persona : personas) {
            if (persona instanceof Afiliado)
                System.out.println( ((Afiliado) persona).getSesionesdisponibles());
            
        }
        System.out.println("");
        System.out.println("Mostrando experiencia de monitores: ");
        for (Persona persona : personas) {
            if (persona instanceof Monitor)
                System.out.println(((Monitor) persona).getExperiencia());
            
        }
        System.out.println("");
        for (Persona persona: personas){
            persona.entrenar();
        }
        System.out.println("");
        
        // utilizando el método entrenar..
        System.out.println("Mostrando sesiones de afiliados despues del entreno: ");
        for (Persona persona : personas) {
            if (persona instanceof Afiliado)
                System.out.println( ((Afiliado) persona).getSesionesdisponibles());
            
        }
        System.out.println("");
        System.out.println("Mostrando experiencia de monitores despues del entreno: ");
        for (Persona persona : personas) {
            if (persona instanceof Monitor)
                System.out.println(((Monitor) persona).getExperiencia());
            
        }
    }
}
