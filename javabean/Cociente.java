package javabean;

import java.util.Scanner;

/**
 *  @author Manuel_Dominguez_Navarro
 *  Git-Hub-> <a>https://github.com/Manudominguez1994</a>
 *  Esta clase implementa operaciones matemáticas relacionadas con la división.
 *  Permite dividir números reales y enteros, calcular el inverso de un número y obtener su raíz cuadrada.
 *  Incluye validaciones para evitar divisiones por cero y el uso de números negativos.
 *  Además, cuenta con un menú interactivo que permite al usuario seleccionar y ejecutar las distintas operaciones.
 */

public class Cociente {


    /**
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado division
     * @error si a = 0 cualquier numero divido entre 0 es 0 ERROR
     * @error si b = 0 no se puede dividir entre 0
     * @error No se permiten numero negativos
     */
    public static double dividirReales(double a, double b) {
        if(a == 0){
            System.out.println("Cualquier numero divido entre 0 es 0.");
        }
        if(b == 0){
            System.out.println("No se puede dividir entre 0.");
        }
        if(a<0 || b<0){
            System.out.println("No se permiten numeros negativos");
        }
     return a / b;
 }

    /**
     *
     * @param x dividendo
     * @param y divisor
     * @return resultado division
     * @error si a = 0 cualquier numero divido entre 0 es 0 ERROR
     * @error si b = 0 no se puede dividir entre 0
     * @error No se permiten numero negativos
     */

    public static  int dividirEnteros(int x, int y) {
        if(x == 0){
            System.out.println("Cualquier numero divido entre 0 es 0.");
        }
        if(y == 0){
            System.out.println("No se puede dividir entre 0.");
        }
        if(x<0 || y<0){
            System.out.println("No se permiten numeros negativos");
        }
        return x / y;
 }

    /**
     *
      * @param  a invertir
     * @return inverso del numero a
     * @error no se puede carcular el inverso de 0.
     * @error si no se permiten numero negativos
     */
    public static double inverso(double a) {
        if(a == 0){
            System.out.println("No se puede calcular el inverso de 0");
        }
        if(a<0){
            System.out.println("No se permiten numeros negativos");
        }
        return 1 / a;
 }

    /**
     *
      * @param a numero de entrada
     * @return  raiz cuadrada de a
     * @error no se puede carcular la raiz cuadrada de un numero negativa
     */
    public static double raiz(double a) {
        if(a<0){
            System.out.println("No se calcular la raiz cuadrada de un numero negativo");
        }
        return Math.sqrt(a);
 }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int numero;
        double a, b;
        int x,y;

        do {
            System.out.println("Selecciona el numero 1. Dividir reales");
            System.out.println("Selecciona el numero 2. Dividir enteros");
            System.out.println("Selecciona el numero 3. Inverso");
            System.out.println("Selecciona el numero 4. Calcular el raiz");
            System.out.println("Selecciona el numero 5. Salir");

            numero = sc.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Introduce el dividendo real: ");
                    a = sc.nextDouble();
                    System.out.println("Introduce el divisor real: ");
                    b = sc.nextDouble();
                    System.out.println("Resultado " + Cociente.dividirReales(a,b));
                    break;
                case 2:
                    System.out.println("Introduce el dividendo entero: ");
                    x = sc.nextInt();
                    System.out.println("Introduce el divisor real: ");
                    y = sc.nextInt();
                    System.out.println("Resultado " + Cociente.dividirEnteros(x,y));
                    break;
                case 3:
                    System.out.println("Introduce el dividendo entero: ");
                    a = sc.nextDouble();
                    System.out.println("Resultado " + Cociente.inverso(a));
                    break;
                case 4:
                        System.out.print("Introduce un número para calcular su raíz cuadrada: ");
                        a = sc.nextDouble();
                        System.out.println("Resultado: " + Cociente.raiz(a));
                        break;
            }
        }while (
                sc.nextInt()!=5
        );
    }

}
