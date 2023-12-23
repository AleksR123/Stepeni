import java.util.Scanner;

public class Stepeni {
	
	public static void main(String[] args) {
			
			double c,f;
			Scanner input = new Scanner(System.in);
			System.out.println("Vnesete ja vrednosta na stepenite celziusovi");
			c = input.nextDouble();
			f = 9*c/5+32;
			System.out.println("Vrednosta vo stepeni farenhajtovi e: "+f);

		}


}
