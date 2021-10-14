import java.util.Scanner;
 
public class L1Ejercicio7 {
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese una palabra en minúscula: ");
        String palabra = scan.nextLine();
        scan.close();
        
        try {
            char caracteres='a';
            for (int i = 0; i <= palabra.length(); i++){
                if ('a' <= palabra.charAt(i) && palabra.charAt(i) <= 'z'){
                caracteres= (char)(palabra.charAt(i)-32);
                }
                else{
                    caracteres= (char)(palabra.charAt(i));
                System.out.println("Ingrese solo palabras en minúscula");
                }
                System.out.print(caracteres);
            }
            
        } catch (Exception e) {
        }
    }
        
}


