import java.util.Scanner;

public class L1Ejercicio8 {
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese Nombre y Apellido: ");
        String nombreYApellido = scan.nextLine();
        System.out.print("Ingrese Edad: ");
        String edad = scan.nextLine();
        System.out.print("Ingrese Dirección: ");
        String direccion = scan.nextLine();
        System.out.print("Ingrese Ciudad: ");
        String ciudad = scan.nextLine();
        scan.close();

        System.out.println(ciudad + " - "+ direccion + " - " + nombreYApellido +" - "+ edad);
    }
}