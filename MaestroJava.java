/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maestro.java;

/**
 *
 * @author PC
 */
public class MaestroJava {

    private String nombre;
    private String materia;
    private int añosExperiencia;

    public MaestroJava(String nombre, String materia, int añosExperiencia) {
        this.nombre = nombre;
        this.materia = materia;
        this.añosExperiencia = añosExperiencia;
    }

 
    public void enseñar() {
        System.out.println(nombre + " esta enseñando " + materia + ".");
    }

    public void calificar() {
        System.out.println(nombre + " esta calificando examenes.");
    }

    public void descansar() {
        System.out.println(nombre + " esta tomando un descanso.");
    }

   
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Materia: " + materia + ", Años de experiencia: " + añosExperiencia);
    }

    public static void main(String[] args) {
  
       MaestroJava maestro1 = new MaestroJava("liset", "Matematicas", 10);
       MaestroJava maestro2 = new MaestroJava("Carlos", "español", 15);

     
        maestro1.mostrarInfo();
        maestro1.enseñar();
        maestro1.descansar();

        maestro2.mostrarInfo();
        maestro2.enseñar();
        maestro2.calificar();
    }
}



