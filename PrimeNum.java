package preac.pac;
import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        boolean flag=false;
       for(int i=2;i<n/2;i++)
       {
    	    if(n % i ==0)
    	    {
    	    	  flag=true;
    	    }
       }
       if(flag)
       {
    	   System.out.println("Is not prime");
       }
       else
       {
    	   System.out.println("Is prime");
       }
	}

}
