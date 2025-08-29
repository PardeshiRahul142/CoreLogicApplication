package preac.pac;
import java.util.*;
public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
        int  rev=0;
        int temp=num;
		while(num > 0)
		{
		 int rem=num % 10;
           rev=rev*10+rem;
			num=num/10;
		}
		if(temp == rev)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("Number is not palindrom");
		}
	}
}
