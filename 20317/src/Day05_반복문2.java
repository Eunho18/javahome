
public class Day05_¹Ýº¹¹®2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//1
	//1 2
	//1 2 3
	System.out.println("1===================");	
	for(int i = 1; i <= 3; i++) {
		for(int j = 1; j <= i; j++)
			System.out.print(j);
		System.out.println("\n");
		
		}
	//1
	//2 2
	//3 3 3
	System.out.println("2====================");
	for(int i = 1; i <= 3; i++) {
		for(int j = 1; j <= i; j++)
			System.out.print(i);
		System.out.println("\n");
	
	}
	
	//* * *
	//* *
	//*
		
	System.out.println("3=====================");
	for(int i = 3; i >= 1; i--) {
		for(int j = 1; j <= i; j++)
			System.out.print("*");
		System.out.println("\n");
	
	}
	
	System.out.println("4=====================");
	for(int i = 1; i <= 3; i++) {
		for(int j = 1; j <= i; j++)
			System.out.print("*");
		System.out.println("\n");
	      
		
		}
	
	}

}
