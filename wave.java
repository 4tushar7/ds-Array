import java.util.*;
class wave
{
	static void print(int [][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					System.out.print(arr[i][j] +" ");
				}
			}
			else
			{
				for(int j=arr[0].length-1;j>=0;j--)
				{
					System.out.print(arr[i][j] +" ");
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row no.");
		int r=s.nextInt();
		System.out.println("Enter column no.");
		int c=s.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		print(arr);
	}
}