/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

/**
 *
 * @author josem
 */
public class Electrodomestico {
    private String numeroserie;
    private int precio;
    private String descripcion;
    private String color;
    private Consumo consumo;
    private int peso;
    private Tienda tienda;

    public Electrodomestico(String numeroserie, int precio, String descripcion, String color, Consumo consumo, int peso, Tienda tienda) {
        this.numeroserie = numeroserie;
        this.precio = precio;
        this.descripcion = descripcion;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.tienda = tienda;
    }

    public String getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
    public void borrarTienda(){
        this.tienda=null;
    }
   
    @Override
    public String toString() {
        if (this.tienda==null)
            return "Electrodoméstico [ numero de serie: " + this.numeroserie + "; " + " precio: " + this.precio + " ; " + " descripción: " + this.descripcion + " ; " + " color: " + this.color + " ;" + "clase de consumo:" + this.consumo + " ;" + " peso: " + this.peso + " ; " + "tienda en la que se puede comprar: " + "sin disponibilidad aparente" +  " ]";
        else
        return "Electrodoméstico [ numero de serie: " + this.numeroserie + "; " + " precio: " + this.precio + " ; " + " descripción: " + this.descripcion + " ; " + " color: " + this.color + " ;" + "clase de consumo:" + this.consumo + " ;" + " peso: " + this.peso + " ; " + "tienda en la que se puede comprar: " + this.tienda +  " ]";
        

    }

    @Override
    public boolean equals(Object obj) {
        return this.numeroserie.equals(((Electrodomestico) obj).getNumeroserie());
    }
    
    
    
    
    
}
