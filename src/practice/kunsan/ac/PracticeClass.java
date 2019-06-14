package practice.kunsan.ac;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;


public class PracticeClass {

	public static void practice1()	{	//섭씨 온도를 화씨 온도로 변환
		double c = 31.5;
		System.out.println("섭씨: " + c );
		double f = (c * 9/5) + 32;
		System.out.println("화씨: " + f );
	}
	
	public static void practice2()	{	//1부터 100까지 합산
		int sum = 0;
		
		for(int i = 0; i <= 100; i++)	{
			sum += i;
		}
		
		System.out.println("합계 : " + sum );
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
}

