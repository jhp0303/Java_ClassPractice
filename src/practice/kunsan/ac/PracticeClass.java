package practice.kunsan.ac;
import java.util.Scanner;


public class PracticeClass {

	public static void practice1()	{	//���� �µ��� ȭ�� �µ��� ��ȯ
		double c = 31.5;
		System.out.println("����: " + c );
		double f = (c * 9/5) + 32;
		System.out.println("ȭ��: " + f );
	}
	
	public static void practice2()	{	//1���� 100���� �ջ�
		int sum = 0;
		
		for(int i = 0; i <= 100; i++)	{
			sum += i;
		}
		
		System.out.println("�հ� : " + sum );
	}
	
	public static void practice3()	{	//2�ܺ��� 9�ܱ����� �������� ���� ������ �̿��� ���
		for(int i = 2; i < 10; i++)	{
			System.out.println("**" + i + "**" );
			for(int j = 1; j < 10; j++)	{
				System.out.println(i + "x" + j + "=" + i*j );
			}
			System.out.println();
		}
	}
	
	public static void practice4()	{	// �Է¹��� number��ŭ�� ��ǥ ����ϱ�
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
	
	public static void practice5()	{	// �Է¹��� ������ ������ ����ϱ�
		System.out.print("���� �Է�: ");
		Scanner scanIn = new Scanner(System.in);
		
		int score = scanIn.nextInt();
		scanIn.close();
		
		if (score >= 90){
			System.out.print("����: A");
		}
		
		else if (score >= 80){
			System.out.print("����: B");
		}
		
		else if (score >= 70){
			System.out.print("����: C");
		}
		
		else if (score >= 60){
			System.out.print("����: D");
		}
		
		else {
			System.out.print("����: F");
		}
	}
}

