import java.io.*;
import  java.util.*;
class UserMainCode
{
public int uniquedigitcount(int input1)
{
int size=0;
		int temp=input1;
		while(input1!=0)
		{
			size++;
			input1/=10;
		}
		int res=size;
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=temp%10;
			temp/=10;
		}
		Arrays.sort(arr);
		for(int j=0;j<size-1;j++)
		{
			if(arr[j]==arr[j+1])
			{
				res--;
			}
		}
		return res;
	}
}
