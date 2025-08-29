package preac.pac;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		
		while(n > 0)
		{
		      n=n/10;
			count++;
		}
		n=temp;
		int sum=0;
		while(n > 0)
		{
			int rem=n % 10;
			int p=1;
		    for(int i=0;i<count;i++)
		    {
		    	   p=p*rem;
		    }
		    sum=sum+p;
		    n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong ");
		}
	}
}
