/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seřazení.tří.čísel;

import static java.time.Clock.system;

/**
 *
 * @author david.lukes1
 */
public class SeřazeníTříČísel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;
        
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
