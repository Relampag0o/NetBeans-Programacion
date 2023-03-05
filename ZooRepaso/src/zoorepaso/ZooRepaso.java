/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoorepaso;

import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author josem
 */
public class ZooRepaso {

    public static Aviso buscarAvisos(LinkedList<Aviso> avisos, int idAviso) {
        Aviso elegido = null;
        for (int i = 0; i < avisos.size(); i++) {
            if (avisos.get(i).getId() == idAviso) {
                elegido = avisos.get(i);
            }
        }
        return elegido;
    }
    public static Espectaculo buscarEspectaculos(LinkedList<Espectaculo> espectaculos, int idEspectaculo) {
        Espectaculo elegido = null;
        for (int i = 0; i < espectaculos.size(); i++) {
            if (espectaculos.get(i).getId() == idEspectaculo) {
                elegido = espectaculos.get(i);
            }
        }
        return elegido;
    }
/*
    public static Espectaculo buscarEspectaculos(LinkedList<Espectaculo> espectaculos) {
        Scanner lecturanumeros = new Scanner(System.in);
        int opcion = -1;
        Espectaculo elegido = null;
        for (int i = 0; i < espectaculos.size(); i++) {
            System.out.println("Espectáculo número" + i + " " + espectaculos.get(i));
        }
        System.out.println("Seleccione el número de espectáculo:");
        opcion = lecturanumeros.nextInt();
        elegido = espectaculos.get(opcion);
        return elegido;
    }
*/
    public static Zona buscarZonas(LinkedList<Zona> zonas, int idZona) {
        Zona elegido = null;
        for (int i = 0; i < zonas.size(); i++) {
            if (zonas.get(i).getId() == idZona) {
                elegido = zonas.get(i);
            }
        }
        return elegido;
    }

