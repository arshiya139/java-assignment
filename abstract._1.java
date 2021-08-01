import java.util.Scanner;
abstract class AbstractClass
 {
abstract public void getValue();
abstract public int divisorSum(int n);
}

class Calculator extends AbstractClass
{
public void getValue()
{

Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(this.divisorSum(n));
}

public int divisorSum(int n)
{
if(n>9999)
return 0;
int sum=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
sum+=i;
}
}
return sum;
}
}
class main_14
{
public static void main(String[] args)
{
Calculator obj=new Calculator();
obj.getValue();
}
}
}