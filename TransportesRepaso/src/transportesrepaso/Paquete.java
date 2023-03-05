/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportesrepaso;

/**
 *
 * @author josem
 */
public class Paquete {
    
    private int id;
    private Remitente remitente;
    private Destinatario destinatario;

    public Paquete(int id, Remitente remitente, Destinatario destinatario) {
        this.id = id;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    

    

    @Override
    public String toString() {
        return "Paquete [id:" + id + "; destinatario:" + destinatario + "; remitente:" + remitente + "]";
    }
}

