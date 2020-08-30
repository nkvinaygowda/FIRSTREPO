package tut;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n:");
		int n=s.nextInt();
		float r=1.0f;
		for(float i=2; i<=n; i++){
			if(i%2==0) {
			r=r-(1/i);
			}else {
				r=r+(1/i);
			}
		}
		System.out.println("result is "+r);

	}

}
