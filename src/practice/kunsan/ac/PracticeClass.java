package practice.kunsan.ac;

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

}
