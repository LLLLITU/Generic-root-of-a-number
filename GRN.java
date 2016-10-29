import java.util.*;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=0;
		for (int i=1;i<=n;i++ )
		{
			j++;
			for(int k=1;k<=j;k++)
			{
				System.out.print(k);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
