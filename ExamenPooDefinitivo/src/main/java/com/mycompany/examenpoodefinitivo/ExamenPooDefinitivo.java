/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenpoodefinitivo;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class ExamenPooDefinitivo {
public static Camion elegirCamion(LinkedList<Camion> camiones) {
        Scanner lecturanumeros = new Scanner(System.in);
        int opcion = -1;
        Camion elegido = null;
        System.out.println("A continuación se mostrarán los camiones para que seleccione uno: ");
        for (int i = 0; i < camiones.size(); i++) {
            System.out.println("Camión número: " + i + camiones.get(i));
        }
        System.out.println("Seleccione el número de camión:");
        opcion = lecturanumeros.nextInt();
        elegido = camiones.get(opcion);
        return elegido;
    }
    
    public static Camion buscarCamiones(LinkedList<Camion> camiones, String matricula) {
        Camion elegido = null;
        for (int i = 0; i < camiones.size(); i++) {
            if (camiones.get(i).getMatricula().equals(matricula)) {
                elegido = camiones.get(i);
            }
        }

        return elegido;
    }

    public static Reponedor elegirReponedor(LinkedList<Reponedor> reponedores) {
        Scanner lecturanumeros = new Scanner(System.in);
        int opcion = -1;
        Reponedor elegido = null;
        System.out.println("A continuación se mostrarán los trabajadores para que seleccione uno: ");
        for (int i = 0; i < reponedores.size(); i++) {
            System.out.println("Reponedor número: " + i + reponedores.get(i));
        }
        System.out.println("Seleccione el número de reponedor:");
        opcion = lecturanumeros.nextInt();
        elegido = reponedores.get(opcion);
        return elegido;
    }

    public static LinkedList<Producto> comprar(LinkedList<Producto> productossupermercado) {
        Scanner lecturanumeros = new Scanner(System.in);
        Scanner lecturanombres = new Scanner(System.in);

        LinkedList<Producto> carrito = new LinkedList();
        int opcion=-1;
        String eleccion = "SI";
        
do{
        System.out.println("A continuación se mostrarán los productos para que los añada a su cesta: ");
        for (int i = 0; i < productossupermercado.size(); i++) {
            System.out.println("Producto número: " + i + productossupermercado.get(i));
        }
        System.out.println("Seleccione el número de producto:");
        opcion=lecturanumeros.nextInt();
        carrito.add(productossupermercado.get(opcion));
        productossupermercado.remove(productossupermercado.get(opcion));
        System.out.println("¿Quiere seguir añadiendo opciones?(SI/NO)");
        eleccion = lecturanombres.nextLine();
    }while(eleccion.equalsIgnoreCase("SI"));
        return carrito;
    }

    public static double calcularValorCarrito(LinkedList<Producto> carrito) {
        double valor = 0;
        for (int i = 0; i < carrito.size(); i++) {
            valor = valor + carrito.get(i).getPrecio();
        }
        return valor;
    }

    public static Producto buscarProductos(LinkedList<Producto> productos, int id) {
        Producto elegido = null;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                elegido = productos.get(i);
            }
        }

        return elegido;
    }

    public static double cambiarPrecios(LinkedList<Producto> productossupermercado, Camion camion) {
        double acum = 0;
        for (Producto producto : productossupermercado) {
            acum = acum + producto.getPrecio();
        }
        return acum*1.10;
    }

    public static void mostrarProductos(LinkedList<Producto> productos) {
        if (!productos.isEmpty()) {
            for (int i = 0; i < productos.size(); i++) {
                System.out.println("Producto número: " + i + productos.get(i));
            }
        } else {
            System.out.println("La lista de productos está vacía.");
        }

    }

    public static void mostrarReponedores(LinkedList<Reponedor> reponedores) {
        if (!reponedores.isEmpty()) {
            for (int i = 0; i < reponedores.size(); i++) {
                System.out.println("Reponedor número: " + i + reponedores.get(i));
            }
        } else {
            System.out.println("La lista de reponedores está vacía.");
        }

    }

    public static void mostrarCamiones(LinkedList<Camion> camiones) {
        if (!camiones.isEmpty()) {
            for (int i = 0; i < camiones.size(); i++) {
                System.out.println("Reponedor número: " + i + camiones.get(i));
            }
        } else {
            System.out.println("La lista de reponedores está vacía.");
        }

    }

    public static void main(String[] args) {
        Scanner lecturanumeros = new Scanner(System.in);
        Scanner lecturanombres = new Scanner(System.in);
        LinkedList<Producto> productossupermercado = new LinkedList();
        LinkedList<Camion> camiones = new LinkedList();
        LinkedList<Reponedor> reponedores = new LinkedList();
        //Camiones
        Camion c1 = new Camion("1111AAA");
        c1.aniadirProducto(new Producto(0, "Ensalada", 1.25, Categoria.COMIDA));
        c1.aniadirProducto(new Producto(1, "Pan", 0.75, Categoria.COMIDA));
        c1.aniadirProducto(new Producto(2, "Camiseta", 10, Categoria.ROPA));
        c1.aniadirProducto(new Producto(3, "Pantalón", 12.5, Categoria.ROPA));
        Camion c2 = new Camion("2222 BBB");
        c2.aniadirProducto(new Producto(4, "Plato", 2.8, Categoria.BAZAR));
        c2.aniadirProducto(new Producto(5, "Tendedero", 10.75, Categoria.BAZAR));
        c2.aniadirProducto(new Producto(6, "Alicate", 5, Categoria.HERRAMIENTA));
        c2.aniadirProducto(new Producto(7, "Martillo", 13, Categoria.HERRAMIENTA));

        camiones.add(c1);
        camiones.add(c2);

        Reponedor r1 = new Reponedor("0", "Ernesto");
        Reponedor r2 = new Reponedor("1", "Julia");
        reponedores.add(r1);
        reponedores.add(r2);

        String respu = "SI";
        int opcion = 0;
        double beneficio = 0;

        // MENÚ
        do {
            System.out.println("Bienvenido al menú de opciones");
            System.out.println("Pulse 1 para descargar el camión");
            System.out.println("Pulse 2 para listar productos supermercado");
            System.out.println("Pulse 3 para mostrar beneficios");
            System.out.println("Pulse 4 para registrar un camión");
            System.out.println("Pulse 5 para realizar una compra");
            System.out.println("Pulse 6 para salir");
            opcion = lecturanumeros.nextInt();
            switch (opcion) {

                case 1:

                    Camion camionelegido = elegirCamion(camiones);
                    Reponedor repoelegido = elegirReponedor(reponedores);
                    double valorCamionactual = camionelegido.calcularvalorCamion(camionelegido);
                    
                    if (camionelegido != null && repoelegido != null) {
                        do {
                            repoelegido.descargarCamion(productossupermercado, camionelegido.descargarProductos(camionelegido));
                        } while (camionelegido.estavacio(camionelegido) == false);
                        beneficio = beneficio + (cambiarPrecios(productossupermercado, camionelegido) - valorCamionactual);
                        camiones.remove(camionelegido);

                    } else {
                        System.out.println("El camión o el reponedor no son correctos.");
                    }

                    break;

                case 2:
                    mostrarProductos(productossupermercado);
                    mostrarCamiones(camiones);
                    mostrarReponedores(reponedores);
                    break;
                case 3:
                    System.out.println("Los beneficios han sido de: " + beneficio + "€");
                    break;
                case 4:
                    System.out.println("Inserte la matrícula del camión:");
                    String matricula = lecturanombres.nextLine();
                    camiones.add(new Camion(matricula));
                    Camion elegi = buscarCamiones(camiones, matricula);
                    System.out.println("¿Quiere añadir productos al camión?:");
                    String respuesta = lecturanombres.nextLine();

                    if (respuesta.equalsIgnoreCase("SI")) {
                        do {
                            System.out.println("Inserte el id del producto para añadirlo al camión:");
                            mostrarProductos(productossupermercado);
                            int id = lecturanumeros.nextInt();
                            elegi.aniadirProducto(buscarProductos(productossupermercado, id));

                            System.out.println("¿Quiere seguir añadiendo productos?(SI/NO)");
                            respu = lecturanombres.nextLine();
                        } while (respu.equalsIgnoreCase("SI"));
                    }
                    break;

                case 5:
                    LinkedList<Producto>carrito=comprar(productossupermercado);
                    
                    System.out.println("El valor total de su compra es: " + calcularValorCarrito(carrito) + "€");
                    

                    break;
                case 6:
                    System.out.println("Usted está saliendo del programa..");
                    break;
                default:
                    System.out.println("Seleccione una opción válida..");
                    break;
            }

        } while (opcion
                != 6);

    }

}

