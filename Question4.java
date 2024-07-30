import java.util.Scanner;

import java.lang.Math;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		sc.close();

		int head = 0, tail = 0;
		for(int i = 0; i<n; i++){
			double random = Math.random();
			if(random < 0.5)
				tail += 1;
			else
				head += 1;

		}

		System.out.println("Head percentage "+ ((head*100)/n));
		System.out.println("Tail percentage "+ ((tail*100)/n));

	}
	
}