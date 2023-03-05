/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquesbomberos;

import java.util.LinkedList;

/**
 *
 * @author Carlos CG
 */
public class Parque {
    
    private int id;
    private String ubicacion;
    private LinkedList<Bombero> bomberos;
    private LinkedList<String> avisos;
    
    public Parque(int id, String ubicacion){
        this.id = id;
        this.ubicacion = ubicacion;
        bomberos = new LinkedList<Bombero>();
        avisos = new LinkedList<String>();
    }
    
    public Parque(int id, String ubicacion, Bombero b){
        this.id = id;
        this.ubicacion = ubicacion;
        bomberos = new LinkedList<Bombero>();
        bomberos.add(b);
        avisos = new LinkedList<String>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void aniadirBombero(Bombero b){
        if(!this.bomberos.contains(b))
            this.bomberos.add(b);
    }
    
    public void borrarBombero(Bombero b){
        if(this.bomberos.contains(b))
            this.bomberos.remove(b);
    }
    
    public void aniadirAviso(String aviso){
        if(!this.avisos.contains(aviso))
            this.avisos.addLast(aviso);
    }
    
    public void borrarAviso(){
        if(!this.avisos.isEmpty())
            this.avisos.removeFirst();
    }
    
    public void mostrarAvisos(){
        if(this.avisos.isEmpty())
            System.out.println("No hay avisos");
        else
            for (int i = 0; i < avisos.size(); i++) 
                System.out.println(i + " - " + avisos.get(i));
    }
    
    public void mostrarBomberos(){
        if(this.bomberos.isEmpty())
            System.out.println("No hay bomberos asignados");
        else
            for (int i = 0; i < bomberos.size(); i++) 
                System.out.println(i + " - " + bomberos.get(i).getRango()
                        + "," + bomberos.get(i).getNombreCompleto());
    }

    @Override
    public String toString() {
        String result = "Parque[id: " + this.id + "; ubicación: " + 
                this.ubicacion + "; bomberos: " + this.bomberos + 
                "; avisos: ";
        if(this.avisos.isEmpty())
            result += "no hay avisos pendientes]";
        else
            result += this.avisos + "]";
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Parque) obj).id;
    }
    
    
    
    
    
    

}
