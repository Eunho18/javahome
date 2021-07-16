import java.util.Scanner;

public class Day_05반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	for( int i = 0; i <5; i++)
		System.out.println(i);
	
	for(int i = 0; i <= 10; i = i+2)
		System.out.println(i); // 0 2 4 6 8 10
	
	for(int i =10; i > 3; i-=2)
		System.out.println(i);
	
	System.out.println("====================");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("N입력:");
	int N = sc.nextInt();
	
	int even_sum = 0, odd_sum = 0;
	for(int i = 1; i <=N; i++)
		if( i % 2 ==0 )
			even_sum +=i;
		else
			odd_sum += i;
	
	System.out.println("홀수의합:" + odd_sum);
	System.out.println("짝수의합:" + even_sum);
	
	
	}

}
