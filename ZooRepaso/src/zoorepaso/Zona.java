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
public class Zona {
    private int id;
    private String nombre;
    private LinkedList <Trabajador> trabajadores;
    private LinkedList<Animal> animales;
    
    
    
    public Zona (int id, String nombre){
        this.id=id;
        this.nombre=nombre;
        this.trabajadores=new LinkedList<Trabajador>();
        this.animales=new LinkedList<Animal>();
        
    }
     public Zona (int id, String nombre, Trabajador trabajador, Animal animal){
        this.id=id;
        this.nombre=nombre;
        this.trabajadores=new LinkedList<Trabajador>();
        trabajadores.add(trabajador);
        this.animales=new LinkedList<Animal>();
        animales.add(animal);
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void aniadirTrabajador(Trabajador trabajador){
        this.trabajadores.add(trabajador);
    }
    public void borrarTrabajador(Trabajador trabajador){
        this.trabajadores.remove(trabajador);
    }
     public void mostrarTrabajadores(){
        for (Trabajador trabajadore : trabajadores) {
            System.out.println(trabajadore);
        }
        
        
    } 
     public void aniadirAnimal(Animal animal){
        this.animales.add(animal);
    }
   public void borrarAnimal(Animal animal){
        this.animales.remove(animal);
    }
     public void mostrarAnimales(){
        for (Animal animale : animales) {
            System.out.println(animale);
        }
        
        
    }
    
     @Override
    public String toString() {

        // no voy a valorar si las listas están vacías.
        return "Zona [id: " + this.id  + "; nombre:" + this.nombre  + "; trabajadores asignados:"  + this.trabajadores + "; animales de esta zona:" + this.animales + "]";
        
          
        
    
    
    
}
    
}
