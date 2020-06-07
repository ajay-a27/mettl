import java.io.*;
import  java.util.*;
class Usermaincode
{
public int totalHillWeight(int input1, int input2,int input3)
{
	int sum=0;
		for(int i=1;i<=input1;i++)
		{
			for(int j=i;j>0;j--)
			{
				sum+=input2;
			}
			input2+=input3;
		}
		return sum;
	}
}
