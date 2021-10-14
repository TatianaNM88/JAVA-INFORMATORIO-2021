import java.util.Scanner;

public class L1Ejercicio1 {
    public static void main(String[] args) {
        System.out.print("Ingrese nombre de usuario: ");
        Scanner scan = new Scanner (System.in);
        String nombre = scan.nextLine();
        scan.close();
        
        System.out.println("HOLA " + nombre);

    }   
}
