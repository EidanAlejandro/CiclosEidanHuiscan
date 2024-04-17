/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacicloseidanhuiscan;
import java.util.Scanner;
/**
 *
 * @author eidan
 */
public class Operaciones {
    public static void calcularmedidas() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese la medida en centímetros: ");
            int medida = scanner.nextInt();
            int kilometros = medida / 100000;
            int metros = (medida % 100000) / 100;
            int centimetros = medida % 100;
            System.out.println(medida + " son " + kilometros + " kilómetros, " + metros + " metros y " + centimetros + " centímetros.");

            System.out.print("Desea calcular nuevamente? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');      
    }
    public static void imprimir1al10() {
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
    }
    public static void sum1al10() {
        int suma = 0;
        int num = 1;
        while (num <= 10) {
            suma += num;
            num++;
        }
        System.out.println("La suma de los numeros del 1 al 10 es: " + suma);
    }

    public static void verificarparimpar() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                System.out.println(numero + " es  par.");
            } else {
                System.out.println(numero + " es  impar.");
            }

            System.out.print("Desea ingresar otro numero? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
        
    }

    public static void calcularpromedio30() {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        for (int i = 1; i <= 30; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            suma += scanner.nextDouble();
        }
        double promedio = suma / 30;
        System.out.println("El promedio de los 30 numeros ingresados es: " + promedio);        
    }
    public static void imprimirpares1al20() {
        int num = 2; 
        while (num <= 20) {
            System.out.println(num);
            num += 2; 
        }
    }
    public static void sumimpares1al400() {
        int suma = 0;
        int num = 1;
        while (num <= 400) {
            suma += num;
            num += 2; 
        }
        System.out.println("La suma de los numeros impares del 1 al 400 es: " + suma);
    }
    public static void calcularareacirc() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese el radio del circulo: ");
            double radio = scanner.nextDouble();
            if (radio > 0) {
                double area = Math.PI * radio * radio;
                System.out.println("El area del circulo es: " + area);
            } else {
                System.out.println("El radio del circulo debe ser un valor positivo.");
            }

            System.out.print("Desea calcular el area de otro circulo? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }

    public static void calcularperimcirc() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese el radio del circulo: ");
            double radio = scanner.nextDouble();
            if (radio > 0) {
                double perimetro = 2 * Math.PI * radio;
                System.out.println("El perimetro del circulo es: " + perimetro);
            } else {
                System.out.println("El radio del circulo debe ser un valor positivo.");
            }

            System.out.print("Desea calcular el perímetro de otro círculo? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }

    public static void calculararearectangulo() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese la base del rectangulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del rectangulo: ");
            double altura = scanner.nextDouble();
            if (base > 0 && altura > 0) {
                double area = base * altura;
                System.out.println("El area del rectangulo es: " + area);
            } else {
                System.out.println("Tanto la base como la altura del rectangulo deben ser valores positivos.");
            }

            System.out.print("Desea calcular el área de otro rectangulo? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }

    public static void calcularvolumenesfera() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese el radio de la esfera: ");
            double radio = scanner.nextDouble();
            if (radio > 0) {
                double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
                System.out.println("El volumen de la esfera es: " + volumen);
            } else {
                System.out.println("El radio de la esfera debe ser un valor positivo.");
            }

            System.out.print("Desea calcular el volumen de otra esfera? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }

    public static void calcularareaperimcubo() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese la longitud de un lado del cubo: ");
            double lado = scanner.nextDouble();
            if (lado > 0) {
                double area = 6 * lado * lado;
                double perimetro = 12 * lado;
                System.out.println("El area del cubo es: " + area);
                System.out.println("El perímetro del cubo es: " + perimetro);
            } else {
                System.out.println("La longitud de un lado del cubo debe ser un valor positivo.");
            }

            System.out.print("Desea calcular el area y perímetro de otro cubo? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }
    public static void imprimirsaltandomultiplos3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void imprimirsaltandomultiplos5() {
        int num = 1;
        while (num <= 100) {
            if (num % 5 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }
    public static void imprimirsaltandomultiplos3y5() {
        int num = 1;
        while (num <= 100) {
            if (num % 3 != 0 && num % 5 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }
    public static void imprimirreemplazandomultiplos3PorCuek() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Cuek");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void calcularfactorial() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese un numero para calcular su factorial: ");
            int numero = scanner.nextInt();
            int factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);

            System.out.print("Desea calcular el factorial de otro numero? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }

    public static void contardigitosnumero() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese un numero para contar sus digitos: ");
            int numero = scanner.nextInt();
            int contador = 0;
            while (numero != 0) {
                numero /= 10;
                contador++;
            }
            System.out.println("El número ingresado tiene " + contador + " digitos.");

            System.out.print("Desea contar los dígitos de otro número? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }

    public static void calcularareaperimcuad() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese el lado del cuadrado: ");
            double lado = scanner.nextDouble();
            if (lado > 0) {
                double area = lado * lado;
                double perimetro = 4 * lado;
                System.out.println("El area del cuadrado es: " + area);
                System.out.println("El perimetro del cuadrado es: " + perimetro);
            } else {
                System.out.println("El lado del cuadrado debe ser un valor positivo.");
            }

            System.out.print("Desea calcular el area y perímetro de otro cuadrado? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }

    public static void calcularpotencia() {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        do {
            System.out.print("Ingrese la base: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese el exponente: ");
            int exponente = scanner.nextInt();
            if (base > 0 && exponente > 0) {
                double resultado = 1;
                for (int i = 0; i < exponente; i++) {
                    resultado *= base;
                }
                System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
            } else {
                System.out.println("Tanto la base como el exponente deben ser valores positivos.");
            }

            System.out.print("Desea calcular otra potencia? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }
}
