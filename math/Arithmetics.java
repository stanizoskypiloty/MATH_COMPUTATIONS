package math;

import java.util.Scanner;

class Addition {
	int i;
	int j;
	int add;

	public int Add(int a, int b) {
		add = a + b;
		return add;

	}

}

class Mulitiplcation {
	int i;
	int j;
	int mul;

	public int Mul(int a, int b) {
		mul = a * b;
		return mul;

	}

}

class Division {
	int i;
	int j;
	int div;

	public int Div(int e, int f) {
		div = e / f;
		return div;
	}

}
class Subtraction {

	int k;
	int l;
	int sub;

	public int Sub(int c, int d) {
		sub = c - d;
		return sub;
	}
}

class Rectangle {
	int l;
	int w;
	int per;

	public int per(int l, int w) {
		per = 2 * (l + w);
		return per;
	}
}

class Circle{
	double r;
	double pi=3.142;
	double area;
	 public double area(double r) {
		 double d = pi*r;
		 area= d*r;
		 return area;
	 }
}
	
class Triangle{
	int y;
	int h;
	int area;

	public int tri(int y, int h){
		area = (int) (0.5 * y * h);
		return area;

	}
}
	
class CirclePerimeter
{
	double circ, pi = 3.142;
	public double circumfrence(double radius)
	{
		circ = pi * (radius * 2);
		return circ;
	}
}

class CirclePeri {
	double pi=3.142;
	double r;
	double per;
	public double per(double r) {
		double d=2*r;
		per=pi*d;
		return per;
	}
}
public class Arithmetics {

	public static void main(String[] args) {
		boolean isRunning = true;
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);

		while (isRunning) {
			System.out.println(("1. Addition"));
			System.out.println(("2. Subtraction"));
			System.out.println(("3. Multiplication"));
			System.out.println(("4. Division"));
			System.out.println("5. Rectangle Perimeter");
			System.out.println("6. Triangle Area");
			System.out.println("7. Circle Area");
			System.out.println("8. Circle Perimeter");
			System.out.println("9. Circle Peri");
			System.out.println("10. Exit");
			System.out.println("Welcome to Arithmetics, Choose an option:");

			int option = sc.nextInt();

			switch (option) {
				case 1:
					System.out.println("Enter first number:");
					int a = sc.nextInt();
					System.out.println("Enter second number:");
					int b = sc.nextInt();
					Addition add = new Addition();
					int results = add.Add(a, b);
					System.out.println("The sum is" + " " + results);
					break;

				case 2:

					System.out.println("Enter first number");
					int c = sc.nextInt();
					System.out.println("Enter the second number");
					int d = sc.nextInt();
					Subtraction sub = new Subtraction();
					int result = sub.Sub(c, d);
					System.out.println("Your answer is" + result);
					break;


				case 3:
					System.out.println("Enter the first number");
					int x = sc.nextInt();
					System.out.println("Enter the second number");
					int j = sc.nextInt();
					Mulitiplcation mult = new Mulitiplcation();
					int ans = mult.Mul(x, j);
					System.out.println("Result:" + ans);
					break;

				case 4:
					System.out.println("Enter the first number");
					int e = sc.nextInt();
					System.out.println("Enter the second number");
					int f = sc.nextInt();
					Division div = new Division();
					int answer = div.Div(e, f);
					System.out.println("Result:" + answer);
					break;

				case 5:
					System.out.println("Enter the length of the rectangle");
					int l = sc.nextInt();
					System.out.println("Enter the width of the rectangle");
					int w = sc.nextInt();
					Rectangle rec = new Rectangle();
					int perimeter = rec.per(l, w);
					System.out.println("The perimeter of the rectangle is" + " " + perimeter);
					break;

				case 6:
					System.out.println("Enter the base:");
					int y = sc.nextInt();
					System.out.println("Enter the height:");
					int h = sc.nextInt();
					Triangle tr = new Triangle();
					System.out.println("The area of the triangle is" + " " + tr.tri(y, h));
					break;

				case 7:
					System.out.println("Enter the radius:");
					int r = sc.nextInt();
					Circle cir = new Circle();
					System.out.println("The area of the circle is" + " " + cir.area(r));
					break;

				case 8:
					System.out.println("Enter the radius:");
					double radius = sc.nextDouble();
					CirclePerimeter circlePerimeter = new CirclePerimeter();
					System.out.println("The circumfrence of the circle is" + " " + circlePerimeter.circumfrence(radius) + "\n");
					break;
					
				case 9:
					System.out.println("Enter the radius:");
					double r1 = sc.nextDouble();
					CirclePeri circlePer = new CirclePeri();
					System.out.println("The circumfrence of the circle is" + " " + circlePer.per(r1) + "\n");
					break;
					

				case 10:
					isRunning = false;
					break;
				default:
					System.out.println("Enter a valid option\n");
			}
		}

		sc.close();
	}

}
