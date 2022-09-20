package aula1;

import java.util.Scanner;

/**
 *
 * @author nvxfontes
 */

/*
*   Faça um programa que leia tres coordenadas num espaço 2d e indique se formam um triangulo
*   juntamente com seu tipo (equilatero, isosceles e escaleno)
*   - equilatero: todos os lados iguais
*   - isosceles: dois lados iguais
*   - escaleno: todos os lados diferentes
*/

public class ProblemaTriangulo {
    public static void main(String[] args) {
        
        int coord1, coord2, coord3;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o valor do primeiro lado: ");
        coord1 = scan.nextInt();
        
        System.out.print("Informe o valor do segundo lado: ");
        coord2 = scan.nextInt();
        
        System.out.print("Informe o valor do terceiro lado: ");
        coord3 = scan.nextInt();
        
        if(coord1+coord2 > coord3 && coord1+coord3 > coord2 && coord3+coord2 > coord1) {
            if(coord1 == coord2 & coord1 == coord3) {
                System.out.println("O triangulo eh equilatero");
            } else if(coord1 == coord2 || coord1 == coord3 || coord2 == coord3) {
                System.out.println("O triangulo eh isosceles");
            } else {
                System.out.println("O triangulo eh escaleno");
            }
        } else {
            System.out.println("Os valores nao formam um triangulo");
        }
    }
}
