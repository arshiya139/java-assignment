import java.util.Scanner;
class pair
{
public static void main(String args[])
{
int n,x=1,y=2,z=0;
Scanner s=new Scanner(System.in);
System.out.println("enter number of persons");
n=s.nextInt();
if (n<=2)
{
System.out.println(n);
}
else
{
for (int i = 3; i <= n; i++) 
{  z = y + (i - 1) * x; 
            x = y; 
            y = z; 
        } 
        System.out.println("number of ways they can stand = "+z); 
    }
} 
}