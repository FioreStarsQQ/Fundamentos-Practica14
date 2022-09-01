
/*
EJERCICIO 6: Calcular la suma de los números pares positivos
hasta n inclusive
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio6b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, suma = 0;
        System.out.println("SUMATORIA DE LOS NUMEROS PARES ENTRE 1 Y n:");
        System.out.print("Ingrese el valor final \"n\": ");
        n = scan.nextInt();
        scan.close();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                suma = suma + i;
        }
        System.out.println("La sumatoria de los números pares hasta \"n\" es: " + suma);
    }
}