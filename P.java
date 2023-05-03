import java.util.Scanner;
	
	public class P
{
	public static void main(String args[])
{
	System.out.println("Enter Number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int t=0;

		
	for(int i=1;i<=n;i++)
	{
	if(n%i==0)
		{

		t++;

		}
	}
	if(t==2)
		{
			System.out.println("this number is prime number");
		}
	else
		{
			System.out.println("this number not is prime number");
		}
}
}