package day10;

import java.util.Scanner;
public class calc{
		int num1 ;
		int num2;
		public void add(int num1,int num2) {
			System.out.println("Addition :" +(num1+num2));
		}
		public void sub(int num1,int num2) {
			System.out.println("Subtraction :" +(num1-num2));
		}
		public void mult(int num1,int num2) {
			System.out.println("Multiplication :" +(num1*num2));
		}
		public void div(float num1,float num2) {
			System.out.println("division :" +(num1/num2));
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			calc cal = new calc();
			System.out.println("enter two number");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			cal.add(num1, num2);
			cal.sub(num1, num2);
			cal.mult(num1, num2);
			cal.div(num1, num2);
			
			
		}
		

	}

