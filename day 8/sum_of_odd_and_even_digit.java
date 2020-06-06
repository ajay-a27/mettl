import java.io.*;
import  java.util.*;
class Usermaincode
{
public int evenodddigitsum(int input1, String input2)
{
int temp=0,even=0,temp1=0,odd=0;
		String s1=new String ("odd");
		String s2=new String ("even");
		int c=input1;
		
		
			while(input1>0)
			{
				temp=input1%10;
				if(temp%2==0)
				{
					even+=temp;
				}
				else
				{
					odd+=temp;
				}
				input1/=10;
			}
			if(s1.equals(input2))
			return odd;
			else
			return even;
		
		
		
			
	}
}
