import java.util.Scanner;

public class equation {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("équation du type ax²+bx+c = 0");
		System.out.println("a=");
		double a = scan.nextDouble();
		System.out.println("b=");
		double b = scan.nextDouble();
		System.out.println("c=");
		double c = scan.nextDouble();
		System.out.println("l'équation est "+a+"x² + "+b+"x + "+c);

		double delta = (b*b) - (4*a*c);
	
		if (a!=0 && delta>0) {
			double x1 = (-b-Math.sqrt(delta))/(2*a);
			double x2 = (b-Math.sqrt(delta))/(2*a);
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}
		else if (a!=0 && (delta==0)) {
			double x=(-b)/(2*a);
			System.out.println("x="+x);
		}
		else {
			System.out.println("pas de solution");	
		}
	}
}
