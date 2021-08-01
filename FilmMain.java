import java.util.Scanner;
class film
{
String name,lang,lead_actor,category;
int duration;
film()
{
name="null";
lang="null";
lead_actor="null";
category="null";
duration=0;
}
film(String x,String y,String z,String a,int b)
{
name=x;
lang=y;
lead_actor=z;
category=a;
duration=b;
}
void display()
{
System.out.println("name of film = "+name+"\nlanguage = "+lang+"\nlead_actor = "+lead_actor+"\ncategory = "+category+"\nduration = "+duration+" min");
}
}


class FilmMain
{
public static void main(String args[])
{

film obj=new film("Tarzan","hindi","shahid kapoor","drama",150  );
obj.display();
}
}