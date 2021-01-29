public class ArrayStructures{
	
	
	
	private int[] ArrayList = new int[50]; 
	
	private int ArraySize = 10; 
	
	
	
	public void initializeValues(){
		
		for(int i = 0; i < ArraySize; i++){
			
			ArrayList[i] = (int) (Math.random()*10) + 10;
			
		}
		
		
		
	}
	

	
	
	
	public void printList(){
		
		System.out.println("-------------------------");
		System.out.println("  " + "Index" + "   " + "Values"); 
		for(int i =0; i < ArraySize; i++){
			
			System.out.print("|   " + i + "   |   "); 
			System.out.println(ArrayList[i] + "   |");
			
		}
		System.out.println("-------------------------");
		
	}
	
	
	
	public void findIndexNum(int num){
		System.out.println("Index " + num + " holds the value " + ArrayList[num]);
		
	}
	
	
	
	public boolean isValueThere(int num){
	
		boolean here = false; 
		
		for(int i =0; i <ArraySize; i++){
			
			if(num == ArrayList[i]){
				here = true; 
			}
			
		}
		
		return here; 
		
	}
	
	

	public void deleteAnIndex(int num){
		
		for(int i = num; i < ArraySize -1; i++){
			
			ArrayList[i] = ArrayList[i+1];
			
		}
		ArrayList[ArraySize-1] = 0; 
		ArraySize--;
		
	} 
	
	
	public void addValuePlace(int index, int value){
		
		for(int i = ArraySize; i >= index; i--){
			
			ArrayList[i + 1] = ArrayList[i]; 
			
		}
		
		ArrayList[index] = value; 
		ArraySize++; 
		
	}

	public void addValue(int value){
		
		if(ArraySize == 50){
			System.out.println("The storage has reached its max."); 
		}
		
		else{
		ArrayList[ArraySize] = value;
		ArraySize++;}
		
	}
	
	
	
	/*
	public String linearSearchForValue(int value){
		
		
		boolean valueInArray = false;
		String indexWithValue = "";
		
		System.out.print("The Value was found in the following:  ");
		
		for(int i = 0; i < ArraySize; i++){
		
			if(ArrayList[i] == value){
				
				valueInArray = true; 
				
				System.out.print(i  + "  ");
				indexWithValue += i + "  ";
				
			}
		
		}
		
		
		if(!valueInArray){
			
			indexWithValue = "None";
			
			System.out.print(indexWithValue);
			
		}
		
		System.out.println();
		
		return indexWithValue; 
		
		
	}
	
	**/
	
	
	
	
	public String lenearSearch(int num){
		
		boolean value = false;
		
		String storage = "";
		
		System.out.print("The values were found in the following indexes: "); 
		
		
		for(int i = 0; i < ArraySize; i++){
		
			
			if(ArrayList[i] == num){
				
				value = true;
				System.out.print(i + "   ");
				storage += i + "   ";
				
			}
		}
		
		
		if (!value){
			
			storage = "None";
			System.out.print("None");
			
		}
		
		
		return storage; 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]){
		
		ArrayStructures hello = new ArrayStructures(); 
		
		hello.initializeValues(); 
		hello.printList(); 
		hello.findIndexNum(6);
		System.out.println(hello.isValueThere(15));
		hello.deleteAnIndex(5);
		hello.deleteAnIndex(2);
		hello.printList(); 
		//hello.addValuePlace(6, 19);
		hello.addValue(1800);
		hello.printList(); 
		//hello.linearSearchForValue(15);
		hello.lenearSearch(11); 
		
		
	}
	
	
	
	
	
	
	
}
































































































































