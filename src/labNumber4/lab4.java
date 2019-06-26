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
			
			
			
			System.out.printf( "%10s %10s %10s\n","Number","Squared","Cubed");
			System.out.printf( "%10s %10s %10s\n","======","=======","=====");
			
			for (int i = 1; i <= integer ; i++){
				int squared =(int)  Math.pow(i, 2);
				int cubed = (int) Math.pow(i, 3);
				
				System.out.printf( "%10s %10s %10s\n",i, squared,cubed);
		
				}
			
			printMultiplicationTable (integer);
			System.out.println("Would you like to Continue(y/n)");
			ans = scnr.next();
				
     } while (ans.equals("y"));
		scnr.close();
		
		
    }
	
	 public static void printMultiplicationTable(int table) {
       
        System.out.printf("      ");
        for(int i = 1; i<=table;i++ ) {
            System.out.printf("%4d",i);
        }
        System.out.println();
        System.out.println("       ============");
         
        for(int i = 1 ;i<=table;i++) {
           
            System.out.printf("%4d |",i);
            
            for(int j=1;j<=table;j++) {
                System.out.printf("%4d",i*j);
            }
            System.out.println();
  }
	}

        public boolean nearHundred(int n) {
  		  
  		  if (( Math.abs(n) >= 90 ) && ( Math.abs( n ) <= 110) || 
  		  ( Math.abs(n) >= 190 ) && ( Math.abs( n ) <= 210 )) {
  		             
  		            return true;
  		    } 
  		    else
  		    {
  		            return false;
  		    }
  	} 
        
	}

		



		 

	
		
		


	

	
