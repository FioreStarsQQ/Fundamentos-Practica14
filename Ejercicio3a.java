
/*
EJERCICIO 3:  Mostrar los números impares entre m y n enteros
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio3a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorInicial, valorFinal;
        System.out.print("Para hallar los números impares de un rango determinado, ingrese el valor incial: ");
        valorInicial = scan.nextInt();
        System.out.print("Ahora, ingrese el valor final del rango: ");
        valorFinal = scan.nextInt();
        System.out.println("NUMEROS IMAPRES ENTRE " + valorInicial + " Y " + valorFinal + ":");
        while (valorInicial <= valorFinal) {
            if (valorInicial % 2 == 1)
                System.out.println(valorInicial);
            valorInicial++;
        }
        scan.close();
    }
}
