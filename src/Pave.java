import java.util.Scanner;

public class Pave {
	public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("largeur du pave");
	double L = recupvaleur(scan);
	System.out.println("longeur du pave");
	double ll = recupvaleur(scan);
	System.out.println("hauteur du pave");
	double h = recupvaleur(scan);
	
	double v=ll*L*h;
	System.out.println("volume =" + v);
	}

	public static double recupvaleur(Scanner scan){
	double x=-1;
	while (x<0) {
		System.out.println("Il faut une valeur positive");
		x=scan.nextDouble();
		}
	return x;
	}
}
