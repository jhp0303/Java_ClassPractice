package practice.kunsan.ac;

public class PracticeClass {

	public static void practice1()	{	//¼·¾¾ ¿Âµµ¸¦ È­¾¾ ¿Âµµ·Î º¯È¯
		double c = 31.5;
		System.out.println("¼·¾¾: " + c );
		double f = (c * 9/5) + 32;
		System.out.println("È­¾¾: " + f );
	}
	
	public static void practice2()	{	//1ºÎÅÍ 100±îÁö ÇÕ»ê
		int sum = 0;
		
		for(int i = 0; i <= 100; i++)	{
			sum += i;
		}
		
		System.out.println("ÇÕ°è : " + sum );
	}

}
