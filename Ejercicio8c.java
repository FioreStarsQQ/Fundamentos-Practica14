
/*
    EJERCICIO 8:  Realice un programa que ingrese por teclado las
    notas del alumno y luego calcule el promedio. El
    usuario podrá ingresar tantas notas como desee
    hasta que digite la nota -1
    POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio8c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        double nota = 0, suma = 0, promedio;
        do {
            suma += nota;
            System.out.print("Ingrese su nota: ");
            nota = scan.nextDouble();
            i++;
        } while (nota!=-1);
        promedio = (double) Math.round(suma * 10 / (i - 1)) / 10;
        System.out.println("El promedio de sus " + (i - 1) + " notas es: " + promedio);
        scan.close();
    }
}