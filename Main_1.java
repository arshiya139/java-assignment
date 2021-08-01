import java.util.Scanner;
interface exam
{
int pass();
}
interface classify
{
String average(int total);
}
class result implements exam,classify
{
Scanner s=new Scanner(System.in);
public int pass()
{
int n,i,m;

System.out.println("enter no of subjects");
n=s.nextInt();
for (i =0;i<=n;i++)
{
int total=0;
System.out.println("enter marks");
m=s.nextInt();
total=total+m;
System.out.println(this.average(total));
{
return (total);
}}}
public String average(int total)
{
float avg=total/5;
if(avg>=60)
{
return "first";
}
else if(avg>=50 && avg<60)
{
return "second";
}
else if(avg<50)
{
return "nodivision";
}
else
{
return "abc";
}}}
class Main_1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
result obj=new result();
exam obj1=obj;
System.out.println("xyz="+obj1.pass());
classify obj2=obj;
System.out.println("xyz="+obj2.average());
}
}

