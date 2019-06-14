package practice.kunsan.ac;
import java.util.Scanner;
import java.util.Arrays;


public class PracticeClass {

	public static void practice1()	{	//섭씨 온도를 화씨 온도로 변환
		double celsius = 31.5;
		System.out.println(String.format("섭씨: %.2f", celsius));
		double fahrenheit = Util.celsiusToFahrenheit(celsius);
		System.out.println(String.format("섭씨: %.2f", fahrenheit));
	}
	
	public static void practice2()	{	//1부터 100까지 합산
		int sum = 0;
		
		for(int i = 0; i <= 100; i++)	{
			sum += i;
		}
		
		System.out.println("합계 : " + sum );
		
		/*	강사님(대표님)이 만든거
		int m = 1;
		final int MAX_VALUE = 100;
		int sum = 0;
		
		while(m < MAX_VALUE + 1)
		{
			sum += m;
			m++;
		}
		
		String outString = "Sum of numbers : " + sum;
		System.out.println(outString);
		*/
		 
	}
	
	public static void practice3()	{	//2단부터 9단까지의 구구단을 이중 포문을 이용해 출력
		for(int i = 2; i < 10; i++)	{
			System.out.println("**" + i + "**" );
			for(int j = 1; j < 10; j++)	{
				System.out.println(i + "x" + j + "=" + i*j );
			}
			System.out.println();
		}
	}
	
	public static void practice4()	{	// 입력받은 number만큼의 별표 출력하기
		System.out.print("Enter line number: ");
		
		Scanner scanIn = new Scanner(System.in); 
		
		int number = scanIn.nextInt();
		scanIn.close();
		
		for(int i = 1; i <= number; i++)	{
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		System.out.print("Enter line number: ");
		try(Scanner sc = new Scanner(system.in))	{	//try는 {}안에 실행이 되고 끝나면 자동으로 close를 해줌
			int count = sc.nextInt();
			
			for (int i = 0; i <count; i++)	{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	}
	
	public static void practice5()	{	// 입력받은 점수의 학점을 계산하기
		System.out.print("점수 입력: ");
		Scanner scanIn = new Scanner(System.in);
		
		int score = scanIn.nextInt();
		scanIn.close();
		
		if (score >= 90)	{
			System.out.print("학점: A");
		}
		
		else if (score >= 80)	{
			System.out.print("학점: B");
		}
		
		else if (score >= 70)	{
			System.out.print("학점: C");
		}
		
		else if (score >= 60)	{
			System.out.print("학점: D");
		}
		
		else {
			System.out.print("학점: F");
		}
		
		
	}
	
	public static void practice6()	{	//10명의 학생의 점수를 이용해 합계와 평균을 구해 출력하기
		int[] scores = {90, 75, 85, 95, 70, 75, 85, 85, 95, 72};
		double result = 0;
		
		for(int i = 0; i < scores.length; i++)	{
			result += scores[i];
		}
		double evg = result / scores.length;
		
		System.out.println("점수: " + Arrays.toString(scores));
		System.out.println("합계: " + result);
		System.out.println("평균: " + evg);
	}
	
	public static void practice7()	{	//5명의 학생의 3과목의 점수의 각 합계와 평균을 구해 출력하기
		int[][] scores = {
			{90, 80, 80},
			{85, 85, 95}, 
			{95, 70, 75}, 
			{80, 80, 90}, 
			{90, 75, 80}
			};
		
		for(int i = 0; i < scores.length; i++)	{
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++)	{
				sum += scores[i][j];	
			}
			//double avg = (double) sum / 3;
			double avg = sum / 3.0;
			
			System.out.println("ID=" + i + ": 합계=" + sum + ", 평균=" + String.format("%.2f", avg));
		}
	}
	
	public static void practice8()	{	//대문자는 소문자로, 소문자는 대문자로 변환해 출력하기
		String output = "Hello, World";
		String result = "";
		
		for (int i = 0; i < output.length(); i++) {
			char c = output.charAt(i);
			if (c >= 65 && c <= 90) {
				result += String.valueOf(c).toLowerCase();
			}
			else if (c >= 97 && c <= 122) {
				result += String.valueOf(c).toUpperCase();
			}
			else {
				result += c;
			}
		}

		System.out.println(output);
		System.out.println(result);
	}
	
	public static void practice9()	{	//"Hello World"를 시저의 암호화 기법을 사용해 "Khoor Zroug"로 출력하기
		String original = "Hello World";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < original.length(); i++)	{
			char c = original.charAt(i);
			if ((c >= 65 && c <= 90) || (c >= 97 && c<= 122)){
				c = (char)(c+3);
			}
			sb.append(c);
		}
	System.out.print("암호: " + sb.toString());
	}
	
	public static int practice10(int[] data)	{	//임의의 정수 값을 배열로 받아들여, 그 합계를 구하는 함수를 작성후 출력하기
		int result = 0;
		for(int i=0; i < data.length; i++) {
			result += data[i];
		}
		return result;
	}
}

