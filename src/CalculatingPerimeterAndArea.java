import java.util.Scanner;

public class CalculatingPerimeterAndArea {

	public static void main(String[] args) {

		double length;
		double width;
		double height;
		double perimeter;
		double area;
		double volume;
		char response;

		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("Enter Length: ");
			length = scan.nextDouble();

			System.out.println("Enter Width: ");
			width = scan.nextDouble();
			
			System.out.println("Enter Height: ");
			height = scan.nextDouble();

			perimeter = (length + width) * 2;
			System.out.println("Perimeter: " + perimeter);

			area = length * width;
			System.out.println("Area: " + area);
			
			volume = length * width * height;
			System.out.println("Volume: " + volume);

			System.out.println("Continue? (Y/N): ");
			response = scan.next().charAt(0);

		} while ((response != 'n') && (response != 'N'));

		scan.close();
	}

}
