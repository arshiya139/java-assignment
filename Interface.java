import java .util.Scanner;
interface special
{
double process(double p,double r);
}
class discount implements special
{
double total=0.00;
public double process(double p,double r)
{
total=p+(p*r)/100;
return total;
}
}

class Interface
{
public static void main(String args[])
{
discount obj=new discount();
special obj1=obj;
System.out.println("dicounted value = "+obj1.process(23.9807,34.56789));
}
}