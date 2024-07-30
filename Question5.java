import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		sc.close();

		if(year % 400 == 0)
			System.out.println("Leap Year");
		else if(year % 100 == 0)
			System.out.println("Not Leap Year");
		else if(year % 4 == 0)
			System.out.println("Leap year");
		else
			System.out.println("Not Leap Year");
	}
	
}