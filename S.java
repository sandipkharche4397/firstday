import java.util.Scanner;
	
	public class S
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
	System.out.println("This number is Prime Number");
	}
else
	{
	System.out.println("This number is  not Prime Number"); 
	}
}
}