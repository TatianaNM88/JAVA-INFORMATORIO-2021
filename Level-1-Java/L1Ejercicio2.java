import java.util.Scanner;

public class L1Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese un número entero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese otro número entero: ");
        int b = scan.nextInt();
        scan.close();
        
        int suma = 0, resta = 0, multiplicación = 0, división = 0, módulo = 0;

        suma = a+b;
        resta = a-b;
        multiplicación = a*b;
        división = a/b;
        módulo = a%b; 

        System.out.println(a + " + " + b + " = " + suma);
        System.out.println(a + " - " + b + " = " + resta);
        System.out.println(a + " * " + b + " = " + multiplicación);
        System.out.println(a + " / " + b + " = " + división);
        System.out.println(a + " % " + b + " = " + módulo);
    }   
} 
