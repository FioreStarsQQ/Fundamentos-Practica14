package EJERCICIOS0;

/*
EJERCICIO 3:  Mostrar la tabla de multiplicar del 9 para
multiplicadores del 1..12
POR: Fiorela Clariza Quispe Quispe
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("TABLA DE MULTIPLICAR DEL 9");
        for (int i = 1; i <= 12; i++) {
            int mult = 9 * i;
            System.out.println("9 * " + i + " = " + mult);
        }
    }
}