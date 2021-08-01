import java.util.Scanner;
interface gcd
{
int compute(int num1,int num2);
}
class approach1 implements gcd
{
public int compute(int num1,int num2)
{
int GCD=1;
for(int i=1;i<=num1 && i<=num2;i++)
{
if(num1% i == 0 && num2% i == 0)
GCD=i;
}
return(GCD);
}}
class approach implements gcd
{
public int compute(int num1,int num2)
{
int GCD_1=1;
System.out.println("factors of "+num1+" and "+num2+ " are");
for(int i=1;i<=num1 && i<=num2;i++)
{
if(num1% i == 0 && num2% i == 0)
GCD_1=i;

System.out.println(GCD_1);
}

return(GCD_1);

}
}

class javapro
{
public static void main(String args[ ])
{
approach1 obj=new approach1();
approach obj1=new approach();
gcd g;
g=obj;
System.out.println("gcd by euclidean algorithm ="+g.compute(12,8));
g=obj1;
System.out.println("GCD ="+g.compute(16,8));
}
}
