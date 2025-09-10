package cote.exam14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        
        if(Num1 > 0 && Num2 > 0) System.out.println("1");
        else if (Num1 < 0 && Num2 > 0) System.out.println("2");
        else if (Num1 < 0 && Num2 < 0 ) System.out.println("3");
        else System.out.println("4");
        
        sc.close();
    }
}