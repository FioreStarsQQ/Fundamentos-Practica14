
/*
EJERCICIO 5: Mostrar un listado con los números del 1 a n, cada
uno con su respectiva potencia 2 (forma tabular)
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio5b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, potencia;
        System.out.print("Para hallar las potencias, ingrese el valor final (n): ");
        n = scan.nextInt();
        scan.close();
        System.out.println("N°\tPOTENCIA");
        for (int i = 1; i <= n; i++) {
            potencia = (int) Math.pow(i, 2);
            System.out.println(i + "\t" + potencia);
        }
    }
}