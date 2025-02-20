package javabean;

import java.util.Scanner;

/**
 * @author Félix_Ruiz_de_la_Cuesta
 * github: https://github.com/FelixRuiz
 *
 * Esta clase implementará todos los métodos que están relacionados con la resta de la calculadora. 
 * Métodos incluidos:
 * 1. Resta de dos números reales.
 * 2. Resta de dos números enteros.
 * 3. Resta de tres números reales.
 * 4. Resta con valor acumulado.
 */
public class CalculadoraResta {

    private double valorAcumulado;

    /**
     * Constructor que inicializa el valor acumulado en 0.
     */
    public CalculadoraResta() {
        this.valorAcumulado = 0;
    }

    /**
     * Resta dos números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return Resultado de la resta.
     */
    public static double restaDosReales(double a, double b) {
        if (a < 0 || b < 0) {
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return a - b;
    }

    /**
     * Resta dos números enteros.
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return Resultado de la resta.
     */
    public static int restaDosEnteros(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return a - b;
    }

    /**
     * Resta tres números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return Resultado de la resta.
     */
    public static double restaTresReales(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return a - b - c;
    }

    /**
     * Resta un valor al valor acumulado.
     * @param a Valor a restar.
     * @return Nuevo valor acumulado.
     */
    public double restarAcumulado(double a){
        if (a < 0){
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return this.valorAcumulado -= a;
    }

    /**
     * Resetea el valor acumulado a 0.
     * @return Valor acumulado después del reset.
     */
    public double resetAcumulador(){
        this.valorAcumulado = 0;
        return this.valorAcumulado;
    }

    /**
     * Método para mostrar el menú interactivo.
     */
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int numero;
        double a, b, c;
        int x, y;
        CalculadoraResta resta = new CalculadoraResta();
        do{
            System.out.println("\n MENU RESTA");
            System.out.println("1. Restar 2 numeros reales");
            System.out.println("2. Restar 2 numeros enteros");
            System.out.println("3. Restar 3 numeros reales");
            System.out.println("4. Restar con valor acumulado");
            System.out.println("5. Reset acumulador");
            System.out.println("6. Salir");

            numero = sc.nextInt();

            switch(numero){
                case 1:
                    System.out.println("Introduce el primer numero (real): ");
                    a = sc.nextDouble();
                    System.out.println("Introduce el segundo numero (real): ");
                    b = sc.nextDouble();
                    System.out.println("Resultado: " + resta.restaDosReales(a,b));
                    break;
                case 2:
                    System.out.println("Introduce el primer numero (entero): ");
                    x = sc.nextInt();
                    System.out.println("Introduce el segundo numero (entero): ");
                    y = sc.nextInt();
                    System.out.println("Resultado: " + resta.restaDosEnteros(x,y));
                    break;
                case 3:
                    System.out.println("Introduce el primer numero (real): ");
                    a = sc.nextDouble();
                    System.out.println("Introduce el segundo numero (real): ");
                    b = sc.nextDouble();
                    System.out.println("Introduce el tercer numero (real): ");
                    c = sc.nextDouble();
                    System.out.println("Resultado: " + resta.restaTresReales(a,b,c));
                    break;
                case 4:
                    System.out.println("Introduce un numero (real): ");
                    a = sc.nextDouble();
                    System.out.println("Resultado: " + resta.restarAcumulado(a));
                    break;
                case 5:
                    System.out.println("Reseteando acumulador");
                    resta.resetAcumulador();
                    break;
            }
        }
        while (numero != 6);
        sc.close();
    }
}