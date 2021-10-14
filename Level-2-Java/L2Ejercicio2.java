import java.util.*;

public class L2Ejercicio2 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int j = 5;
		int numero = 0;
		for (int i = 0; i <j; i++) {
			System.out.print("Ingrese un número entero" + " : ");
			numero = sc.nextInt();
			numeros.add(numero);		
						}
		System.out.println(numeros);
		int tamañoInicial = numeros.size();
		System.out.print("Ingrese posición '0': ");
		int pinicial = sc.nextInt();
		numeros.add(0, pinicial);
		System.out.print("Ingrese posición '-1': ");
		int pfinal = sc.nextInt();
		numeros.add(pfinal);
		int tamañoFinal = numeros.size();
		System.out.println(numeros);
		System.out.println("Tamaño inicial de la lista: " + tamañoInicial + " elementos");
		System.out.println("Tamaño final de la lista: " + tamañoFinal + " elementos");
		sc.close();
	}	
} 
  

