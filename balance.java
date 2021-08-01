import java.util.Scanner;
class Card
{
int c_no;
String c_name;
String b_name;
Card()
{
System.out.println("card details are as follows");
}
}
class Creditcard extends Card
{
int limit;
int amount;
int used;
Creditcard(int x,String y,String z,int b)
{
c_no=x;
this.c_name=y;
this.b_name=z;
amount=b;
}
void display()
{
System.out.println("card number="+c_no);
System.out.println("customer name="+c_name);
System.out.println("bank name="+b_name);
System.out.println("total amount="+amount); 
System.out.println("limit of account="+limit); 
}
void use(int z)
{

this.used=z;
limit=amount-used;


}
}

class balance
{
public static void main(String args[])
{
Creditcard obj=new Creditcard(12345,"arshiya","sbi",2000);
obj.use(500);
obj.display();
}
}