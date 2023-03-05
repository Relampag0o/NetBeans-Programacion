/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

/**
 *
 * @author josem
 */
public class Venta {
    private String id;
   private String fecha;
   private Electrodomestico elecvendido;
   private Trabajador trabajadorquelovende;

    public Venta(String id,String fecha, Electrodomestico elecvendido, Trabajador trabajadorquelovende) {
        this.id=id;
        this.fecha = fecha;
        this.elecvendido = elecvendido;
        this.trabajadorquelovende = trabajadorquelovende;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Electrodomestico getElecvendido() {
        return elecvendido;
    }

    public void setElecvendido(Electrodomestico elecvendido) {
        this.elecvendido = elecvendido;
    }

    public Trabajador getTrabajadorquelovende() {
        return trabajadorquelovende;
    }

    public void setTrabajadorquelovende(Trabajador trabajadorquelovende) {
        this.trabajadorquelovende = trabajadorquelovende;
    }
    @Override
    public String toString() {
        return "Venta [ id: " + this.id + " ; " + " fecha: " + this.fecha + " ; " + " electrodomestico vendido:" + this.elecvendido + " ; " + " trabajador que lo vendió: " + this.trabajadorquelovende + " ]";
        
    
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Venta)obj).getId());
    }
   
   
   }
   
   

