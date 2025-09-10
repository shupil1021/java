package cote.exam2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt();
        
        if(Num % 4 == 0 && Num % 100 != 0 || Num % 400 == 0) {
            System.out.println("1");
        }
        else System.out.println("0");
        
        sc.close();
    }
}