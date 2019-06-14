package practice.kunsan.ac;
import java.util.Scanner;


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
		
		if (score >= 90){
			System.out.print("학점: A");
		}
		
		else if (score >= 80){
			System.out.print("학점: B");
		}
		
		else if (score >= 70){
			System.out.print("학점: C");
		}
		
		else if (score >= 60){
			System.out.print("학점: D");
		}
		
		else {
			System.out.print("학점: F");
		}
	}
}

