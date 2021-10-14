import java.util.Scanner; 
 
 public class L1Ejercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese un número entero: ");
        int base = scan.nextInt();
        System.out.print("Ingrese otro número entero: ");
        int exp = scan.nextInt();
        scan.close();

        int potencia = 1;
        for (int i = 1; i <= exp; i++){
            potencia = potencia * base;
            }
 
        System.out.print(base + " elevado a " + exp + " = " + potencia );{
        }
    }
 }
