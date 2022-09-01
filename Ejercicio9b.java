
/*
    EJERCICIO 9: Realice un programa iterativo que permita a los
    alumnos realizar el juego del Porfiado en donde la
    computadora siempre gana (la pc siempre genera un
    número mayor al ingresado por el usuario)
    POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio9b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0, respuesta = 1, contador = 1;
        for (int i = 1; respuesta == 1; i++) {
            System.out.print("JUEGO DEL PORFIADO\nPara ganar debe ingresar un número mayor: ");
            num = scan.nextInt();
            contador = i;
            System.out.println("Perdiste... La computadora te ganó con " + (num + 1)
                    + "\n¿Quieres intentarlo de nuevo?\nPresiona 1 para continuar o 2 para salir.");
            respuesta = scan.nextInt();
        }
        System.out.print("Lo intentaste " + contador + " veces.");
        scan.close();
    }
}