package EJERCICIOS0;

/*
EJERCICIO 2:   Mostrar los números impares entre 30 y 50
POR: Fiorela Clariza Quispe Quispe
*/

public class Ejercicio2_Do_While {
    public static void main(String[] args) {
        int i = 30;
        System.out.println("NUMEROS IMAPRES ENTRE 30 Y 50:");
        do {
            if (i % 2 == 1)
                System.out.println(i);
            i++;
        } while (i <= 50);
    }
}