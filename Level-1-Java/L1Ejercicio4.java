import java.util.*;

  public class L1Ejercicio4 {
      public static void main(String[] args) {
		Scanner n_ingresado = new Scanner(System.in);
		System.out.print("Ingrese un número entero: ");
		Integer numero = n_ingresado.nextInt();
		System.out.printf("El factorial de %d es %.0f\n ", numero, factorial(numero));
		n_ingresado.close();
			}
      public static double factorial(int n) {
	  double num = 1;
	  for (int i = 1; i<=n; i++){  
	      num = num * i;		
      		}
	  return num;
      	}
}
