package tut;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the dimension of [row][column]");
		int m=s.nextInt();
		int n=s.nextInt();
		
		
		
     int a[][]=new int[m][n];
     int b[][]=new int[m][n];
     int c[][]=new int[m][n];
     System.out.println("enter elements of matrix A:");
     for(int i=0;i<m;i++) { 
    	 for(int j=0; j<n;j++) {
    		 a[i][j]=s.nextInt();
    		 
    	 }
     }
     System.out.println("enter the elements of matrix B:");
     for(int i=0;i<m;i++) { 
    	 for(int j=0; j<n;j++) {
    		 b[i][j]=s.nextInt();
    		 
    	 }
     }
     for(int i=0;i<m;i++) { 
    	 for(int j=0; j<n;j++) {
    		c[i][j]=a[i][j]+b[i][j];
    		 
    	 }
     }
     
     System.out.println("matrix c:");
     for(int i=0;i<m;i++) { 
    	 for(int j=0; j<n;j++) {
    		System.out.print(c[i][j]+"  ");
    		 
    	 }System.out.println();
     }
     
}
}