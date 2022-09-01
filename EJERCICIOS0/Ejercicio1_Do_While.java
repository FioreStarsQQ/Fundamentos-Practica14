package EJERCICIOS0;

/*
EJERCICIO 3:  Mostrar la tabla de multiplicar del 9 para
multiplicadores del 1..12
POR: Fiorela Clariza Quispe Quispe
*/

public class Ejercicio1_Do_While {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("TABLA DE MULTIPLICAR DEL 9");
        do {
            int mult = 9 * i;
            System.out.println("9 * " + i + " = " + mult);
            i++;
        } while (i <= 12);
    }
}