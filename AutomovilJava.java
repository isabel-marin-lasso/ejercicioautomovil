/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil.java;

/**
 *
 * @author PC
 */
public class AutomovilJava {

    private String marca;
    private String modelo;
    private int year;

  
    public AutomovilJava(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

   
    public void encender() {
        System.out.println("El automovil esta encendido.");
    }

    public void acelerar(int velocidad) {
        System.out.println("El automovil esta acelerando a " + velocidad + " km/h.");
    }

    public void frenar() {
        System.out.println("El automovil esta frenando.");
    }

   
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + year);
    }

    public static void main(String[] args) {
     
        AutomovilJava auto1 = new AutomovilJava("Toyota", "Corolla", 2020);
        AutomovilJava auto2 = new AutomovilJava("Honda", "Civic", 2019);

        auto1.mostrarInfo();
        auto1.encender();
        auto1.acelerar(100);

        auto2.mostrarInfo();
        auto2.encender();
        auto2.frenar();
    }
}
    
    

