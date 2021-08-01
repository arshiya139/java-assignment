import java.util.Scanner;
class TelephoneIndex
{
String []name;
String p_no;

TelephoneIndex()
{
 System.out.println("name"+name);
}
void input()
{
System.out.println("enter value of n");
n=s.nextInt();
Scanner s=new Scanner(System.in);
for(i=0;i<n;i++)
{
name[i]=s.nextLine();
p_no=s.nextLine();
 }
}
void display()
{
for(i=0;i<n;i++)
{
sname[i]=s.nextInt();
if(name[i]==sname[i])
{
System.out.println("name="+name);
System.out.println("phone number="+p_no);
}
}
}
}
class real
{
public static void main(String args[])
{
String []sname;
Scanner s=new Scanner(System.in);
TelephoneIndex obj=new TelephoneIndex();
obj.input();
obj.display();
}
}