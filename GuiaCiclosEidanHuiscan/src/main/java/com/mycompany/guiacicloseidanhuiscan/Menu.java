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
public class Menu {

    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        
        int op, a, b;
        do {
            System.out.println("Seleccione una opcion:"); 
            System.out.println("1. Calcular metros, kilometros y centimetros.");
            System.out.println("2. Imprimir numeros del 1 al 10 usando un ciclo while.");
            System.out.println("3. Sumar numeros del 1 al 10 usando un ciclo while.");
            System.out.println("4. Verificar si un numero es par o impar.");
            System.out.println("5. Calcular el promedio de 30 numeros.");
            System.out.println("6. Imprimir numeros pares del 1 al 20 usando un ciclo while.");
            System.out.println("7. Sumar numeros impares del 1 al 400.");
            System.out.println("8. Calcular el area de un circulo.");
            System.out.println("9. Calcular el perimetro de un circulo.");
            System.out.println("10. Calcular el area de un rectangulo.");
            System.out.println("11. Calcular el volumen de una esfera.");
            System.out.println("12. Calcular area y perimetro de un cubo.");
            System.out.println("13. Imprimir numeros del 1 al 100, saltando multiplos de 3.");
            System.out.println("14. Imprimir numeros del 1 al 100, saltando multiplos de 5.");
            System.out.println("15. Imprimir numeros del 1 al 100, saltando multiplos de 3 y 5.");
            System.out.println("16. Imprimir numeros del 1 al 100, pero reemplazando multiplos de 3 por Cuek.");
            System.out.println("17. Calcular el factorial de un numero.");
            System.out.println("18. Contar la cantidad de digitos de un numero.");
            System.out.println("19. Calcular area y perimetro de un cuadrado.");
            System.out.println("20. Calcular la potencia de un numero.");
            System.out.println("0. Salir del programa.");
            
            while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un numero entero valido: ");
            scanner.next();
            }
            op = scanner.nextInt();
            switch (op) {
                case 1: 
                    Operaciones.calcularmedidas();
                    break;    
                case 2: 
                    Operaciones.imprimir1al10();
                    break; 
                case 3: 
                    Operaciones.sum1al10();
                    break; 
                case 4: 
                    Operaciones.verificarparimpar();
                    break; 
                case 5: 
                    Operaciones.calcularpromedio30();
                    break; 
                case 6: 
                    Operaciones.imprimirpares1al20();
                    break; 
                case 7: 
                    Operaciones.sumimpares1al400();
                    break; 
                case 8: 
                    Operaciones.calcularareacirc();
                    break; 
                case 9: 
                    Operaciones.calcularperimcirc();
                    break; 
                case 10: 
                    Operaciones.calculararearectangulo();
                    break; 
                case 11: 
                    Operaciones.calcularvolumenesfera();
                    break; 
                case 12: 
                    Operaciones.calcularareaperimcubo();
                    break; 
                case 13: 
                    Operaciones.imprimirsaltandomultiplos3();
                    break; 
                case 14: 
                    Operaciones.imprimirsaltandomultiplos5();
                    break; 
                case 15: 
                    Operaciones.imprimirsaltandomultiplos3y5();
                    break; 
                case 16: 
                    Operaciones.imprimirreemplazandomultiplos3PorCuek();
                    break; 
                case 17: 
                    Operaciones.calcularfactorial();
                    break; 
                case 18: 
                    Operaciones.contardigitosnumero();
                    break; 
                case 19: 
                    Operaciones.calcularareaperimcuad();
                    break; 
                case 20: 
                    Operaciones.calcularpotencia();
                    break; 
                case 0: 
                    System.out.println("Hasta luego");
                    break; 
                default: 
                    System.out.println("opcion invalida, por favor ingresar opcion valida.");
                
            }
        } while (op != 0);
        scanner.close();
    }

}