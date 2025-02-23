package javabean;

import java.util.Scanner;

/**
 * @author Santiago_Berdecio_Trigueros
 * github: https://github.com/SantiagoBerdecio
 *
 * Esta clase implementará todos los métodos que están relacionados con la suma de la calculadora. Esta
 * clase tendrá los siguientes métodos:
 *      1. javabean.Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 *      2. javabean.Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 *      3. javabean.Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
 *      4. javabean.Suma con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor
 *      acumulado.
 */
public class Suma {

    private double valorAcumulado;

    public Suma() {
        this.valorAcumulado = 0;
    }

    /**
     * @param a variable de numero real 1 de la operacion
     * @param b variable de numero real 2 de la operacion
     * @return suma de variables reales "a" + "b"
     * @error si a o b es negativo aparece "Valor invalido"
     */
    public static double sumaDosReales(double a, double b) {
        if (a < 0 || b < 0) {
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return a + b;
    }

    /**
     * @param a variable de numero entero 1 de la operacion
     * @param b variable de numero entero 2 de la operacion
     * @return suma de variables enteras "a" + "b"
     * @error si a o b es negativo aparece "Valor invalido"
     */
    public static int sumaDosEnteros(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return a + b;
    }

    /**
     * @param a variable de numero real 1 de la operacion
     * @param b variable de numero real 2 de la operacion
     * @param c variable de numero real 3 de la operacion
     * @return suma de variables reales "a" + "b"
     * @error si a, b o c es negativo aparece "Valor invalido"
     */
    public static double sumaTresReales(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return a + b + c;
    }

    /**
     * @param a variable de numero real 1 de la operacion
     * @valorAcumulado
     * @return la suma del valorAcumulado + a
     * @error Si a es menor que 0 la operacion no se hara
     */
    public double acumulador(double a) {
        if (a < 0) {
            System.out.println("Valor inválido, estás introduciendo un valor negativo");
            return this.valorAcumulado; // No suma el número negativo
        }
        return this.valorAcumulado += a;
    }


    // Método para sumar con valor acumulado
    public void sumar(double valor) {
        this.valorAcumulado += valor;
    }

    // Método para obtener el valor acumulado
    public double getAcumulado() {
        return this.valorAcumulado;
    }

    // Método para reiniciar el acumulado si es necesario
    public void reiniciar() {
        this.valorAcumulado = 0;
    }

    public double resetAcumulador(){
        this.valorAcumulado = 0;
        return this.valorAcumulado;
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int numero;
        double a, b, c;
        int x, y;
        Suma suma = new Suma();
        do{
            System.out.println("\n MENU SUMA");
            System.out.println("1. Sumar 2 numeros reales");
            System.out.println("2. Sumar 2 numeros enteros");
            System.out.println("3. Sumar 3 numeros reales");
            System.out.println("4. Sumar con valor acumulado");
            System.out.println("5. Reset acumulador");
            System.out.println("6. Salir");

            numero = sc.nextInt();

            switch(numero){
                case 1:
                    System.out.println("Introduce el primer numero (real): ");
                    a = sc.nextDouble();
                    System.out.println("Introduce el segundo numero (real): ");
                    b = sc.nextDouble();
                    System.out.println("Resultado: " + suma.sumaDosReales(a,b));
                    break;
                case 2:
                    System.out.println("Introduce el primer numero (entero): ");
                    x = sc.nextInt();
                    System.out.println("Introduce el segundo numero (entero): ");
                    y = sc.nextInt();
                    System.out.println("Resultado: " + suma.sumaDosEnteros(x,y));
                    break;
                case 3:
                    System.out.println("Introduce el primer numero (real): ");
                    a = sc.nextDouble();
                    System.out.println("Introduce el segundo numero (real): ");
                    b = sc.nextDouble();
                    System.out.println("Introduce el tercer numero (real): ");
                    c = sc.nextDouble();
                    System.out.println("Resultado: " + suma.sumaTresReales(a,b,c));
                    break;
                case 4:
                    System.out.println("Si introduces un numero negativo finaliza la operacion");
                    System.out.println("Introduce un numero (real): ");
                    a = sc.nextDouble();
                    System.out.println("Resultado: " + suma.acumulador(a));
                    break;
                case 5:
                    System.out.println("Reseteando acumulador");
                    suma.resetAcumulador();
                    break;
            }
        }
        while (sc.nextInt()!=6);
    }

}
