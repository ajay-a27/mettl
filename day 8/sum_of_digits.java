import java.io.*;
import  java.util.*;
class Usermaincode
{
public int digitSum(int input1)
{
boolean sign = false;  int sum=0;
	if(input1<0)
	{
		input1= input1*(-1);
		sign=true;
	}
	while(input1>0)
	{
		sum+=input1%10;
		input1/=10;
	}
	if(sum>9)
	{
		sum=(sum%10)+((sum/10)%10);
	}
	if(sign)
	{
		sum*= -1;
	    return sum;
	}
	else
		return sum;	
	}
}
