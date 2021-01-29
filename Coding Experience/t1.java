import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;


public class t1{
	

	private static String FullName;
	private static String school;
	private static String live;
	private static int age;
	Formatter x;
	
	
	private void getInfo(){
		try{
		int num;
		
		Scanner userInfo = new Scanner(System.in);  
		
		System.out.println("Enter the following information:");
		System.out.print("Your full Name:");
		FullName = userInfo.nextLine();
		System.out.print("School:");
		school = userInfo.nextLine();
		System.out.print("State and country you live in:");
		live = userInfo.nextLine();
		System.out.print("Age:");
		num = userInfo.nextInt();
		
		age = Integer.valueOf(num);}
		catch(Exception e){
			System.out.println("Sorry, an error occured.");
		}
		
		
	}
	
	
	private void opener(){
		
		x = new Formatter("hello.txt");
		
	}
	
	private void adder(){
		x.format("%s%s%s%d", FullName, school, live, age);
	}
	
	private void closer(){
		x.close(); 
	}
	
	public static void main(String[] args){
		t1 what = new t1();
		what.getInfo();
		what.opener();  
		what.adder();
		what.closer();
	}
	
	
	
}
































