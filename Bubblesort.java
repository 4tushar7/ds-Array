import java.util.*;
class Bubblesort
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,i,j,temp;
		System.out.println("Enter the numbers of integers to sort");
		n=s.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter "+ n +" integers");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted list of numbers:");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}