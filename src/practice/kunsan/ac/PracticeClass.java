package practice.kunsan.ac;
import java.util.Scanner;
import java.util.Arrays;


public class PracticeClass {

	public static void practice1()	{	//���� �µ��� ȭ�� �µ��� ��ȯ
		double celsius = 31.5;
		System.out.println(String.format("����: %.2f", celsius));
		double fahrenheit = Util.celsiusToFahrenheit(celsius);
		System.out.println(String.format("����: %.2f", fahrenheit));
	}
	
	public static void practice2()	{	//1���� 100���� �ջ�
		int sum = 0;
		
		for(int i = 0; i <= 100; i++)	{
			sum += i;
		}
		
		System.out.println("�հ� : " + sum );
		
		/*	�����(��ǥ��)�� �����
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
		
		/*
		System.out.print("Enter line number: ");
		try(Scanner sc = new Scanner(system.in))	{	//try�� {}�ȿ� ������ �ǰ� ������ �ڵ����� close�� ����
			int count = sc.nextInt();
			
			for (int i = 0; i <count; i++)	{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	}
	
	public static void practice5()	{	// �Է¹��� ������ ������ ����ϱ�
		System.out.print("���� �Է�: ");
		Scanner scanIn = new Scanner(System.in);
		
		int score = scanIn.nextInt();
		scanIn.close();
		
		if (score >= 90)	{
			System.out.print("����: A");
		}
		
		else if (score >= 80)	{
			System.out.print("����: B");
		}
		
		else if (score >= 70)	{
			System.out.print("����: C");
		}
		
		else if (score >= 60)	{
			System.out.print("����: D");
		}
		
		else {
			System.out.print("����: F");
		}
		
		
	}
	
	public static void practice6()	{	//10���� �л��� ������ �̿��� �հ�� ����� ���� ����ϱ�
		int[] scores = {90, 75, 85, 95, 70, 75, 85, 85, 95, 72};
		double result = 0;
		
		for(int i = 0; i < scores.length; i++)	{
			result += scores[i];
		}
		double evg = result / scores.length;
		
		System.out.println("����: " + Arrays.toString(scores));
		System.out.println("�հ�: " + result);
		System.out.println("���: " + evg);
	}
	
	public static void practice7()	{	//5���� �л��� 3������ ������ �� �հ�� ����� ���� ����ϱ�
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
			
			System.out.println("ID=" + i + ": �հ�=" + sum + ", ���=" + String.format("%.2f", avg));
		}
	}
	
	public static void practice8()	{	//�빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ����ϱ�
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
	
	public static void practice9()	{	//"Hello World"�� ������ ��ȣȭ ����� ����� "Khoor Zroug"�� ����ϱ�
		String original = "Hello World";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < original.length(); i++)	{
			char c = original.charAt(i);
			if ((c >= 65 && c <= 90) || (c >= 97 && c<= 122)){
				c = (char)(c+3);
			}
			sb.append(c);
		}
	System.out.print("��ȣ: " + sb.toString());
	}
	
	public static int practice10(int[] data)	{	//������ ���� ���� �迭�� �޾Ƶ鿩, �� �հ踦 ���ϴ� �Լ��� �ۼ��� ����ϱ�
		int result = 0;
		for(int i=0; i < data.length; i++) {
			result += data[i];
		}
		return result;
	}
	
	public static int Add(int a, int b)	{	//2���� ���� ���� �޾Ƶ鿩 ������ �ϴ� �Լ�(practice11)
		return a+b;
	}
	public static int Substraction(int a, int b)	{	//2���� ���� ���� �޾Ƶ鿩 ������ �ϴ� �Լ�(practice11)
		return a-b;
	}
	public static int Multiplication(int a, int b)	{	//2���� ���� ���� �޾Ƶ鿩 ������ �ϴ� �Լ�(practice11)
		return a*b;
	}
	public static int Division(int a, int b)	{	//2���� ���� ���� �޾Ƶ鿩 �������� �ϴ� �Լ�(practice11)
		return a/b;
	}
	
	public static void practice12()	{	// �ﰢ�� �� ���� ���̸� �ְ� �ѷ��� ���̸� ����ϱ�
		Round triA = new Round();
		triA.Triangle(3, 4, 5);
		Round triB = new Round();
		triB.Triangle(3, 3, 3);
		triA.Draw(1);
		triB.Draw(2);
	}
	static class Round	{	//practice12�� �ѷ� ���ϰ� ����ϴ� Ŭ����
		private int A, B, C;
		public void Triangle(int a, int b, int c) {
			A = a;
			B = b;
			C = c;
		}
		public void Draw(int index)	{
			int result = A + B + C;
			System.out.println("�ﰢ��" + index + ": A=" + A + " B=" + B + " C=" + C);
			System.out.println("�ѷ�����: " + result);
		}
	}
	
	public static void practice13()	{	// �������� ���ؼ� ����
		
	}
	/*
	class Calculater<T> {	//	practice13�� ���̴� ���� (C#�� dynamic�� �������� ����)
		@SuppressWarnings("unchecked")
		public void Add(T a, T b) {
			T A = a;
			T B = b;
			
			T sum = A + B;
		}
	}
	*/
	
	public static void practice14()	{	//�ڵ����� �ӵ��� ����� ����ϱ�
		Car car = new Car("Via");
		System.out.println("�ڵ��� �̸�: "+ car.Name);
		car.Start();
		System.out.println("���۽� �ӵ�: "+ car.speed);
		car.Accelerate(10);
		System.out.println("���� 1�ܰ� �ӵ�: "+ car.speed);
		car.Accelerate(20);
		System.out.println("���� 2�ܰ� �ӵ�: "+ car.speed);
		car.Stop();
		System.out.println("������ �ӵ�: "+ car.speed);
	}
	
	static class Car {	//practice14�� ���̴� Car class
		private int speed;
		
		public String Name;
		public String Maker;
		public String Model;
		public int Speed;
		
		public void setSpeed(int Speed) {
			this.speed = Speed;
		}
		public Car(String car_name) {
			this.Name = car_name;
		}
		
		public void Start() {
			speed = 1;
		}

		public void Stop() {
			speed = 0;
		}

		public void Accelerate(int value) {
			speed += value;
		}

		public void Break(int value) {
			speed -= value;
		}
	}
	
	
}

