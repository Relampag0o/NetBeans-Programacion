/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoorepaso;

/**
 *
 * @author josem
 */
public class Aviso {

    private int id;
    private String fecha;
    private String descripcion;
    private Animal animaldelqueseinforma;

    public Aviso(int id, String fecha, String descripcion, Animal animaldelqueseinforma) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.animaldelqueseinforma = animaldelqueseinforma;
    }

    public Animal getAnimaldelqueseinforma() {
        return animaldelqueseinforma;
    }

    public void setAnimaldelqueseinforma(Animal animaldelqueseinforma) {
        this.animaldelqueseinforma = animaldelqueseinforma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        /*
        private int id;
    private String fecha;
    private String descripcion;
    private Animal animaldelqueseinforma;
        
         */

        // no voy a valorar si las listas o algún otro dato está vacío.
        return "Aviso  [ Id: " + this.id   + "; fecha:" + this.fecha  + "; descripción:"  + this.descripcion + "; animal del que se informa:" + this.animaldelqueseinforma + "  ]";

    }

}
