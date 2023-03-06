/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tiendaropa;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class TiendaRopa {

    public static Trabajador buscarDependiente(LinkedList<Trabajador> dependientes, String dni) {
        Trabajador elegido = null;
        for (int i = 0; i < dependientes.size(); i++) {
            if (dependientes.get(i).getDni().equals(dni) && dependientes.get(i).getRango() == Rango.DEPENDIENTE) {
                elegido = dependientes.get(i);
            }
        }

        return elegido;
    }
    /*
    public static Prenda elegirPrenda(LinkedList<Prenda> prendas) {
        Scanner lecturanumeros = new Scanner(System.in);
        Scanner lecturanombres = new Scanner(System.in);
      
        int opcion = -1;
        Prenda elegido = null;
        System.out.println("A continuación se mostrarán las prendas para que seleccione una: ");
        for (int i = 0; i < prendas.size(); i++) {
            System.out.println("Prenda número: " + i + prendas.get(i));
        }
        System.out.println("Seleccione el número de prenda:");
        opcion = lecturanumeros.nextInt();
        elegido = prendas.get(opcion);
        return eleg;
}
*/    
    public static Trabajador buscarDepenAlmacen(LinkedList<Trabajador> dependientes, String dni) {
        Trabajador elegido = null;
        for (int i = 0; i < dependientes.size(); i++) {
            if (dependientes.get(i).getDni().equals(dni) && dependientes.get(i).getRango() == Rango.ALMACEN) {
                elegido = dependientes.get(i);
            }
        }

        return elegido;
    }

    public static Cliente buscarCliente(LinkedList<Cliente> clientes, String dni) {
        Cliente elegido = null;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDni().equals(dni)) {
                elegido = clientes.get(i);
            }
        }

        return elegido;
    }

    public static void mostrarPrenda(LinkedList<Prenda> prendas) {
        for (int i = 0; i < prendas.size(); i++) {
            System.out.println(prendas.get(i));

        }
    }

    public static void main(String[] args) {
        Scanner lecturanumeros = new Scanner(System.in);
        Scanner lecturanombres = new Scanner(System.in);

        LinkedList<Prenda> prendas = new LinkedList();
        LinkedList<Trabajador> trabajadores = new LinkedList();
        LinkedList<Cliente> clientes = new LinkedList();

        //PRENDA
        Prenda p1 = new Prenda("0", "jersey", Talla.M, 18.99, Tipo.SUPERIOR, 150);
        Prenda p2 = new Prenda("1", "vaqueros", Talla.S, 22.99, Tipo.INFERIOR, 100);
        Prenda p3 = new Prenda("2", "calzoncillos", Talla.L, 10.99, Tipo.INTERIOR, 160);
        Prenda p4 = new Prenda("3", "bragas", Talla.XL, 10.99, Tipo.INTERIOR, 152);
        Prenda p5 = new Prenda("4", "calcetines", Talla.S, 6.99, Tipo.INTERIOR, 136);
        Prenda p6 = new Prenda("5", "camiseta", Talla.M, 14.99, Tipo.SUPERIOR, 145);
        Prenda p7 = new Prenda("6", "abrigo", Talla.XXL, 35.99, Tipo.SUPERIOR, 163);
        Prenda p8 = new Prenda("7", "sudadera", Talla.S, 24.99, Tipo.SUPERIOR, 124);
        Prenda p9 = new Prenda("8", "jeans", Talla.M, 18.99, Tipo.INFERIOR, 134);
        Prenda p10 = new Prenda("9", "chaqueta", Talla.XL, 20.99, Tipo.SUPERIOR, 126);
        prendas.add(p1);
        prendas.add(p2);
        prendas.add(p3);
        prendas.add(p4);
        prendas.add(p5);
        prendas.add(p6);
        prendas.add(p7);
        prendas.add(p8);
        prendas.add(p9);
        prendas.add(p10);

        Cliente c1 = new Cliente("1786231M", "Andi", "Calle.Ejemplo1");
        Cliente c2 = new Cliente("1723542P", "Alberto", "Calle.Ejemplo2");
        Cliente c3 = new Cliente("1731241O", "Joaquin", "Calle.Ejemplo3");
        Cliente c4 = new Cliente("2744321R", "Jose", "Calle.Ejemplo4");
        Cliente c5 = new Cliente("1778495G", "Gonzalo", "Calle.Ejemplo5");
        Cliente c6 = new Cliente("9876254B", "Victor", "Calle.Ejemplo6");
        Cliente c7 = new Cliente("1743231D", "Mario", "Calle.Ejemplo7");
        Cliente c8 = new Cliente("2345231A", "Pablo", "Calle.Ejemplo8");
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);
        clientes.add(c7);
        clientes.add(c8);

        //TRABAJADORES
        Trabajador t1 = new Trabajador("472563482A", "Manolo", Rango.DEPENDIENTE);
        Trabajador t2 = new Trabajador("876544325H", "Vicente", Rango.ALMACEN);
        Trabajador t3 = new Trabajador("987435326A", "Cletus", Rango.DEPENDIENTE);
        Trabajador t4 = new Trabajador("124326713V", "Bonifaceo", Rango.ALMACEN);
        Trabajador t5 = new Trabajador("276541822X", "Rosario", Rango.ALMACEN);
        Trabajador t6 = new Trabajador("725637281N", "Manuel", Rango.ALMACEN);
        Trabajador t7 = new Trabajador("128738754O", "Enrique", Rango.DEPENDIENTE);
        Trabajador t8 = new Trabajador("124571245P", "Isabel", Rango.DEPENDIENTE);
        trabajadores.add(t1);
        trabajadores.add(t2);
        trabajadores.add(t3);
        trabajadores.add(t4);
        trabajadores.add(t5);
        trabajadores.add(t6);
        trabajadores.add(t7);
        trabajadores.add(t8);
        int opcion;
        int cantidad;
        double precio = 0;
        String eleccion = "SI";
        // listas

        // CREACIÓN
        //
        // MENÚ
        do {
            System.out.println("Bienvenido al menú de opciones");
            System.out.println("1. Iniciar compra");
            System.out.println("2. Hacer encargo");
            System.out.println("3. Mostrar prendas");
            System.out.println("4. Terminar compra");

            System.out.println("Pulse 5 para salir");
            opcion = lecturanumeros.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Inserte el DNI del dependiente:");
                    String dnidepen = lecturanombres.nextLine();
                    System.out.println("Inserte el DNI del cliente:");
                    String dnicli = lecturanombres.nextLine();
                    Trabajador trabelegido = buscarDependiente(trabajadores, dnidepen);
                    Cliente clielegido = buscarCliente(clientes, dnicli);
                    if (trabelegido != null && clielegido != null) {
                        trabelegido.elegirPrenda(prendas, clielegido);
                    } else {
                        System.out.println("El cliente o trabajador seleccionado no son válidos.");
                    }

                    break;

                case 2:
                    /*
                    Trabajador tt = null;
                    String n = lecturanombres.next();
                    
                    System.out.println("Dime el id del trabajador: ");
                    String idtrabajador = lecturanombres.next();
                    
                    for (int i = 0; i < trabajadores.size(); i++) {
                        if (trabajadores.get(i).getRango() == Rango.ALMACEN) {
                            tt = trabajadores.get(i);
                        }
                    }
                    
                    while (n.equals("NO") || n.equals("SI")) {
                        //Prenda pp= tt.elegirPrenda(prendas, clielegido);
                        
                        System.out.println("Cuanto unidades quieres aniadir: ");
                        int cant = lecturanumeros.nextInt();
                        //tt.aniadirStock(pp, cant);

                        //System.out.println("La cantidad " + cant + " ha sido aniadida a la prenda " + pp.getDescripcion());
                        System.out.println("¿ Desea aniadir alguna prenda mas ? ( 1 - SI/ 2 - NO )");
     }
*/
                    break;
                case 3:
                    mostrarPrenda(prendas);
                    break;
                case 4:
                    System.out.println("Terminando la compra");
                    System.out.println("ID del dependiente");
                    String dni = lecturanombres.nextLine();
                    Trabajador trab = null;
                    for (int i = 0; i < trabajadores.size(); i++) {
                        if (trabajadores.get(i).getDni().equals(dni)) {
                            trab = trabajadores.get(i);
                        }
                    }
                    if (trab == null) {
                        System.out.println("No se encontro al trabajador con ese DNI");
                    }
                    System.out.println("DNI del cliente");

                    dni = lecturanombres.nextLine();
                    Cliente clien = null;
                    for (int i = 0; i < clientes.size(); i++) {
                        if (clientes.get(i).getDni().equals(dni)) {
                            clien = clientes.get(i);
                        }
                    }
                    if (clien == null) {
                        System.out.println("No se encontro al cliente con ese DNI");
                    }else
                        System.out.println("Operación realizada con éxito.");
                    trab.eliminarCarrito(clien);

                    break;

                case 5:
                    System.out.println("Usted está saliendo del programa..");
                    break;
                default:
                    System.out.println("Seleccione una opción válida..");
                    break;
            }

        } while (opcion != 5);

    }

}
