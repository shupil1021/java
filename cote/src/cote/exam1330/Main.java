package cote.exam1330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        
        if(Num1 > Num2) System.out.println(">");
        else if(Num1 < Num2) System.out.println("<");
        else System.out.println("==");
        
        sc.close();
    }
}