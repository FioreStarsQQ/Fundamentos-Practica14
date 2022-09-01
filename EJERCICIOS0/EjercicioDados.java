package EJERCICIOS0;

/*
EJERCICIO 2:   Mostrar los números impares entre 30 y 50
POR: Fiorela Clariza Quispe Quispe
*/

public class EjercicioDados {
    public static void main(String[] args) {
        System.out.println("COMBINACIONES DE DOS DADOS");
        for(int i=1; i<=6; i++)
            for(int j=1; j<=6; j++)
                System.out.println(i+" y "+j);
    }
}