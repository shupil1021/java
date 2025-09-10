package cote.exam1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        
        System.out.println(Num1 - Num2);
        
        sc.close();
    }
}