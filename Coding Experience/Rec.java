public class Rec{

	// factorial
	public static long num(long n){
	
		if(n == 1){
		
			return 1; 
		
		}
		else{
			return n * num(n - 1); 
		}
	
	}


	
	// x to the power of y. 
	public static long stuf(long x, long num){
		
		
		if(num == 0){
			return 1; 
		}
		else{
			return x * stuf(x, num - 1); 
		}
		
		
	}
	

	
	// Euclid's algorithm for finding Greatest Common Diviser (GCD). 
	public static long num(long x, long y){
		
		long n;
		long m;
		if(x%y == 0){
			return y;
		}
		else{
			n = x;
			m = y;
		}
		
		return num(x=m , y = n%m);
	
	
	}
	
	
	
	static int num1 = 0;
	static int num2;
	// this method is specifically for addition.
	public static int valueAdd(String umi){			
		boolean us = false;													
		
		for(int i = 0; i< umi.length()-1; i++){
			
			if(umi.substring(i,i+1) != "+"){
				us = true;
			}
			
		}
		
		if(us == true){														
			us=false;
			return Integer.parseInt(umi);
			
		}
		
		
		
		for(int i =0; i < umi.length()-1; i++){
			
			
			if(umi.substring(i,i+1).equals("+")){
				num1 = Integer.parseInt(umi.substring(0,i));
				
				return num1 + valueAdd(umi.substring(i+1, umi.length()));
			
			}
			
		}
		
		return 0;
		
	}
	
	
	

	public static void main(String args[]){
	
		System.out.println(valueAdd("9+10+1"));
		//System.out.println(num(8));
		//System.out.println(stuf(2, 8));
		//System.out.println(num(45,10));
		
	}





}


































































