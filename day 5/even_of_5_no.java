import java.io.*;
import  java.util.*;
class usermaincode
{
public int counteven(int input1,int input2,int input3,int input4,int input5)
{
int count=0;
		if(input1%2==0)
		count+=1;
		if(input2%2==0)
		count+=1;
		if(input3%2==0)
		count+=1;
		if(input4%2==0)
		count+=1;
		if(input5%2==0)
		count+=1;
		return count;
	}
}
