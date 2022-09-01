
/*
EJERCICIO 1:  Programa que muestre los n primeros números
enteros no negativos
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio1a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1, n;
        System.out.print("Para mostrar los n primeros números enteros no negativos, ingrese n: ");
        n = scan.nextInt();
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        scan.close();
    }
}