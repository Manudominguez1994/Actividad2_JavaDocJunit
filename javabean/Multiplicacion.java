package javabean;
 import java.util.Scanner;

/**
	 * Metodos que proporcionan la operacion MULTIPLICAR a la CALCULADORA
	 * Metodo para multiplicar dos numeros reales.
	 * Metodo para multiplicar dos numeros enteros.
	 * Metodo para multiplicar tres numeros reales.
	 * Metodo para acumular variables a multiplicar.
	 * @author Alejandro Camps Márquez
	 * github:https://github.com/alexcm8
	 * @version 1.0
	 */
		 
public class Multiplicacion {

    private double valorAcumulado;

    public Multiplicacion() {
        this.valorAcumulado = 0;
    }

    /**
     * @param a variable de numero real 1 de la operacion
     * @param b variable de numero real 2 de la operacion
     * @return multiplicacion de variables reales "a" * "b"
     * @error si a o b es negativo aparece "Valor invalido"
     */
    public static double multiDosReales(double a, double b) {
        if (a < 0 || b < 0) {
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return a * b;
    }

    /**
     * @param a variable de numero entero 1 de la operacion
     * @param b variable de numero entero 2 de la operacion
     * @return multiplcación de variables enteras "a" * "b"
     * @error si a o b es negativo aparece "Valor invalido"
     */
    public static int multiDosEnteros(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return a * b;
    }
    /**
     * @param a variable de numero real 1 de la operacion
     * @param b variable de numero real 2 de la operacion
     * @param c variable de numero real 3 de la operacion
     * @return multiplicación de variables reales "a" * "b"* "c"
     * @error si a, b o c es negativo aparece "Valor invalido"
     */
    public static double multiTresReales(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return a * b * c;
    }
    /**
     * @param a variable de numero real 1 de la operacion
     * @valorAcumulado
     * @return el resultado del valorAcumulado * a
     * @error Si a es menor que 0 la operacion no se hara
     */
    public double acumulador(double a){
        if (a < 0){
            System.out.println("Valor invalido, estas introduciendo un valor negativo");
        }
        return this.valorAcumulado * a;
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
        Multiplicacion multiplicacion = new Multiplicacion();
        do{
            System.out.println("\n MENU MULTIPLICACION");
            System.out.println("1. Multiplicar 2 numeros reales");
            System.out.println("2. Multiplicar 2 numeros enteros");
            System.out.println("3. Multiplicar 3 numeros reales");
            System.out.println("4. Multiplicar con valor acumulado");
            System.out.println("5. Reset acumulador");
            System.out.println("6. Salir");

            numero = sc.nextInt();

            switch(numero){
                case 1:
                    System.out.println("Introduce el primer numero (real): ");
                    a = sc.nextDouble();
                    System.out.println("Introduce el segundo numero (real): ");
                    b = sc.nextDouble();
                    System.out.println("Resultado: " + Multiplicacion.multiDosReales(a, b));
                    break;
                case 2:
                    System.out.println("Introduce el primer numero (entero): ");
                    x = sc.nextInt();
                    System.out.println("Introduce el segundo numero (entero): ");
                    y = sc.nextInt();
                    System.out.println("Resultado: " + Multiplicacion.multiDosEnteros(x, y));
                    break;
                case 3:
                    System.out.println("Introduce el primer numero (real): ");
                    a = sc.nextDouble();
                    System.out.println("Introduce el segundo numero (real): ");
                    b = sc.nextDouble();
                    System.out.println("Introduce el tercer numero (real): ");
                    c = sc.nextDouble();
                    System.out.println("Resultado: " + Multiplicacion.multiTresReales(a, b, c));
                    break;
                case 4:
                    System.out.println("Si introduces un numero negativo finaliza la operacion");
                    System.out.println("Introduce un numero (real): ");
                    a = sc.nextDouble();
                    System.out.println("Resultado: " + multiplicacion.valorAcumulado);
                    break;
                case 5:
                    System.out.println("Reseteando acumulador");
                    multiplicacion.resetAcumulador();
                    break;
            }
        }
        while (sc.nextInt()!=6);
        
        
    }




 {
 } 
}
