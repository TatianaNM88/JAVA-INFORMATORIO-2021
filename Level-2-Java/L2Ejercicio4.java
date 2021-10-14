import java.util.*;

public class L2Ejercicio4 {
    public static void main(String [] args) {
            Scanner scan = new Scanner (System.in);
            ArrayList<String> alumnos = new ArrayList<>();
        int cantidadAlumnos = 12;
        int a, b, c, d;
        a = 0;
        b = cantidadAlumnos/3;
        c = b + b;
        d = cantidadAlumnos;
        String alumno;
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingresar alumno: ");
            alumno = scan.nextLine();
            alumnos.add(alumno);
                            }
        
        List<String> subAlumnos1 = alumnos.subList(a, b);
        List<String> subAlumnos2 = alumnos.subList(b, c);
        List<String> subAlumnos3 = alumnos.subList(c, d);
        System.out.println("Alumnos primer curso: " + " " + subAlumnos1);
        System.out.println("Alumnos segundo curso: " + " " + subAlumnos2);
        System.out.println("Alumnos tercer curso: " + " " + subAlumnos3);
        scan.close();
        }
    }




