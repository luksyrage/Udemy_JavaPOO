
package Exercicio1;
import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args){
        Scanner le = new Scanner(System.in);
        
        int a1, b, c, d;
        
        System.out.print("");
        a1 = le.nextInt();
        b = le.nextInt();
        c = le.nextInt();
        d = le.nextInt();
        
        int a1b = a1*b;
        int cd = c*d;
        
        int dif = a1b - cd;
        
        System.out.println("DIFERENCA = " + dif);
                
    }
}
