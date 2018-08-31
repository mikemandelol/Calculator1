import cs1.Keyboard;
import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int length;
		int width;
		int height;
		int door;
		int window;
		int total1;
		int total2;
		int total3;
		int windowtot;
		int totalwin;
		int totaldor;
		int all;

		System.out.println("Enter the room dimensions bellow");

		System.out.println("Length? ");
		length = input.nextInt();

		System.out.println("Width? ");
		width = input.nextInt();

		System.out.println("Height? ");
		height = input.nextInt();

		System.out.println("How many doors does the room hae? ");
		door = input.nextInt();

		System.out.println("How many windows does the room have? ");
		window = input.nextInt();

		totalwin = (window * 12);
		totaldor = (door * 21);
		total1 = (length * height * 2);
		total2 = (height * width * 2);
		total3 = (total1 + total2);
		windowtot = (totalwin + totaldor);
		all = (total3 - windowtot);

		System.out.println("Total square feet: "+all);
	}
}