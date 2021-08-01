import java.util.Scanner;
 class num
{
    public static void main(String args[])
    {
        int contp=0, cntn=0, cntz=0, i;
        int arr[] = new int[10];
        Scanner s = new Scanner(System.in);
 
        System.out.print("Enter 10 Numbers : ");
        for(i=0; i<10; i++){
            arr[i] = s.nextInt();
        }
        for(i=0; i<10; i++){
            if(arr[i] < 0){
                cntn++;
            }else if(arr[i] == 0){
                cntz++;
            }else{
                contp++;
            }
        }
 
        System.out.print(contp + " Positive Numbers");
        System.out.print("\n" + cntn + " Negative Numbers");
        System.out.print("\n" + cntz + " Zero");
    }
}