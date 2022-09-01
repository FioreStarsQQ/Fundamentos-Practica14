package EJERCICIOS0;

/*
EJERCICIO 4:   Mostrar los números impares entre 30 y 50
POR: Fiorela Clariza Quispe Quispe
*/

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("NUMEROS IMAPRES ENTRE 30 Y 50:");
        for (int i = 30; i <= 50; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
    }
}