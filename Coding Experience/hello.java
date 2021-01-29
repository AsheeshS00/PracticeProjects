import java.util.ArrayList;
import java.util.Scanner;

public class hello{

	static Scanner input = new Scanner(System.in);
	static ArrayList<Integer> array = new ArrayList<Integer>(); 
	
	public static void main(String args[]){
		
		
		System.out.println("Enter 000 when you are done entering you number. "); 
		System.out.print("Type in your number and press enter: ");
		int userInput = input.nextInt();
		
		
		while (userInput != 000){
			
			
			array.add(userInput); 
			userInput = input.nextInt();
			
			
		}
		
		
		
		System.out.println("--------------------------------------------");
			
		int sum = 0;
			
		for(int i : array){
				
			sum += i;  
				
		}
		
		System.out.println(sum); 
	
	
	
	}

}

































