package OPPs_LineComparison;

import java.util.Scanner;

public class OOPs_LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		OOPs_LineComparison ob = new OOPs_LineComparison();
		System.out.println("Enter End points of Line1:");
		Line line3 = ob.new Line();
		System.out.println("Enter End points of Line2:");
		Line line2 = ob.new Line();

		checkEqual(line3.length, line2.length);
	}

	private static void checkEqual(double l1, double l2) {
		if (l1 == l2) {
			System.out.println("Lines are Equal");
		} else {
			System.out.println("Lines are not Equal");
			compareTo(l1, l2);
		}
	}

	private static void compareTo(double l1, double l2) {
		if (l1 > l2) {
			System.out.println("Line1 is Greater");
		} else
			System.out.println("Line2 is Greater");
	}

	class Line {
		public double length;
		private int x1;
		private int x2;
		private int y1;
		private int y2;

		Line() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Point1's x=");
			this.x1 = sc.nextInt();
			System.out.println("Enter Point1's y=");
			this.y1 = sc.nextInt();
			System.out.println("Enter Point2's x=");
			this.x2 = sc.nextInt();
			System.out.println("Enter Point2's y=");
			this.y2 = sc.nextInt();
			this.length = Math.sqrt(((x2 - x1) ^ 2) + ((y2 - y1) ^ 2));
		}
	}
}
