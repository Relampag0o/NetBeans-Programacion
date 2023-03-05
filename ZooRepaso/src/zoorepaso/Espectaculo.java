/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoorepaso;

import java.util.LinkedList;

/**
 *
 * @author josem
 */
public class Espectaculo {
    private int id;
    private LinkedList<Animal> animales;
    private LinkedList<Trabajador> trabajadores;
    private String hora;
    
    private int aforo;
    private Zona zona;

    public Espectaculo(int id,String hora, int aforo, Zona zona) {
        this.id=id;
        this.animales = new LinkedList<Animal>();
        this.trabajadores= new LinkedList<Trabajador>();
        this.hora = hora;
        
        this.aforo = aforo;
        this.zona = zona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void aniadirAnimal(Animal animal) {
        animales.add(animal);

    }
    public void aniadirTrabajador(){
        for (int i=0; i<animales.size(); i++){
            trabajadores.add(animales.get(i).getResponsable());
        }
        
        
    }
    public void mostrarAnimales(){
       for (int i=0; i<trabajadores.size(); i++){
           System.out.println("Animal número: " + i + " " + animales.get(i));
       }
           
    }
    public void mostrarTrabajadores(){
       for (int i=0; i<trabajadores.size(); i++){
           System.out.println("Trabajador número: " + i + " " + trabajadores.get(i));
       }
           
    }

    public void borrarAnimal(Animal animal) {
        animales.remove(animal);

    }

    

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

   

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {

        
        return "Espectáculo [Animales del que trata: " + this.animales + "; hora:" + this.hora + "; trabajadores asignados:" + this.trabajadores + "; aforo:" + this.aforo + "; zona:" + this.zona + "  ]";

    }

}
