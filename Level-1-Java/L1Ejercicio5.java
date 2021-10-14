import java.util.Scanner;

public class L1Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese un número entero: ");
        int nro1 = scan.nextInt();
        System.out.print("Ingrese otro número entero: ");
        int nro2 = scan.nextInt();
        scan.close();
        
        int multiplicacionSucesiva = 0;
        for(int i =1; i <=nro2; i++){
            multiplicacionSucesiva += nro1;
            }
        System.out.println (nro1 + " x " + nro2 + " = " +  (multiplicacionSucesiva));
        }        
}