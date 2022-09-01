package EJERCICIOS0;

/*
EJERCICIO 2:   Mostrar los números impares entre 30 y 50
POR: Fiorela Clariza Quispe Quispe
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        int i = 30;
        System.out.println("NUMEROS IMPARES ENTRE 30 Y 50:");
        while (i <= 50) {
            if (i % 2 == 1)
                System.out.println(i);
            i++;
        }
    }
}