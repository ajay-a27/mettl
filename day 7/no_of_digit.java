import java.io.*;
import  java.util.*;
class UserMainCode
{
public int allDigitCount(int input1)
{
	int count=0,i;
		while(input1!=0)
		{
			count++;
			input1/=10;
		}
		return count;
	}
}