    public static Animal buscarAnimales(LinkedList<Animal> animales, int idAnimal) {
        Animal elegido = null;
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getId() == idAnimal) {
                elegido = animales.get(i);
            }
        }
        return elegido;
    }

    public static Trabajador buscarTrabajadores(LinkedList<Trabajador> trabajadores, String dni) {
        Trabajador elegido = null;
        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).getDni().equals(dni)) {
                elegido = trabajadores.get(i);
            }
        }
        return elegido;
    }
    
    

    public static Animal seleccionarAnimales(LinkedList<Animal> animales) {
        Scanner lecturanumeros = new Scanner(System.in);

        for (int i = 0; i < animales.size(); i++) {
            System.out.println("Animal número:" + i + " " + animales.get(i));
        }
        System.out.println("Seleccione el animal:");
        return animales.get(lecturanumeros.nextInt());

    }

    public static void mostrarTrabajadores(LinkedList<Trabajador> trabajadores) {
        for (Trabajador trabajadore : trabajadores) {
            System.out.println(trabajadore);
        }
    }

    public static void mostrarAnimales(LinkedList<Animal> animales) {
        for (Animal animale : animales) {
            System.out.println(animale);
        }
    }

    public static void mostrarZonas(LinkedList<Zona> zonas) {
        for (Zona zona : zonas) {
            System.out.println(zona);
        }
    }

    public static void mostrarAvisos(LinkedList<Aviso> avisos) {
        for (Aviso avis : avisos) {
            System.out.println(avis);
        }
    }

    public static void mostrarEspectaculos(LinkedList<Espectaculo> espectaculos) {
        for (Espectaculo espect : espectaculos) {
            System.out.println(espect);
        }
    }

    public static void main(String[] args) {
        Scanner lecturanumeros = new Scanner(System.in);
        Scanner lecturanombres = new Scanner(System.in);

        // IDS AUTOMATICOS:
        int idAnimal = 1;
        int idAviso = 1;
        int idZona = 40;
        int idEspectaculo=1;
        // Listas
        LinkedList<Trabajador> trabajadores = new LinkedList();
        LinkedList<Zona> zonas = new LinkedList();
        LinkedList<Espectaculo> espectaculos = new LinkedList();
        LinkedList<Animal> animales = new LinkedList();
        LinkedList<Aviso> avisos = new LinkedList();

        //CREACIÓN DE OBJETOS PARA AGILIZAR LA CORRECCIÓN DE ERRORES.
        //trabajadores
        Trabajador pepe = new Trabajador("12Q", "pepe", Rango.ENCARGADO);
        Trabajador juan = new Trabajador("12W", "juan", Rango.JEFE_DE_EQUIPO);
        Trabajador alberto = new Trabajador("12E", "alberto", Rango.EMPLEADO_COMUN);
        trabajadores.add(pepe);
        trabajadores.add(juan);
        trabajadores.add(alberto);
        //zonas
        Zona bosque = new Zona(10, "bosque");
        Zona tundra = new Zona(20, "tundra");
        Zona desierto = new Zona(30, "desierto");
        zonas.add(bosque);
        zonas.add(tundra);
        zonas.add(desierto);
        //animales
        Animal leon = new Animal(5, "Leon", Especie.TERRESTRE);
        Animal ballena = new Animal(6, "Ballena", Especie.ACUATICO);
        Animal elefante = new Animal(7, "Elefante", Especie.TERRESTRE);
        animales.add(leon);
        animales.add(ballena);
        animales.add(elefante);

        leon.setResponsable(pepe);
        ballena.setResponsable(juan);
        elefante.setResponsable(alberto);

        // MENÚ 
        System.out.println("MENÚ ZOO");
        int op;
        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("-----------------------");
            System.out.println("1. Registrar trabajador");
            System.out.println("2. Registrar animal");
            System.out.println("3. Incidencia animal");
            System.out.println("4. Registrar espectaculo");
            System.out.println("5. Listar espectaculos, trabajadores, animales y avisos");

            System.out.println("0. Salir");

            System.out.print("seleccione una opción(1-8):");
            op = lecturanumeros.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Inserte el DNI del trabajador:");
                    String dni = lecturanombres.nextLine();
                    System.out.println("Inserte el nombre del trabajador:");
                    String nombre = lecturanombres.nextLine();

                    System.out.println("Seleccione una de las siguientes opciones para el rango");

                    System.out.println("Pulse 1 para elegir ENCARGADO");
                    System.out.println("Pulse 2 para elegir JEFE DE EQUIPO");
                    System.out.println("Pulse 3 para elegir EMPLEADO COMUN");

                    int eleccion = lecturanumeros.nextInt();
                    Rango ran = null;
                    switch (eleccion) {
                        case 1:
                            ran = Rango.ENCARGADO;
                            break;
                        case 2:
                            ran = Rango.JEFE_DE_EQUIPO;
                            break;
                        case 3:
                            ran = Rango.EMPLEADO_COMUN;
                            break;
                    }

                    trabajadores.add(new Trabajador(dni, nombre, ran));
                    System.out.println("Trabajador creado con éxito.");
                    break;
                case 2:
                    System.out.println("Inserte el nombre del animal:");
                    String nombreanimal = lecturanombres.nextLine();
                    System.out.println("Seleccione una de las siguientes opciones para la especie");

                    System.out.println("Pulse 1 para elegir VOLADOR");
                    System.out.println("Pulse 2 para elegir TERRESTRE");
                    System.out.println("Pulse 3 para elegir ACUATICO");

                    eleccion = lecturanumeros.nextInt();
                    Especie espe = null;
                    switch (eleccion) {
                        case 1:
                            espe = Especie.VOLADOR;
                            break;
                        case 2:
                            espe = Especie.TERRESTRE;
                            break;
                        case 3:
                            espe = Especie.ACUATICO;
                            break;
                    }
                    animales.add(new Animal(idAnimal, nombreanimal, espe));
                    System.out.println("Animal creado con éxito.");
                   

                    System.out.println("¿Quiere asignarle un encargado?(SI/NO)");
                    String ele = lecturanombres.nextLine();
                    if (ele.equalsIgnoreCase("SI")) {
                        System.out.println("Inserte el DNI del encargado para asignarlo:");
                        dni = lecturanombres.nextLine();
                        Trabajador trabelegido = buscarTrabajadores(trabajadores, dni);
                        Animal anielegido = buscarAnimales(animales, idAnimal);
                        anielegido.setResponsable(pepe);
                        System.out.println("Operación realizada con éxito. Ahora el trabajador " + trabelegido.getNombre() + " está a cargo del animal: " + anielegido.getNombre());
                        idAnimal++;
                       } else
                       idAnimal++;
                    
                    break;
                case 3:
                    /*
        private int id;
    private String fecha;
    private String descripcion;
    private Animal animaldelqueseinforma;
        
                     */
                    System.out.println("Introduzca la fecha:");
                    String fecha = lecturanombres.nextLine();
                    System.out.println("Introduzca el mensaje:");
                    String descripcion = lecturanombres.nextLine();
                    Animal elegido = seleccionarAnimales(animales);
                    if (elegido != null) {
                        avisos.add(new Aviso(idAviso, fecha, descripcion, elegido));
                        Aviso buscado = buscarAvisos(avisos, idAviso);
                        elegido.getResponsable().aniadirAviso(buscado);
                    } else {
                        System.out.println("El animal elegido no es válido.");
                    }
                    idAviso++;
                    break;
                case 4:

                    System.out.println("Seleccione la hora del espectáculo:");
                    String hora = lecturanombres.nextLine();
                    System.out.println("Seleccione el aforo del espectáculo:");
                    int aforo = lecturanumeros.nextInt();
                    System.out.println("Seleccione el id de la zona donde tendrá lugar el espectáculo:");
                    idZona = lecturanumeros.nextInt();
                    espectaculos.add(new Espectaculo(idEspectaculo,hora, aforo, buscarZonas(zonas, idZona)));
                    String elecc = "SI";
                    Espectaculo eleg = buscarEspectaculos(espectaculos,idEspectaculo);

                    System.out.println("A continuación se procederá a añadir animales al espectáculo:");
                    do {
                        eleg.aniadirAnimal(seleccionarAnimales(animales));
                        eleg.aniadirTrabajador();
                        System.out.println("¿Quiere seguir añadiendo animales al espectaculo?(SI/NO)");
                        elecc = lecturanombres.nextLine();
                    } while (elecc.equalsIgnoreCase("SI"));
                    idEspectaculo++;
                    break;

                case 5:

                    System.out.println("A continuación se mostrarán los trabajadores disponibles:");
                    mostrarTrabajadores(trabajadores);
                    System.out.println("");
                    System.out.println("A continuación se mostrarán los animales:");
                    mostrarAnimales(animales);
                    System.out.println("");
                    System.out.println("A continuación se mostrarán las zonas:");
                    mostrarZonas(zonas);
                    System.out.println("");
                    System.out.println("A continuación se mostrarán los espectáculos:");
                    mostrarEspectaculos(espectaculos);
                    System.out.println("");
                    System.out.println("A continuación se mostrarán los avisos creados:");
                    mostrarAvisos(avisos);
                    break;

                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;

                default:
                    System.out.println("POR FAVOR, SELECCIONA UNA OPCIÓN VÁLIDA");
                    break;
            }
            System.out.println("");

        } while (op != 0);
    }

}
