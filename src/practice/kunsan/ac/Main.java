package practice.kunsan.ac;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		//PracticeClass.practice9();
		
		/*// Practice #10 - 메인 함수
		int[] a = { 80, 90, 95, 75, 70 };
        int[] b = { 90, 85, 85, 85, 80 };
        
        int sumA = PracticeClass.practice10(a);
        int sumB = PracticeClass.practice10(b);
        
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("Sum<A> = " + sumA);
        System.out.println("B: " + Arrays.toString(b));
        System.out.println("Sum<B> = " + sumB);
        */
		
		//Practice #11 - 메인 함수
		int a = 3, b = 5, c = 2, d = 3;
		int add = PracticeClass.Add(a, b);
		int sub = PracticeClass.Substraction(add, c);
		int mul = PracticeClass.Multiplication(sub, c);
		int div = PracticeClass.Division(mul, d);
		
		System.out.println("(" + a + " + " + b + " - " + c + ") x " + c + " / " + d + " = " + div);
	}

}
