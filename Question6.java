import java.util.Scanner;
import java.lang.Math;

public class Question6 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);

		if(n>31 || n<0) {
			System.out.println("Code Terminate number should be less than 31 and greater than 0"); 
			System.exit(0);
		}
		
		
		for(int i = 1; i<=n; i++) {
			System.out.println(Math.pow(2,i));
		}
	}
	
}




//Scanner sc = new Scanner(System.in);
		//boolean isQuite = false;
		//int n=0;

		//while(!isQuite){

		//	n = sc.nextInt();
		//	if(n<31 && n>=0) isQuite=true;
		//	else System.out.println("Enter the number between 1 to 31");
		//}

		

		//sc.close();