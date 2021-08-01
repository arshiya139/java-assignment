import java.util.Scanner;
class tiles
{
public static void main(String args[])
{
int n,i,m,a,side;
Scanner s= new Scanner(System.in);
n=s.nextInt();
System.out.println("enter side");
side=s.nextInt();
System.out.println("enter squares");
m=s.nextInt();
while(i*i<=n)
{
m=i*i;
i++;
}
a=m*(side*side);
System.out.println("area =" +a);
}
}