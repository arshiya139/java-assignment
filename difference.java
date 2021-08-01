import java.util.Scanner;
class difference
{
    
    public static int diff(int[] A)
    {
        int diff = Integer.MIN_VALUE;
 
        for (int i = 0; i < A.length - 1; i++)
        {
            for (int j = i + 1; j < A.length; j++) {
                diff = Integer.max(diff, A[j] - A[i]);
            }
        }
 
        return diff;
    }
 
    public static void main(String[] args)
    {
        int[] A = { 2, 7, 9, 5, 1, 3, 5 };
 
        System.out.print("The maximum difference is " + diff(A));
    }
}