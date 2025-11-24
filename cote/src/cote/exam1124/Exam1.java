package cote.exam1124;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        try {
            int num1 = input.nextInt(); 
            int num2 = input.nextInt();     
            int sum = num1 + num2;
            System.out.printf(num1 + "+" + num2 + "=" + sum);

        } catch (InputMismatchException e) {
            System.out.println("정수 형식만 입력해야 합니다.");
            
        } finally {
        	input.close();
        }
	}
}
