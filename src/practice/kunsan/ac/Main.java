package practice.kunsan.ac;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		//PracticeClass.practice9();
		
		// Practice #10 - ���� �Լ�
		int[] a = { 80, 90, 95, 75, 70 };
        int[] b = { 90, 85, 85, 85, 80 };
        
        int sumA = PracticeClass.practice10(a);
        int sumB = PracticeClass.practice10(b);
        
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("Sum<A> = " + sumA);
        System.out.println("B: " + Arrays.toString(b));
        System.out.println("Sum<B> = " + sumB);
	}

}
