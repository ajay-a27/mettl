import java.io.*;
import  java.util.*;
class usermaincode
{
public int nthprime(int input1)
{
int count=0;
		int no=1,i;
		//if(input1==1)
		//return 2;
		//else
			while(count<input1)
			{
				no+=1;
				for( i=2;i<=no;i++)
				{
					if(no%i==0)
					break;
				}
				if(i==no)
				count+=1;
			}
			return no;
		
	}
}
