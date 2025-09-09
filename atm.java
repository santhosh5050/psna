import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n / 500;
		        n  = n % 500;
		 System.out.println("500 = "+count);
		 
		 
	 count = n / 200;
		        n  = n % 200;
		 System.out.println("200 = "+count);
		  count = n / 100;
		        n  = n % 100;
		 System.out.println("100 = "+count);
		  count = n / 50;
		        n  = n % 50;
		 System.out.println("50 = "+count);
		  count = n / 10;
		        n  = n % 10;
		 System.out.println("10 = "+count);
	}
}
