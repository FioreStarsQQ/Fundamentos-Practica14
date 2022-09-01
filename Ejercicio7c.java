
/*
EJERCICIO 7:  Pedir sucesivamente por teclado un número hasta
que el número sea un valor comprendido entre m y
n. Mostrar la cantidad de intentos realizados
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio7c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0, m, n, num;
        System.out.print("INGRESAR UN NÚMERO DENTRO DEL RANGO \"m\" y \"n\" \nPrimero ingrese el valor de \"m\": ");
        m = scan.nextInt();
        System.out.print("Ingrese el valor de \"n\": ");
        n = scan.nextInt();
        do {
            System.out.print("Ingrese un número que se encuentre dentro del rango (" + m + " - " + n + "): ");
            num = scan.nextInt();
            i++;
        } while (num < m || num > n);
        System.out.println("¡Correcto! Lo ha logrado luego de " + i + " intento(s).");
        scan.close();
    }
}