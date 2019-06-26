package labNumber4;

import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Learn your squares and cubes!");
		String ans = "y";
		do{
			System.out.println("Enter an integer : " );
			int integer = scnr.nextInt();
			
			System.out.println("Number" + " " + "Squared" + " " + "Cubed");
			System.out.println("======" + " " + "=======" + " " + "=====");
			for (int i = 1; i <= integer ; i++){
				int squared =(int)  Math.pow(i, 2);
				int cubed = (int) Math.pow(i, 3);
				
				System.out.println( i + "      " + squared + "      " + cubed);
			
			/*for (int j = 1; j <= integer ; j++){
				System.out.println((j) + " |");
				for (int y = 1 ; y <= integer ; y++){
					System.out.print((y*j) + " ");*/
					
					
					
				}
			System.out.println("Would you like to Continue(y/n)");
			ans = scnr.next();
		
     } while (ans.equals("y"));
		scnr.close();
    }
  }
		



		 

	
		
		


	

	
