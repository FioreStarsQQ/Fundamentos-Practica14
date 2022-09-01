
/*
    EJERCICIO 9: Realice un programa iterativo que permita a los
    alumnos realizar el juego del Porfiado en donde la
    computadora siempre gana (la pc siempre genera un
    número mayor al ingresado por el usuario)
    POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio9a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0, computadora, respuesta = 1, i = 0;
        while (respuesta == 1) {
            System.out.print("JUEGO DEL PORFIADO\nPara ganar debe ingresar un número mayor: ");
            num = scan.nextInt();
            computadora = num + 1;
            System.out.println("Perdiste... La computadora te ganó con " + computadora
                    + "\n¿Quieres intentarlo de nuevo?\nPresiona 1 para continuar o 2 para salir.");
            respuesta = scan.nextInt();
            i++;
        }
        System.out.print("Lo intentaste " + i + " veces.");
        scan.close();
    }
}