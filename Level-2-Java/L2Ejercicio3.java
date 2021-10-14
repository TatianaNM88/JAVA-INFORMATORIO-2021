import java.util.*;

public class L2Ejercicio3 {
    
    public static void main(String[] args) {
        List<Integer> baraja = new ArrayList<>();
        
        int j = 13;
        for (int i = 0; i <j; i++) {
            baraja.add(i+1);        
            }
            System.out.println("Numeración de cartas en baraja francesa en orden creciente: " + baraja);
            Collections.reverse(baraja);
            System.out.println("En orden decreciente: " + baraja);
            Collections.shuffle(baraja);
            System.out.println("Mezcladas: " + baraja);
                        }
            }