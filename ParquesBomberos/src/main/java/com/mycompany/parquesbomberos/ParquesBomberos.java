/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parquesbomberos;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Carlos CG
 */
public class ParquesBomberos {
    

    public static void main(String[] args) {
        
        Scanner numeros = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        
        LinkedList<Parque> parques = new LinkedList<Parque>();
        
        int opcion = 0;
        int idB = 0;
        int idP = 0;
        
        System.out.println("MENÚ GESTIÓN PARQUES DE BOMBEROS");
        
        do{
            System.out.println("-----------------------------------------------");
            System.out.println("1-Añadir Parque");
            System.out.println("2-Listar Parques");
            System.out.println("3-Añadir Bombero");
            System.out.println("4-Añadir aviso");
            System.out.println("5-Listar avisos Parque");
            System.out.println("6-Borrar aviso");
            System.out.println("7-Salir");
            System.out.print("Introduzca una opción: ");
            
            opcion = numeros.nextInt();
            System.out.println("-----------------------------------------------");
            
            int parque;
            
            switch (opcion) {
                case 1:
                    System.out.println("CREANDO NUEVO PARQUE...");
                    System.out.print("Introduce la ubicación: ");
                    String ubicacion = texto.nextLine();
                    parques.add(new Parque(idP, ubicacion));
                    System.out.println("Nuevo parque id(" + idP + ") creado");
                    idP++;
                    break;
                case 2:
                    System.out.println("LISTANDO PARQUES ACTUALES:");
                    for (int i = 0; i < parques.size(); i++){
                        System.out.println(i + " - " + parques.get(i).getUbicacion() + '\n' + "Bomberos:");
                        parques.get(i).mostrarBomberos();
                        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-");
                    }
                    break;
                case 3:
                    System.out.println("CREANDO NUEVO BOMBERO...");
                    System.out.print("Introduce el nombre completo: ");
                    String nombreCompleto = texto.nextLine(); 
                    System.out.println("Introduce la edad: ");
                    int edad = numeros.nextInt();
                    int r = 0;
                    Rango rango = null;
                    do{
                        System.out.println("Selecciona una opción para el rango: "
                                + "1 - BOMBERO, 2 - CABO, 3 - SUBOFICIAL, 4 - OFICIAL");
                        r = numeros.nextInt();
                        switch (r) {
                            case 1:
                                rango = Rango.BOMBERO;
                                break;
                            case 2:
                                rango = Rango.CABO;
                                break;
                            case 3:
                                rango = Rango.SUBOFICIAL;
                                break;
                            case 4:
                                rango = Rango.OFICIAL;
                                break;
                            default:
                                System.out.println("OPCION NO VÁLIDA");;
                        }
                    }while(r < 1 || r > 4);
                    
                    System.out.println("MOSTRANDO PARQUES...");
                    for (int i = 0; i < parques.size(); i++) 
                        System.out.println(i + " - " + parques.get(i).getUbicacion());
                    System.out.print("Selecciona el el parque al que insertar el nuevo bombero: ");
                    parque = numeros.nextInt();
                    if(parque >= 0 && parque < parques.size()){
                        parques.get(parque).aniadirBombero(new Bombero(idB, nombreCompleto, edad, rango));
                        System.out.println("BOMBERO INSERTADO CORRECTAMENTE");
                        idB++;
                    }else
                        System.out.println("NO SE HA PODIDO INSERTAR EL BOMBERO");
                    break;
                case 4:
                    System.out.println("MOSTRANDO PARQUES...");
                    for (int i = 0; i < parques.size(); i++) 
                        System.out.println(i + " - " + parques.get(i).getUbicacion());
                    System.out.print("Selecciona el parque al que insertar el nuevo aviso: ");
                    parque = numeros.nextInt();
                    if(parque >= 0 && parque < parques.size()){
                        System.out.print("Introduce el aviso: ");
                        parques.get(parque).aniadirAviso(texto.nextLine());
                        System.out.println("AVISO INSERTADO CORRECTAMENTE");
                    }else
                        System.out.println("NO SE HA PODIDO INSERTAR EL AVISO");
                    break;
                case 5:
                    System.out.println("MOSTRANDO PARQUES...");
                    for (int i = 0; i < parques.size(); i++) 
                        System.out.println(i + " - " + parques.get(i).getUbicacion());
                    System.out.print("Selecciona el id del parque sobre el que mostrar los avisos: ");
                    parque = numeros.nextInt();
                    if(parque >= 0 && parque < parques.size())
                        parques.get(parque).mostrarAvisos();
                    else
                        System.out.println("OPCIÓN NO VÁLIDA");
                    break;
                case 6:
                    System.out.println("MOSTRANDO PARQUES...");
                    for (int i = 0; i < parques.size(); i++) 
                        System.out.println(i + " - " + parques.get(i).getUbicacion());
                    System.out.print("Selecciona el id del parque sobre el que mostrar los avisos: ");
                    parque = numeros.nextInt();
                    if(parque >= 0 && parque < parques.size()){
                        parques.get(parque).borrarAviso();
                        System.out.println("AVISO BORRADO CORRECTAMENTE");
                    }else
                        System.out.println("NO SE HA PODIDO BORRAR EL AVISO");
                    break;
                default:
                    System.out.println("OPCION NO VÁLIDA88");;
            }
            
        }while(opcion != 7);
        
    }
}
