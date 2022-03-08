// Aramstrong Number Within Given Range //
import java.io.*;
import java.util.*;
public class armstrongrange
{
public static void main(String args[])
{
int a,b,temp,sum,rem,i,num;
  Scanner s= new Scanner(System.in);
  System.out.println("enter the range from a to b");
    a=s.nextInt();
    b=s.nextInt();
 System.out.println("armstrong numbers are");
for(i=a;i<=b;i++)
{
 sum=0;
num=i;
temp=num;
while(num>0)
{
 rem=num%10;
sum=sum+(rem*rem*rem);
 num=num/10;
}
 if(sum==temp)
{
 System.out.println( temp+ " ");
}
}
}
}
/*INPUT- Enter range from a to b 
         a=1
        b=1000
 OUTPUT- armstrong numbers are 
         1,157,370,371,407 */