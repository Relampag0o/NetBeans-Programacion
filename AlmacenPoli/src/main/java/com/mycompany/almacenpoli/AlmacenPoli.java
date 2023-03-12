/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.almacenpoli;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class AlmacenPoli {

    public Estanteria elegirEstanteria(LinkedList<Estanteria> estanterias, String idEstanteria) {
        Scanner lecturanumeros = new Scanner(System.in);

        Estanteria elegido = null;
        for (int i = 0; i < estanterias.size(); i++) {
            System.out.println("Estantería número: " + i + estanterias.get(i));

        }
        System.out.println("Seleccione el número de estantería:");
        elegido = estanterias.get(lecturanumeros.nextInt());

        return elegido;
    }

    public void calcularPrecioEstanteria(LinkedList<Estanteria> estanterias, String idEstanteria) {
        for (int i = 0; i < estanterias.size(); i++) {
            if (estanterias.get(i).getId().equals(idEstanteria)) {
                estanterias.get(i).calcularPrecio();

            } else {
                System.out.println("La estantería proporcionada no es correcta.");
            }

        }
    }

    public static void main(String[] args) {
        Scanner lecturanombres = new Scanner(System.in);
        Scanner lecturanumeros = new Scanner(System.in);
        int opcion = 0;
        LinkedList<Estanteria> estanterias = new LinkedList();
        LinkedList<Bebida> bebidas = new LinkedList();

        //AGUA
        AguaMineral aguamineral1 = new AguaMineral("Polo", "AM001", 2, 2.50, "Font Vella");
        AguaMineral aguamineral2 = new AguaMineral("Riscos", "AM002", 2, 2.50, "Font Vella");

        //REFRESCOS
        BebidaAzucarada cocacola = new BebidaAzucarada(60, true, "BA001", 2, 3.50, "Coca-Cola");
        BebidaAzucarada fanta = new BebidaAzucarada(50, true, "BA002", 2, 3.50, "Fanta");
        BebidaAzucarada pepsi = new BebidaAzucarada(55, false, "BA003", 2, 3.50, "Pepsi");
        BebidaAzucarada sprite = new BebidaAzucarada(50, false, "BA004", 2, 3.50, "sprite");

        // ESTANTERIAS
        Estanteria estanteria1 = new Estanteria("1E", 10);
        Estanteria estanteria2 = new Estanteria("2E", 5);
        Estanteria estanteria3 = new Estanteria("3E", 5);
        Estanteria estanteria4 = new Estanteria("4E", 10);
        Estanteria estanteria5 = new Estanteria("5E", 20);
        Estanteria estanteria6 = new Estanteria("6E", 20);

        //añadir        
        bebidas.add(aguamineral1);
        bebidas.add(aguamineral2);
        bebidas.add(cocacola);
        bebidas.add(fanta);
        bebidas.add(pepsi);
        bebidas.add(sprite);

        estanterias.add(estanteria1);
        estanterias.add(estanteria2);
        estanterias.add(estanteria3);
        estanterias.add(estanteria4);
        estanterias.add(estanteria5);
        estanterias.add(estanteria6);
        
        estanteria1.aniadirBebida(sprite);
        estanteria1.aniadirBebida(cocacola);
        estanteria1.aniadirBebida(pepsi);
        estanteria1.aniadirBebida(aguamineral1);
        estanteria1.aniadirBebida(aguamineral2);
        

        System.out.println("--Bienvenido al menú de opciones--");
        System.out.println("Pulse 1 para calcular el precio de todas las bebidas del almacén");
        System.out.println("Pulse 2 para calcular el precio según una marca");
        System.out.println("Pulse 3 para calcular el precio de los productos de una estantería");
        System.out.println("Pulse 4 para agregar un producto");
        System.out.println("Pulse 5 para eliminar un producto");
        System.out.println("Pulse 6 para mostrar la información de las bebidas");
        opcion = lecturanumeros.nextInt();
        switch (opcion) {

            case 1:
                

                break;
            case 2:
                
                
                break;

            case 3:
                
                
                break;
                
        }

    }
}
