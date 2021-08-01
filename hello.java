import java.util.Scanner;
abstract class special
{
double p;
double r;
abstract double process(double p,double r);
}
class discount extends special
{
double total=0;
public double process(double p,double r)
{
 total=p+(p*(r/100));
return total;
}
}
class hello
{
public static void main(String args[])
{
discount obj=new discount();
System.out.println("value = "+obj.process(23.099,34.0980));
}
}
