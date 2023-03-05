/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

/**
 *
 * @author josem
 */
public class Trabajador {
   private String dni;
   private String nombre;
   private int telefono;
   private String email;

    public Trabajador(String dni, String nombre, int telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Empleado [ dni: " + this.dni + "; " + " nombre: " + this.nombre + " ; " + " telefono:" + this.telefono + " ; " + " email: " + this.email + " ]";
        
    
    }

    @Override
    public boolean equals(Object obj) {
        return this.dni.equals(((Trabajador)obj).getDni());
    }
   
   
   }
    
    

