/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportesrepaso;

/**
 *
 * @author josem
 */
public class Destinatario {
    private String dni;
    private String nombre;
    private Ubicacion ubicacion;
    private String telefono;

    public Destinatario(String dni,String nombre, Ubicacion ubicacion, String telefono) {
        this.dni=dni;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
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

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Destinatario [nombre:" + nombre + "; ubicacion:" + ubicacion + "; telefono:" + telefono + "]";
    }
}

