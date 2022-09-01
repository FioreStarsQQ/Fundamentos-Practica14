
/*
EJERCICIO 4:  Calcular la sumatoria de los números comprendidos
en un rango dado (enteros)
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio4b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorInicial, valorFinal, suma = 0;
        System.out.print(
                "Para calcular la sumatoria de los números comprendidos en un rango dado, ingrese el valor incial del rango: ");
        valorInicial = scan.nextInt();
        System.out.print("Ahora, ingrese el valor final del rango: ");
        valorFinal = scan.nextInt();
        for (int i = valorInicial; i <= valorFinal; i++) {
            suma = suma + i;
        }
        System.out.println("La sumatoria es: " + suma);
        scan.close();
    }
}