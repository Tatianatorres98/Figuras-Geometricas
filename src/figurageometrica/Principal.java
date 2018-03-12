/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rectangulo mirectangulo = new Rectangulo();
        Triangulo mitriangulo = new Triangulo();
        Cuadrado micuadrado = new Cuadrado();

        Scanner miscanner = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese opcion: \n1.Rectangulo \n2.Triangulo \n3.Cuadrado");
        opcion = miscanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese base del rectangulo");
                mirectangulo.setBase(miscanner.nextInt());
                System.out.println("Ingrese altura del rectangulo");
                mirectangulo.setAltura(miscanner.nextInt());
                mirectangulo.calcularArea();
                System.out.println("El área del rectangulo es:" + mirectangulo.getArea());
                mirectangulo.calcularPerimetro();
                System.out.println("El perímetro del rectangulo es:" + mirectangulo.getPerimetro());
                break;

            case 2:
                System.out.println("Ingrese base del triangulo");
                mitriangulo.setBase(miscanner.nextInt());
                System.out.println("Ingrese altura del triangulo");
                mitriangulo.setAltura(miscanner.nextInt());
                mitriangulo.calcularArea();
                System.out.println("El área del triangulo es:" + mitriangulo.getArea());
                mitriangulo.calcularPerimetro();
                System.out.println("El perímetro del triangulo es:" + mitriangulo.getPerimetro());
                break;

            case 3:
                System.out.println("Ingrese lado del cuadrado");
                micuadrado.setLado(miscanner.nextInt());
                micuadrado.calcularArea();
                System.out.println("El área del rectangulo es:" + micuadrado.getArea());
                micuadrado.calcularPerimetro();
                System.out.println("El perímetro del rectangulo es:" + micuadrado.getPerimetro());
                break;

        }

    }

}
