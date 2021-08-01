import java.util.Scanner;
abstract class AbstractClass
{
int getValue();
int divisorSum(int n);
}
class Calculator implements AbstractClass

{
public int getValue()
{
int n,i,j;
Scanner s=new Scanner(System.in);
System.out.println("enter value of n");
n=s.nextInt();
return n;
}
public int divisor(int n)
{
int sum = 0;
  
        for (int i = 1; i <= n; ++i)
            {
            for (int j = 1; j * j <= i; ++j)
                  {
                if (i % j == 0) 
                        {
                    if (i / j == j)
                        sum += j;
                    else
                        sum += j + i / j;
                }
            }
        }
        return sum;
    }

}
class main_2
{
public static void main(String args[])
{
Calculator obj=new Calculator();
AbstractClass obj1;
obj1=obj;
System.out.println("value ="+obj1.getvalue());
System.out.println("values ="+obj1.divisor(n));
}
}

