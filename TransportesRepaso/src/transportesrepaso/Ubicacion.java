/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportesrepaso;

/**
 *
 * @author josem
 */
public class Ubicacion {
    
    private String localidad;
    private String direccion;

    public Ubicacion(String localidad, String direccion) {
        this.localidad = localidad;
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Ubicacion [localidad:" + localidad + "; direccion:" + direccion + "]";
    }
    
    
    
}
