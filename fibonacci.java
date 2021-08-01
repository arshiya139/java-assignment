//2,3,5,8,13...
import java.util.Scanner;
class fibonacci
{
public static void main(String args[])
{
int a,b,c,n,i;
System.out.println("enter n");
Scanner s=new Scanner (System.in);
n=s.nextInt();
a=2;
b=3;
System.out.print(a+" "+b);

for(i=2;i<n;++i)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}
}
}