
/*
EJERCICIO 1:  Programa que muestre los n primeros números
enteros no negativos
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio1c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        System.out.print("Para mostrar los n primeros números enteros no negativos, ingrese n: ");
        int n = scan.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
        scan.close();
    }
}