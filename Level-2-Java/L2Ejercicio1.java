import java.util.*;

public class L2Ejercicio1 {
    public static void main(String[] args) {
  
    ArrayList<String> ciudades = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    try{
    int top = 3;    
    String ciudad;
    int i;
    for (i = 0; i < top; i++) {
        System.out.print("Ingrese una de sus ciudades favoritas de Argentina: ");
        ciudad = scan.nextLine();
        ciudades.add(ciudad);         
    }
    
    System.out.println("Su ranking de ciudades favoritas de Argentina es: ");
    for (i = 0; i < top; i++) {
        System.out.println("#" + (i+1) + " " + ciudades.get(i));
        }
    }finally{scan.close();}
    } 
}
    