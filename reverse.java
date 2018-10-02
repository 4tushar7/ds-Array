import java.util.*;
class reverse
{
	static void reverseArray(int arr[],int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size:-");
		int n1=s.nextInt();
		int n2=n1-1;
		int arr[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr[i]=s.nextInt();
		}
		printArray(arr,n1);
		reverseArray(arr,0,n2);
		System.out.println("Reversed array is \n");
		printArray(arr,n1);
	}
}