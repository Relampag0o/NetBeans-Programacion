/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoorepaso;

/**
 *
 * @author josem
 */
public class Animal {

    private int id;
    private String nombre;
    private Especie especie;
    private Trabajador responsable;

    public Animal(int id, String nombre, Especie especie) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
    }

    public Animal(int id, String nombre, Especie especie, Trabajador responsable) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.responsable = responsable;
    }

    public Trabajador getResponsable() {
        return responsable;
    }

    public void setResponsable(Trabajador responsable) {
        this.responsable = responsable;
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

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {

        if (this.responsable != null) 
            return "Animal [id: " + this.id + "; nombre:" + this.nombre + "; especie: " + this.especie + "; nombre del reponsable:" + responsable.getNombre() + "]";
         else 
             return "Animal [id: " + this.id + "; nombre:" + this.nombre + "; especie: " + this.especie + "; nombre del responsable: sin responsable asignado." +"]";
        
        
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == (((Animal) obj).getId());
    }

}
