public class Factorial {

	public static void main(String[] args) {
		int fact =1 , i, n;
		
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number : " );
	n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			fact = fact*i;
			
		}
System.out.format("The factorial of %d is %d" ,n ,fact);
	}

}
