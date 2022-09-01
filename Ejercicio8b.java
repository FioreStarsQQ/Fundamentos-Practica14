
/*
    EJERCICIO 8:  Realice un programa que ingrese por teclado las
    notas del alumno y luego calcule el promedio. El
    usuario podrá ingresar tantas notas como desee
    hasta que digite la nota -1
    POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio8b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 1;
        double nota = 0, suma = 0, promedio;
        for (int i = 0; nota != -1; i++) {
            suma += nota;
            System.out.print("Ingrese su nota: ");
            nota = scan.nextDouble();
            contador = i;
        }
        promedio = (double) Math.round(suma * 10 / contador) / 10;
        System.out.println("El promedio de sus " + contador + " notas es: " + promedio);
        scan.close();
    }
}