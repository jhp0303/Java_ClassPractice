package practice.kunsan.ac;

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

}
