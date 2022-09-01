
/*
EJERCICIO 2:  Mostrar la tabla de multiplicar de un entero para
cualquier rango de multiplicadores. Imprimir el
multiplicando, el multiplicador y el producto. 
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio2b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplicando, multiplicadorInicial, multiplicadorFinal, producto;
        System.out.print("Ingrese el multiplicando: ");
        multiplicando = scan.nextInt();
        System.out.print("Para el rango de multiplicadores ingrese el valor inicial: ");
        multiplicadorInicial = scan.nextInt();
        System.out.print("Ahora, ingrese el valor final: ");
        multiplicadorFinal = scan.nextInt();
        scan.close();
        for (int i = multiplicadorInicial; i <= multiplicadorFinal; i++) {
            producto = i * multiplicando;
            System.out.println(" - " + i + " * " + multiplicando + " = " + producto);
        }
    }
}