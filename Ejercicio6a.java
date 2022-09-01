
/*
EJERCICIO 6: Calcular la suma de los números pares positivos
hasta n inclusive
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio6a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1, n, suma = 0;
        System.out.println("SUMATORIA DE LOS NUMEROS PARES ENTRE 1 Y n:");
        System.out.print("Ingrese el valor final \"n\": ");
        n = scan.nextInt();
        scan.close();
        while (i <= n) {
            if (i % 2 == 0)
                suma = suma + i;
            i++;
        }
        System.out.println("La sumatoria de los números pares hasta \"n\" es: " + suma);
    }
}