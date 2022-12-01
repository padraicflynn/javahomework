package homework34;
import java.util.*;
import java.util.jar.Attributes.Name;

public class Homework34 {

	//main string
	
	public static void main(String[] args) {
		 
		//question one array
		
		
				int[] ages = { 3, 9, 23, 64, 3, 8, 28, 93, 100 };
				
				int agesA = (ages[0] - ages[ages.length-1]);
				
				System.out.println("The first minus last numbers in the array is " + agesA);
				
				//Add new age to array and repeat.
				
				
				
				//loop for age average
				// getting the sum of the array
				
				int sum = 0;
				
				for (int i = 0; i < ages.length; i ++)
					sum += ages[i];
				
				// prints out the sum of the array
				System.out.println("The sum of numbers in the array is: " + sum);
				
				//prints out the average 
				System.out.println("The average age in the array is: " + sum / ages.length);
				
				
				// questions two
				
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" } ;
				
				// sum of name lengths
				
		  int sum2 = 0;
				for (int t = 0; t <names.length; t ++)
					sum2 += names[t].length();
				
		 // Above gets the sum
				//and here we divide the sum
				
				System.out.println("The average sum of names is: " + sum / names.length);
				
				int z;
				for (z = 0; z < names.length; z++) {
					System.out.print(names[z] + " ");
				
					
				
				}
				//line break
				System.out.println();
				
				
				
					// last item in array names
				
				int lastItem = names.length-1;
					System.out.println(names[lastItem]);
				
					// first item in the array names
					
					System.out.println(names[0]);
					
					
					//Question five
					//new array nameLength
					//adding name lengths into new array nameLength
				
					
					int[] nameLength;
					
					nameLength = new int [names.length];
					
					for (int p = 0; p < names.length; p++) {
						nameLength[p] = names[p].length();
						
					}
				    for (int nameP = 0; nameP < nameLength.length; nameP++) {
					System.out.println("The name length of " + names[nameP] + " is " +  nameLength[nameP]);
					
					
					}
				    
				    //adding the values of nameLength array, which is how long each name is
				    
				    int sum3 = 0;
					for (int zT = 0; zT < nameLength.length; zT++) {
				    	sum3 += nameLength[0];
				    	
				    }
				    System.out.println("The sum of nameLength array is: " + sum3);
				    
				    
				   	//method for problem 7, print hello x times
				questionSeven();
				
				//break between method 7 
				System.out.println();
				
				// metheod for question 8
				System.out.println("Question 8! " + questionEight());
				
				//method for question 9
				System.out.println("Question 9! After adding the array is it more than 100, true or false: " + (questionNine()));
		 
			 //method for question 10
				System.out.println("Question 10! The double array's average is: " + questionTen());
				
				// method for question 11
				System.out.println("Questin 11! Is array one bigger than array 2? " + questionEleven());
				
				// method for 12, will buy drink
				
				System.out.println("Question 12! Will I get a drink? " + willBuyDrink());
				// end Main string!
				
				 
				//Question 13
				// I like to play board and card games, so check to see if we have a full deck of playing cards and enough friends; if so, we can play.
				
				System.out.println("Can you play a card game with friends: " + canYouPlayCards());
				
					}
// end Main string!
		
		
	//method for question 7-12
	
	// method for question 7
	
		 static void questionSeven() {
			 String word;
			 int n;
			  
			 word = "hello";
			 n = 3;
			 
			 for (int m = 0; m < n; m++) {
				 System.out.print(word);
			 }
		 }
			
		 //method for question 8
		 
		 static String questionEight() {
			 String firstName, lastName;
			 
			 firstName = "Joe";
			lastName = "Wheeler";
			
			String fullName = "The full name provided is: " + firstName + " " + lastName;
			return fullName;
					 
		 }

	// Method for question nine
	
	static Boolean questionNine() {
		int[] arrayNine = { 10, 11, 12, 13, 14};
		int sum9 = 0;
		
		for (int i9 = 0; i9 < arrayNine.length; i9++) {
			sum9 += arrayNine[i9];
			
		}  
		
			return (sum9 > 100);
	}
	
	
	 //   question 10
	 static double questionTen() {
		 double[] qTen = { 155.3, 14.6, 16.14 };
		 
		 int sum10 = 0;
		 for (int i10 = 0; i10 < qTen.length; i10++) {
			 sum10 += qTen[i10];
			 
		 }
		 return (sum10 / qTen.length);
	 }
	 
	 // question 11!
	 
	 static Boolean questionEleven() {
		 double[] array11 = {5.5, 5, 5};
		 double[] array12 = {7.7, 7, 7, 7};
		 
		 double sum11 = 0;
		 double sum12 = 0;
		 
		 for (int x11 = 0; x11 < array11.length; x11++) {
			 sum11 += array11[x11];
		 }
		 for (int x12 = 0; x12 < array12.length; x12++) {
			 sum12 += array12[x12];
			 
			 
		 }
		 return sum11 > sum12;
		 
	 }
	 
	 //question 12!
	 
	 static Boolean willBuyDrink( ) {
		 Boolean isHotOutside = false;
		 double moneyInPocket = 11;
		 
		 return  isHotOutside = true && moneyInPocket < 10.50;
		 
	 }
	 
	 
	 // make your own problem here for question 13
	 static Boolean canYouPlayCards() {
		 
		Boolean fullDeck = true;
		 int friends = 4;
		 
		 return fullDeck = true && friends > 1;
		 
	 }
		 


	//end of package 
}
