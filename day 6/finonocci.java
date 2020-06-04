import java.io.*;
import  java.util.*;
class usermaincode
{
public long nthFibonacci(int input1)
{
int first =0;
		int second =1;
		int fib=0;
		for(int i=3;i<=input1;i++)
		{
			fib=first+second;
			first=second;
			second=fib;
		}
		if(input1==1)
		return 0;
		else if(input1==2)
		return 1;
		else
		return fib;
	}
}
