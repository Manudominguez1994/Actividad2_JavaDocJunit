package javabean;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
       do {
           System.out.println(" Que operacion quieres hacer, selecciona un numero \n");
           System.out.println("1. Operaciones de suma");
           System.out.println("2. Operaciones de resta");
           System.out.println("3. Operaciones de multiplicacion");
           System.out.println("4. Operaciones de division");
           System.out.println("5. Salir, bye bye baby");


           numero = sc.nextInt();

           switch (numero) {
               case 1:
                   //Suma.menu();
                   break;
               case 2:
                  // Resta.menu();
                   break;
               case 3:
                  // Producto.menu();
                   break;
               case 4:
                   Cociente.menu();
                   break;
           }
       }while(sc.nextInt()!=5);
    }
}
