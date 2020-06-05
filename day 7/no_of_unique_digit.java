import java.io.*;
import  java.util.*;
class UserMainCode
{
public int uniquedigitcount(int input1)
{
int dig=0;int temp=input1;
		while(temp!=0)
		{
			dig+=1;
			temp/=10;
		}
		int[] arr=new int[dig];
		for(int i=0;i<dig;i++)
		{
			arr[i]=input1%10;
			input1/=10;
		}
		for(int j=0;j<dig;j++)
		{
			for(int k=0;k<dig;k++)
			{
				if(j!=k)
				{
					if(arr[k]==arr[j])
					{
						dig--;
					}
				}
			}
		}
		return dig;
	}
}
