import java.util.*;
class Arraymax
{
	public static int max(int arr[],int n)
	{
		Arrays.sort(arr);
		int max_count=1,res=arr[0];
		int curr_count=1;
		int i;
		for(i=1;i<n;i++)
		{
			if(arr[i]==arr[i-1])
			{
				curr_count++;
			}
			else
			{
				if(curr_count>max_count)
				{
					max_count=curr_count;
					res=arr[i-1];
				}
				curr_count=1;
			}
		}
		if(curr_count>max_count)
		{
			max_count=curr_count;
			res=arr[n-1];
		}
		return res;
	}


	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int arr[]=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=s.nextInt();
		}
		int n=arr.length;
        System.out.println(max(arr,n));
	}
}