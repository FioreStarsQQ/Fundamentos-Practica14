/*
EJERCICIO 1:  Programa que muestre los n primeros números
enteros no negativos
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Para mostrar los n primeros números enteros no negativos, ingrese n: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        scan.close();
    }
}