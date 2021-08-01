import java.util.Scanner; 
public class find_large
 { 
public static void main(String[] args) 
{ 
Scanner input=new Scanner (System.in); 
int counter=0, number=0, largest=0; 

for (counter=0; counternumber?largest:number); 
}

System.out.println("largest=", +largest);
 } 