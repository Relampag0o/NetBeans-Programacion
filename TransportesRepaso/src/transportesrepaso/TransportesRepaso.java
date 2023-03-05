/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportesrepaso;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class TransportesRepaso {

    public static Oficina buscarOficina(LinkedList<Oficina> oficinas, int id) {
        Oficina elegida = null;
        for (int i = 0; i < oficinas.size(); i++) {
            if (oficinas.get(i).getId() == id) {
                elegida = oficinas.get(i);
            }
        }
        return elegida;
    }

    public static void mostrarOficinas(LinkedList<Oficina> oficinas) {
        for (Oficina oficina : oficinas) {
            System.out.println(oficina);
        }

    }

    public static void main(String[] args) {
        Scanner lecturanumeros = new Scanner(System.in);
        Scanner lecturanombres = new Scanner(System.in);
        int opcion = 0;
        // CREACIÓN DE LISTAS
        LinkedList<Oficina> oficinas = new LinkedList();

        // Crear 3 oficinas con 2 trabajadores cada una.
        // Añado ademas algunos paquetes ya creados para agilizar las pruebas al ir acabando el ejercicio.
        Oficina oficina1 = new Oficina(1, new Ubicacion("Madrid", "Calle Mayor 1"));
        oficina1.aniadirTrabajador(new Trabajador("11111111A", "Juan"));
        oficina1.aniadirTrabajador(new Trabajador("22222222B", "Pedro"));
        oficinas.add(oficina1);
        oficina1.aniadirPaquete(new Paquete(1,new Remitente("12Q", "Jose", new Ubicacion("Montijo", "Calle Salmerón"), "666321456"),new Destinatario("12W", "Alfonso", new Ubicacion("Merida", "Uganda"), "654789123")));
         oficina1.aniadirPaquete(new Paquete(2,new Remitente("12E", "Pepe", new Ubicacion("Madrid", "Calle Gerona"), "666321456"),new Destinatario("12R", "Jonathan", new Ubicacion("Barcelona", "Uganda"), "654789123")));       

        Oficina oficina2 = new Oficina(2, new Ubicacion("Barcelona", "Rambla 1"));
        oficina2.aniadirTrabajador(new Trabajador("33333333C", "Luis"));
        oficina2.aniadirTrabajador(new Trabajador("44444444D", "Alberto"));
        oficinas.add(oficina2);

        Oficina oficina3 = new Oficina(3, new Ubicacion("Sevilla", "Avenida 1"));
        oficina3.aniadirTrabajador(new Trabajador("55555555E", "Javier"));
        oficina3.aniadirTrabajador(new Trabajador("66666666F", "Ana"));
        oficinas.add(oficina3);

        // VARIABLES PARA EL EJERCICIO
        //paquetes
        int idPaquete = 1;

        // MENÚ
        do {
            System.out.println("Bienvenido al menú de opciones");
            System.out.println("Pulse 1 para registrar un nuevo paquete");
            System.out.println("Pulse 2 para enviar un paquete");
            System.out.println("Pulse 3 para entregar un paquete");
            //ENTIENDO QUE LA OPCIÓN 3 LO QUE HACE ES BORRAR EL PAQUETE DE LA OFICINA
            // Y LO ENTREGA.
            System.out.println("Pulse 4 para listar info OFICINA");
            System.out.println("---EXTRA---");
            System.out.println("Pulse 5 para añadir trabajadores a una oficina");

            System.out.println("Pulse 0 para salir");
            opcion = lecturanumeros.nextInt();
            switch (opcion) {

                case 1:
                    //DATOS PARA EL REMITENTE
                    System.out.println("Inserte el dni del remitente:");
                    String dniremitente = lecturanombres.nextLine();
                    System.out.println("Inserte el nombre del remitente:");
                    String nombreremitente = lecturanombres.nextLine();
                    System.out.println("Inserte la localidad del remitente:");
                    String localidadremitente = lecturanombres.nextLine();
                    System.out.println("Inserte le dirección del remitente:");
                    String direccionremitente = lecturanombres.nextLine();
                    System.out.println("Inserte el teléfono del remitente:");
                    String telefonoremitente = lecturanombres.nextLine();
                    //DATOS PARA EL DESTINATARIO
                    System.out.println("Inserte el dni del destinatario:");
                    String dnidestinatario = lecturanombres.nextLine();
                    System.out.println("Inserte el nombre del destinatario:");
                    String nombredestinatario = lecturanombres.nextLine();
                    System.out.println("Inserte la localidad del destinatario:");
                    String localidaddestinatario = lecturanombres.nextLine();
                    System.out.println("Inserte le dirección del destinatario:");
                    String direcciondestinatario = lecturanombres.nextLine();
                    System.out.println("Inserte el teléfono del destinatario:");
                    String telefonodestinatario = lecturanombres.nextLine();

                    System.out.println("Finalmente, inserte el id de la oficina:");
                    int idOficina = lecturanumeros.nextInt();
                    Oficina ofielegida = buscarOficina(oficinas, idOficina);
                    if (ofielegida != null) {
                        ofielegida.aniadirPaquete(new Paquete(idPaquete, new Remitente(dniremitente, nombreremitente, new Ubicacion(localidadremitente, direccionremitente), telefonoremitente),
                                new Destinatario(dnidestinatario, nombredestinatario, new Ubicacion(localidaddestinatario, direcciondestinatario), telefonodestinatario)));
                        idPaquete++;
                        System.out.println("El paquete ha sido creado con éxito. ");
                    } else {
                        System.out.println("Lo sentimos. No es posible crear un paquete ahora mismo.");
                    }

                    break;
                case 2:
                    System.out.println("Inserte el id de la oficina actual:");
                    idOficina = lecturanumeros.nextInt();
                    System.out.println("Inserte el id de la oficina a la que se dirige el paquete:");
                    int idOficinadestinatario = lecturanumeros.nextInt();
                    Oficina remi = buscarOficina(oficinas, idOficina);
                    Oficina desti = buscarOficina(oficinas, idOficinadestinatario);
                    
                    if (remi != null && desti != null) {
                        Paquete paqelegido = remi.elegirPaquete();
                        if (paqelegido != null) {
                            desti.aniadirPaquete(paqelegido);
                            remi.borrarPaquete(paqelegido);
                            System.out.println("Operación realizada con éxito.");
                        } else {
                            System.out.println("El paquete no puede estar vacío.");
                        }

                    } else {
                        System.out.println("No se ha podido realizar la operación.");
                    }

                    break;
                case 3:
                    System.out.println("Inserte el id de la oficina en la que se encuentra:");
                    idOficina = lecturanumeros.nextInt();
                    Oficina elegi = buscarOficina(oficinas, idOficina);
                    if (elegi != null) {
                        Paquete elegido = elegi.elegirPaquete();
                        elegi.borrarPaquete(elegido);
                        if (elegido != null) {
                            System.out.println("¡Operación realizada con éxito. Se ha borrado el paquete!");
                        } else {
                            System.out.println("Parece que ha habido un error. Pruebe de nuevo.");
                        }

                    } else {
                        System.out.println("Parece que el id de oficina no es válido.");
                    }

                    break;
                case 4:
                    mostrarOficinas(oficinas);

                    break;

                case 5:
                    System.out.println("Inserte el id de la oficina a la que quiere añadir trabajadores:");
                    idOficina = lecturanumeros.nextInt();
                    elegi = buscarOficina(oficinas, idOficina);
                    if (elegi != null) {
                        System.out.println("Inserte el dni del trabajador:");
                        String dni = lecturanombres.nextLine();
                        System.out.println("Inserte el nombre del trabajador:");
                        String nombretrabajador = lecturanombres.nextLine();
                        elegi.aniadirTrabajador(new Trabajador(dni, nombretrabajador));
                        System.out.println("¡El trabajador ha sido añadido satisfactoriamente!");
                    } else {
                        System.out.println("El id que ha proporcionado no es correcto.");
                    }
                    break;
                case 0:
                    System.out.println("Usted está saliendo del programa..");
                    break;
                default:
                    System.out.println("Por favor, inserte una opción válida.");
                    break;
            }

        } while (opcion != 0);

    }
}
