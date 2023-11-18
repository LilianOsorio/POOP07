/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo07;

import Transportes.MediosDeTransporte;
import Transportes.Terrestres;

/**
 * La clase principal que contiene el método principal (main) para ejecutar el programa.
 * @author poo08alu12
 */
public class POO07 {
    

    /**
     * Método principal que inicia la ejecución del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de un objeto Animal
        Animal animal = new Animal ("Sparky", "CDMX", "blanco "); 
        
        // Imprimir información del animal utilizando diferentes formas
        System.out.println(animal);// otra forma de imprimir 
        System.out.println(animal. toString()); // se imprime porque se llama al toString
        
        // Creación de un objeto AnimalAcuatico
        AnimalAcuatico animalAcuatico = new AnimalAcuatico ();
        
        // Establecer atributos del animal acuático        
        animalAcuatico.setNombre("Max");
        animalAcuatico.setLugarOrigen("CDMX");
        animalAcuatico.setColor("negro");
        animalAcuatico.setNumeroAletas(4);
        
        // Imprimir atributos del animal acuático
        System.out.println(animalAcuatico); // imprimes atributos del objeto 
        
        // Creación de un objeto Ballena
        Ballena ballena = new Ballena (30, 2 ,"Will", "Artico", "azul");
        // Imprimir atributos de la ballena
        System.out.println(ballena);
        
        // Creación de un objeto AnimalTerrestre
        AnimalTerrestre animalTerrestre = new AnimalTerrestre ();
        // Establecer atributos del animal terrestre
        animalTerrestre.setNombre("Rocky");
        animalTerrestre.setLugarOrigen("CDMX");
        animalTerrestre.setColor("negro");
        animalTerrestre.setNumeroPatas(4);
       
        // Imprimir atributos del animal terrestre
        System.out.println(animalTerrestre);
        
        // Creación de un objeto Perro
        Perro perro = new Perro("rojo", 4, "Rocky", "CDMX", "cafe");
        // Imprimir atributos del perro
        System.out.println(perro);
        
        // Creación de un objeto AnimalAereo
        AnimalAereo animalAereo = new AnimalAereo ();
        // Establecer atributos del animal aéreo
        animalAereo.setNombre("Max");
        animalAereo.setLugarOrigen("CDMX");
        animalAereo.setColor("negro");
        animalAereo.setNumeroAlas(4);
        
        // Creación de objetos relacionados con medios de transporte
        MediosDeTransporte mediosDeTransporte = new MediosDeTransporte ();
        System.out.println(mediosDeTransporte);
        
        Terrestres terrestres = new Terrestres ();
        // Operaciones relacionadas con medios de transporte
        mediosDeTransporte.dejarPasajeros(10);
        mediosDeTransporte.recibirMantenimeinto();
        mediosDeTransporte.recogerPasajeros(15);
        mediosDeTransporte.setCantidadPasajeros(30);
                      
    }  
}
