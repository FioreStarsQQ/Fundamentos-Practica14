
/*
EJERCICIO 7:  Pedir sucesivamente por teclado un número hasta
que el número sea un valor comprendido entre m y
n. Mostrar la cantidad de intentos realizados
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio7b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n, num = 0, contador = 0;
        System.out.print("INGRESAR UN NÚMERO DENTRO DEL RANGO \"m\" y \"n\" \nPrimero ingrese el valor de \"m\": ");
        m = scan.nextInt();
        System.out.print("Ingrese el valor de \"n\": ");
        n = scan.nextInt();
        for (int i = 1; num < m || num > n; i++) {
            System.out.print("Ingrese un número que se encuentre dentro del rango (" + m + " - " + n + "): ");
            num = scan.nextInt();
            contador = i;
        }
        System.out.println("¡Correcto! Lo ha logrado luego de " + contador + " intento(s).");
        scan.close();
    }
}