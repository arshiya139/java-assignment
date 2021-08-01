import java.util.Scanner; 
 public class largest
{
 public static void main(String[] args)
 {
int count=0;
System.out.println(" enter value of n "); 
Scanner s = new Scanner(System.in); 
int n = s.nextInt(); 
int largest = Integer.MIN_VALUE;

 System.out.println(" enter value of n"); 
for (int i = 0; i < n; i++) 
{
 count=count+1;
 int current = s.nextInt();
 if (current > largest) 
{
 largest = current; 
}

 }
 System.out.println("count of numbers"+count);

 System.out.println("largest of N number is : " + largest); 

}
 }

