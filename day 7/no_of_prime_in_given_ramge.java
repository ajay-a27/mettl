import java.io.*;
import  java.util.*;
class UserMainCode
{
public int countPrimeInRange(int input1,int input2)
{
int i=0,count=0;
		while(input1<=input2)
	 {
		for(i=2;i<=input1;i++)
		{
			if(input1%i==0)
			{
				break;
			}
		}
		if(i==input1)
		count+=1;

		input1+=1;
	 }	
	 return count;
	}
}
