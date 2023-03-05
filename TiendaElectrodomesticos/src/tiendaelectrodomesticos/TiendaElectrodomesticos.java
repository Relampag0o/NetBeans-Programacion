/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaelectrodomesticos;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class TiendaElectrodomesticos {

    public static Tienda buscarTienda(LinkedList<Tienda> tiendas, String id) {
        Tienda elegido = null;

        for (int i = 0; i < tiendas.size(); i++) {
            if (tiendas.get(i).getId().equals(id)) {
                elegido = tiendas.get(i);
            }
        }

        return elegido;
    }

    public static Trabajador buscarTrabajador(LinkedList<Trabajador> trabajadores, String dni) {
        Trabajador elegido = null;

        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).getDni().equals(dni)) {
                elegido = trabajadores.get(i);
            }
        }

        return elegido;
    }

    public static Electrodomestico buscarElectrodomestico(LinkedList<Electrodomestico> electrodomesticos, String numeroserie) {
        Electrodomestico elegido = null;

        for (int i = 0; i < electrodomesticos.size(); i++) {
            if (electrodomesticos.get(i).getNumeroserie().equals(numeroserie)) {
                elegido = electrodomesticos.get(i);
            }
        }

        return elegido;

    }

    public static Tienda elegirTiendas(LinkedList<Tienda> tiendas) {
        Scanner lecturanumeros = new Scanner(System.in);
        int opcion;
        Tienda elegida = null;

        for (int i = 0; i < tiendas.size(); i++) {
            System.out.println("Número de la tienda: " + i + " ." + tiendas.get(i));
        }

        do {
            System.out.println("Seleccione el número de tienda para seleccionarla:");
            opcion = lecturanumeros.nextInt();

            if (opcion < 0 || opcion > tiendas.size()) {
                System.out.println("Por favor, introduzca un rango válido");
            }
        } while (opcion < 0 || opcion > tiendas.size());
        elegida = tiendas.get(opcion);

        return elegida;

    }

    public static void mostrarTiendas(LinkedList<Tienda> tiendas) {
        if (!tiendas.isEmpty()) {
            for (Tienda tienda : tiendas) {
                System.out.println(tienda);

            }
        } else {
            System.out.println("Lo sentimos. No hay tiendas disponibles");
        }

    }

    public static void mostrarElectrodomesticos(LinkedList<Electrodomestico> electrodomesticos) {
        if (!electrodomesticos.isEmpty()) {
            for (Electrodomestico electro : electrodomesticos) {
                System.out.println(electro);

            }
        } else {
            System.out.println("Lo sentimos. No hay electrodomesticos disponibles");
        }

    }

    public static void mostrarVentas(LinkedList<Venta> ventas) {
        if (!ventas.isEmpty()) {
            for (Venta ven : ventas) {
                System.out.println(ven);

            }
        } else {
            System.out.println("Lo sentimos. No hay ventas disponibles");
        }

    }
     public static void mostrarTrabajadores(LinkedList<Trabajador> trabajadores) {
        if (!trabajadores.isEmpty()) {
            for (Trabajador trab : trabajadores) {
                System.out.println(trab);

            }
        } else {
            System.out.println("Lo sentimos. No hay ventas disponibles");
        }

    }

    public static LinkedList comprobarDisponibilidadProducto(LinkedList<Tienda> tiendas, LinkedList<Electrodomestico> electrodomesticos, String numeroserie) {
        LinkedList<Tienda> tiendasconproducto = new LinkedList();

        for (int i = 0; i < tiendas.size(); i++) {
            // esta comprobación se hace para evitar que al borrar un producto de una tienda y la quede a null, 
            // el programa no crashee al comparar null con la tienda.
            if (buscarElectrodomestico(electrodomesticos, numeroserie).getTienda()!=null && tiendas.get(i).equals(buscarElectrodomestico(electrodomesticos, numeroserie).getTienda())) {
                tiendasconproducto.add(tiendas.get(i));
            }

        }

        return tiendasconproducto;
    }

    public static void main(String[] args) {
        Scanner lecturanumeros = new Scanner(System.in);
        Scanner lecturanombres = new Scanner(System.in);

        int opcion = 0;

        // VARIABLES PARA EL EJERCICIO
        // trabajadores
        String dni = "";
        String nombre = "";
        int telefono;
        String email = "";

        // tiendas
        String id = "";
        String ubicacion = "";

        // electrodomesticos
        String numeroserie = "";
        int precio;
        String descripcion;
        String color;
        Consumo consumo;
        int peso;

        // ventas
        String fecha = "";

        // Creación de listas
        LinkedList<Tienda> tiendas = new LinkedList();
        LinkedList<Electrodomestico> electrodomesticos = new LinkedList();
        LinkedList<Venta> ventas = new LinkedList();
        
        
        tiendas.add(new Tienda("1", "Montijo"));
        tiendas.add(new Tienda("2", "Merida"));
        tiendas.add(new Tienda("3", "Badajoz"));
        Tienda ti1 =buscarTienda(tiendas, "1");
        Tienda ti2 =buscarTienda(tiendas, "2");
        Tienda ti3 =buscarTienda(tiendas, "3");
        ti1.setResponsable(new Trabajador("12345678Q", "ADMIN", 1234, "ASDFSDAF"));
        ti1.aniadirTrabajadores(new Trabajador("12Q", "pepe", 1234, "asdfasdf"));
        ti1.aniadirTrabajadores(new Trabajador("12R", "ruperto", 1234, "asdfasdf"));
        
        
        ti2.setResponsable(new Trabajador("12345678W", "ADMIN", 1234, "ASDFSDAF"));
        ti2.aniadirTrabajadores(new Trabajador("12W", "jose", 1234, "asdfasdf"));
        ti2.aniadirTrabajadores(new Trabajador("12P", "lozano", 1234, "asdfasdf"));
        
        ti3.setResponsable(new Trabajador("12345678E", "ADMIN", 1234, "ASDFSDAF"));
        ti3.aniadirTrabajadores(new Trabajador("12E", "alfonso", 1234, "asdfasdf"));
        ti3.aniadirTrabajadores(new Trabajador("12M", "PERUANO", 1234, "asdfasdf"));
        
        
        
        electrodomesticos.add(new Electrodomestico("1", 200, "xdasdf", "rojo", Consumo.A, 200, buscarTienda(tiendas, "1")));
        electrodomesticos.add(new Electrodomestico("2", 500, "xd32", "azul", Consumo.B, 200, buscarTienda(tiendas, "2")));
        electrodomesticos.add(new Electrodomestico("3", 900, "xdsadf", "rojo", Consumo.A, 200, buscarTienda(tiendas, "3")));

        
        // MENÚ
        do {
            System.out.println("Bienvenido al menú de opciones");
            System.out.println("Pulse 1 para registrar una tienda");
            System.out.println("Pulse 2 para registrar un trabajador");
            System.out.println("Pulse 3 para registrar un nuevo electrodomestico");
            System.out.println("Pulse 4 para registrar una nueva venta");
            System.out.println("Pulse 5 para listar tiendas,electrodomesticos,ventas y trabajadores");
            
            System.out.println("");
            
            System.out.println("---Opciones extra---");
            System.out.println("Pulse 6 para comprobar el stock de un determinado producto");
            System.out.println("Pulse 7 para mostrar los trabajadores de una tienda concreta");
            System.out.println("Pulse 0 para salir");
            opcion = lecturanumeros.nextInt();
            switch (opcion) {

                case 1:

                    System.out.println("Inserte el id de la tienda");
                    id = lecturanombres.nextLine();
                    System.out.println("Inserte la ubicación");
                    ubicacion = lecturanombres.nextLine();
                    Tienda t = new Tienda(id, ubicacion);
                    tiendas.add(t);
                    System.out.println("Tienda añadida con éxito");
                    break;
                case 2:
                    System.out.println("Inserte el dni del trabajador");
                    dni = lecturanombres.nextLine();
                    System.out.println("Inserte el nombre del trabajador");
                    nombre = lecturanombres.nextLine();
                    System.out.println("Inserte el número de teléfono ");
                    telefono = lecturanumeros.nextInt();
                    System.out.println("Inserte el email ");
                    email = lecturanombres.nextLine();
                    Trabajador tr = new Trabajador(dni, nombre, telefono, email);
                                       
                    Tienda tielegida = elegirTiendas(tiendas);
                    
                    if (tielegida.getResponsable() == null) {
                        tielegida.setResponsable(tr);
                        tielegida.aniadirTrabajadores(tr);
                    } else {
                        tielegida.aniadirTrabajadores(tr);
                    }
                    System.out.println("Trabajador creado con éxito");
                    break;
                case 3:
                    System.out.println("Inserte el número de serie del electrodoméstico");
                    numeroserie = lecturanombres.nextLine();
                    System.out.println("Inserte el precio ");
                    precio = lecturanumeros.nextInt();
                    System.out.println("Inserte la descripción");
                    descripcion = lecturanombres.nextLine();
                    System.out.println("Inserte el color");
                    color = lecturanombres.nextLine();
                    System.out.println("Inserte el tipo de consumo");

                    System.out.println("Pulse 1 para elegir el consumo A");
                    System.out.println("Pulse 2 para elegir el consumo B");
                    System.out.println("Pulse 3 para elegir el consumo C");
                    System.out.println("Pulse 4 para elegir el consumo D");
                    System.out.println("Pulse 5 para elegir el consumo E");
                    System.out.println("Pulse 6 para elegir el consumo F");
                    int consu = lecturanumeros.nextInt();
                    Consumo con = null;

                    switch (consu) {
                        case 1:
                            con = Consumo.A;
                            break;
                        case 2:
                            con = Consumo.B;
                            break;
                        case 3:
                            con = Consumo.C;
                            break;
                        case 4:
                            con = Consumo.D;
                            break;
                        case 5:
                            con = Consumo.E;
                            break;
                        case 6:
                            con = Consumo.F;
                            break;
                    }
                    System.out.println("Inserte el peso del producto");
                    peso = lecturanumeros.nextInt();
                    System.out.println("Inserte la tienda en la que se encuentra");
                    Tienda tielegida2 = elegirTiendas(tiendas);
                    electrodomesticos.add(new Electrodomestico(numeroserie, precio, descripcion, color, con, peso, tielegida2));
                    System.out.println("Electrodoméstico añadido con éxito.");
                    break;
                case 4:
                    
                    System.out.println("Inserte la fecha de la venta");
                    fecha = lecturanombres.nextLine();
                    System.out.println("Inserte el número de serie del electrodomestico que se va a vender");
                    String noserie = lecturanombres.nextLine();
                    Electrodomestico elegido=buscarElectrodomestico(electrodomesticos, noserie);
                    ventas.add(new Venta(id, fecha, elegido, elegido.getTienda().elegirTrabajador()));
                    elegido.setTienda(null);
                 
                    
                    break;
                case 5:
                    System.out.println("A continuación se mostrarán las tiendas disponibles: ");
                    mostrarTiendas(tiendas);
                    System.out.println("");
                    System.out.println("A continuación se mostrarán los electrodomesticos disponibles");
                    mostrarElectrodomesticos(electrodomesticos);
                    System.out.println("");
                    System.out.println("A continuación se mostrarán las ventas realizadas");
                    mostrarVentas(ventas);
                    System.out.println("");
                   
                    break;
                case 6:
                    System.out.println("Inserte el número de serie del producto del que quiere comprobar el stock");
                    numeroserie = lecturanombres.nextLine();
                    if (comprobarDisponibilidadProducto(tiendas, electrodomesticos, numeroserie).isEmpty()) {
                        System.out.println("Lo sentimos. Parece ser que el producto no se encuentra disponible en ninguna tienda.");
                    } else {
                        System.out.println("El producto se encuentra en las siguientes tiendas:");
                        System.out.println(comprobarDisponibilidadProducto(tiendas, electrodomesticos, numeroserie));
                    }
                    break;
                case 7:
                    System.out.println("Inserte el id de la tienda de la que quiere mostrar los trabajadores");
                    id=lecturanombres.nextLine();
                    
                    Tienda elegida=buscarTienda(tiendas, id);
                    System.out.println("Persona responsable:");
                    System.out.println(elegida.getResponsable());
                    System.out.println("Resto de trabajadores:");
                    elegida.mostrarTrabajadores();
                    
                    break;
                case 0:
                    System.out.println("Usted está saliendo del programa..");
            }

        } while (opcion != 0);

    }
}
