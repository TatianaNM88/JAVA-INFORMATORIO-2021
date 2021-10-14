import java.util.*;

public class L2Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horasTrab = new ArrayList<>();
        horasTrab.add(6);
        horasTrab.add(7);
        horasTrab.add(8);
        horasTrab.add(4);
        horasTrab.add(5);      
        
        ArrayList<Integer> valorHora = new ArrayList<>();
        valorHora.add(350);
        valorHora.add(345);
        valorHora.add(550);
        valorHora.add(600);
        valorHora.add(320);

        ArrayList<Integer> totales = new ArrayList<>();
        int total=0;

        for (int i = 0; i < horasTrab.size(); i++) {
            int tot = horasTrab.get(i)*valorHora.get(i);
            totales.add(tot);
            total += totales.get(i);
        }
        System.out.println("Haberes semenales de cada empleado: " + totales);
        System.out.println("Total semanal de haberes de empleados: " + total);

    }
}
