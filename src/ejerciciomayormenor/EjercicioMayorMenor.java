/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomayormenor;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class EjercicioMayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("FORMA 1 DE RESOLVERLO: ");
        System.out.println("=======================");
        System.out.println("Introduzca un número: ");
        int num = ent.nextInt();
        if(num<=5){
            System.out.println("True");
            System.out.println("Es menor o igual que cinco");
        }else{
            System.out.println("False");
            System.out.println("Es mayor que cinco");
        }
        
        System.out.println("OTRA FORMA DE RESOLVERLO: ");
        System.out.println("==========================");
        Scanner en = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        var numero = ent.nextInt();
        
        var mensaje = (numero > 5) ? "False" : "True";
        System.out.println(mensaje);
    }
    
}
