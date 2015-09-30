/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seřazení.tří.čísel;

import java.util.Scanner;

/**
 *
 * @author david.lukes1
 */
public class SeřazeníTříČísel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.print("zadej 1. číslo: ");
        int a = vstup.nextInt();
        System.out.print("zadej 2. číslo: ");
        int b = vstup.nextInt();
        System.out.print("zadej 3. číslo: ");
        int c = vstup.nextInt();
        
        
        if (a>b) {
            int pom = a;
            a = b;
            b = pom;
        }
        if (b>c) {
            int pom = b;
            b = c;
            c = pom;
        }
        if (a>b) {
            int pom = a;
            a = b;
            b = pom;
        }    
    }
       System.out.println("seřazení: "+a+" "+b""+c);
}
