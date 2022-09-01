
/*
    EJERCICIO 10: Mostrar todas las combinaciones posibles de tres
bits. 0 0 0   0 0 1    0 1 0    0 1 1 etc.
    POR: Fiorela Clariza Quispe Quispe
*/

public class Ejercicio10a {
    public static void main(String[] args) {
        System.out.println("COMBINACIONES DE TRES BITS");
        for (int i = 0; i <= 1; i++)
            for (int j = 0; j <= 1; j++)
                for (int k = 0; k <= 1; k++)
                    System.out.println(i + " - " + j + " - " + k);
    }
}
