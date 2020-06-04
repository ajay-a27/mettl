import java.io.*;
import  java.util.*;
class usermaincode
{
  public int ismultiple(int input1,int intput2)
  {
if(input1<0)
		input1*= -1;
		if(input1==0 || input2==0)
		return 3;
		else if(input1%input2==0)
		return 2;
		else
		return 1;
		
	}
}
