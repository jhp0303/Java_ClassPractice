package practice.kunsan.ac;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
	
	public static int Add(int a, int b)	{	//2개의 정수 값을 받아들여 덧셈을 하는 함수(practice11)
		return a+b;
	}
	public static int Substraction(int a, int b)	{	//2개의 정수 값을 받아들여 뺄셈을 하는 함수(practice11)
		return a-b;
	}
	public static int Multiplication(int a, int b)	{	//2개의 정수 값을 받아들여 곱셈을 하는 함수(practice11)
		return a*b;
	}
	public static int Division(int a, int b)	{	//2개의 정수 값을 받아들여 나눗셈을 하는 함수(practice11)
		return a/b;
	}
	
	public static void practice12()	{	// 삼각형 세 변의 길이를 주고 둘레의 길이를 출력하기
		Round triA = new Round();
		triA.Triangle(3, 4, 5);
		Round triB = new Round();
		triB.Triangle(3, 3, 3);
		triA.Draw(1);
		triB.Draw(2);
	}
	static class Round	{	//practice12의 둘레 구하고 출력하는 클래스
		private int A, B, C;
		public void Triangle(int a, int b, int c) {
			A = a;
			B = b;
			C = c;
		}
		public void Draw(int index)	{
			int result = A + B + C;
			System.out.println("삼각형" + index + ": A=" + A + " B=" + B + " C=" + C);
			System.out.println("둘레길이: " + result);
		}
	}
	
	public static void practice13()	{	// 내힘으로 못해서 실패
		
	}
	/*
	class Calculater<T> {	//	practice13에 쓰이는 계산기 (C#의 dynamic을 구현하지 못함)
		@SuppressWarnings("unchecked")
		public void Add(T a, T b) {
			T A = a;
			T B = b;
			
			T sum = A + B;
		}
	}
	*/
	
	public static void practice14()	{	//자동차의 속도를 계산해 출력하기
		Car car = new Car("Via");
		System.out.println("자동차 이름: "+ car.Name);
		car.Start();
		System.out.println("시작시 속도: "+ car.speed);
		car.Accelerate(10);
		System.out.println("엑셀 1단계 속도: "+ car.speed);
		car.Accelerate(20);
		System.out.println("엑셀 2단계 속도: "+ car.speed);
		car.Stop();
		System.out.println("정지후 속도: "+ car.speed);
	}
	
	static class Car {	//practice14에 쓰이는 Car class
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
	
	public static void practice15()	{
		MyPaint paint = new MyPaint(); 
		
		TriangleDraw t = new TriangleDraw(3,4,5);
		paint.DrawShape(t);
		System.out.println();
		
		RectangleDraw r = new RectangleDraw(5,10);
		paint.DrawShape(r);
		System.out.println();
		
		CustomShapeDraw c = new CustomShapeDraw(5,10,2,2);
		paint.DrawShape(c);
	}
	
	public interface IDrawable{	// Draw메소드를 가지는 IDrawable 인터페이스
		void Draw();
	}
	
	static class MyPaint {
		List<IDrawable> drawables = new ArrayList<IDrawable>();	//한번 출력한것을 또 출력해주기 위해서 list 작성

		public void DrawShape(IDrawable shape) {	//	생성했던 도형클래스들을 저장하는 메서드
			drawables.add(shape);

			for (IDrawable drawable : drawables) {	//	foreach문과 동일 ( : = in)
				drawable.Draw();
			}
		}
	}
	
	static class TriangleDraw implements IDrawable {
		private int A, B, C;

		public TriangleDraw(int a, int b, int c) {
			A = a;
			B = b;
			C = c;
		}

		public void Draw() {
			System.out.println("Draw triangle(" + A + "," + B + "," + C + ")");
		}
	}
	static class RectangleDraw implements IDrawable {
		private int w, h;

		public RectangleDraw(int Width, int Height) {
			w = Width;
			h = Height;
		}

		public void Draw() {
			System.out.println("Draw Rectangle(" + w + ", " + h + ")");
		}
	}
	static class CustomShapeDraw implements IDrawable {
		private int w, h, x, y;

		public CustomShapeDraw(int Width, int Height, int X, int Y) {
			w = Width;
			h = Height;
			x = X;
			y = Y;
		}

		public void Draw() {
			System.out.println("Draw triangle(" + w + ", " + h + ", " + x + ", " + y + ")");
		}
	}
	
	public static void practice16() {
		FullTimeEmployee fe = new FullTimeEmployee("Via", 1000000);
		fe.AnnualSalary = 10000;
		fe.AdjustSalary(-100);
		System.out.println(fe.Name+"'s annual salary is "+ fe.AnnualSalary);
		fe.SayName();
		
		PartTimeEmployee pe = new PartTimeEmployee("Kisun");
		pe.hourlyRate = 10;
		int workhour = 8;
		int totalpayment = pe.CalculatePay(workhour);
		System.out.println(pe.Name+"'s work hour is "+ workhour + ", total payment is "+ totalpayment);
		pe.SayName();
	}
	static class Employee{
		public String Name;
		public String Email;
		
		public Employee(String name) {
			this.Name = name;
		}
		
		public void SayName() {
			System.out.println("My Name is "+Name);
		}
	}
	
	static class FullTimeEmployee extends Employee	{
		private int EmployeePay;
		public int getEmployeePay() {
			return EmployeePay;
		}
		
		public FullTimeEmployee(String name, int number) {
			super(name);
			EmployeePay = number;
		}
		public int AnnualSalary;
		public int getAnnualSalary() {
			return AnnualSalary;
		}
		public void AdjustSalary(int amount) {
			this.AnnualSalary += amount;
		}
		
		public void SayName() {
			System.out.println("My Payment is "+ EmployeePay + " / name is "+ Name);
		}
	}
	
	static class PartTimeEmployee extends Employee	{
		public PartTimeEmployee(String name) {
			super(name);
		}
		public int hourlyRate;
		public int gethourlyRate() {
			return hourlyRate;
		}
		public int CalculatePay(int time) {
			return hourlyRate * time;
		}
		
		public void SayName() {
			//super.SayName();	//C#의 base.SayName(); 과 동일
			System.out.println("I'm part-time employeer. My name is "+ Name);
		}
	}
}

