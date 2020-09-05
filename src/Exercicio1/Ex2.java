package Exercicio1;
import java.util.Scanner;

public class Ex2 {
    public static void main (String [] args){
        Scanner le = new Scanner(System.in);
        
        double pi = 3.14159, raio, area;
        
        System.out.print("");
        raio = le.nextDouble();
        
        area = pi * Math.pow(raio,2);
        
        System.out.printf("A=%.4f%n",area);
        
    }
}
