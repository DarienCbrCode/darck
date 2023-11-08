
package codigoproyectofinal;

import java.util.ArrayList;
import java.util.Scanner;
public class Cliente extends Persona {
    private ArrayList<String> HistorialPedidos;

    public Cliente(ArrayList<String> HistorialPedidos, String Nombre, String Apellido, String email, int edad, int DNI, String Direccion, int NumeroTelefonico) {
        super(Nombre, Apellido, email, edad, DNI, Direccion, NumeroTelefonico);
        this.HistorialPedidos = HistorialPedidos;
    }
    
    public void mostrarRepartidoresDisponibles(Repartidor[] repartidores){
        System.out.println("Repartidores Disponibles:");
        for (Repartidor repartidor : repartidores) {
            System.out.println("Nombre: " + repartidor.getNombre() + ", DNI: " + repartidor.getDNI());
        }
    }
    
    public void seleccionarRepartidor(Repartidor[] repartidores){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Seleccione un repartidor ingresando el nombre:");
    String nombreRepartidor = scanner.nextLine();
    for (Repartidor repartidor : repartidores) {
        if (repartidor.getNombre().equals(nombreRepartidor)) {
            System.out.println("Repartidor seleccionado: " + repartidor.getNombre());
            // Aquí podrías realizar alguna acción adicional según tus necesidades
            return;
        }
    }
    System.out.println("No se encontró ningún repartidor con ese nombre.");
}

public void reportarRepartidor(Repartidor[] repartidores) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Por favor, describa el incidente ocurrido con el repartidor:");
    String comentario = scanner.nextLine();
    System.out.println("¿Cuál es el nombre del repartidor asociado al incidente?");
    String nombreRepartidor = scanner.nextLine();
    for (Repartidor repartidor : repartidores) {
        if (repartidor.getNombre().equals(nombreRepartidor)) {
            System.out.println("Se ha reportado el incidente con el repartidor " + nombreRepartidor + " - Comentario: " + comentario);
            return;
        }
    }
    System.out.println("No se encontró ningún repartidor con ese nombre.");
}
    
    public void gestionarIncidente(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, describa el incidente o problema:");
        String comentario = scanner.nextLine();
        System.out.println("El comentario ha sido registrado: " + comentario);
    }    
}
