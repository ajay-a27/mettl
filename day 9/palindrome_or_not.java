import java.io.*;
import  java.util.*;
class Usermaincode
{
public int isPalinNum(int input1)
{
int in=input1;
		int rev=0,temp=0;
		while(input1>0)
		{
			temp=input1%10;
			rev=rev*10+temp;
			input1/=10;
		}
		if(in==rev)
		return 2;
		else
		return 1;
		
	}
}
