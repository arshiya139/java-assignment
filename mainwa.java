import java.util.Scanner;
class TelephoneIndex
{
String name;
String p_no;

TelephoneIndex()
{
 System.out.println("name"+name);
}
void input()
{
Scanner s=new Scanner(System.in);
name=s.nextLine();
p_no=s.nextLine();
 }
void display()
{
System.out.println("name="+name);
System.out.println("phone number="+p_no);
}
}
class mainwa
{
public static void main(String args[])
{
int n,i,j,m;
String []sname;
Scanner s=new Scanner(System.in);
System.out.println("enter value of n");
n=s.nextInt();
TelephoneIndex obj[]=new TelephoneIndex[n];

for(i=0;i<n;i++)
{
obj[i]=new TelephoneIndex();
obj[i].input();
}
System.out.println("enter name to find details");
m=s.nextInt();
for(j=0;j<m;j++)
{

sname[j]=s.nextLine();
}
for(i=0;i<n;i++)
{
if(name[i]==sname[i])
{
obj[i].display();
}
}
}
}