 package sumarray;
 
 import java.util.Scanner;
 
 public class SumArray {
     private static Scanner scan = new Scanner(System.in);
     
     public static int[] buildArray(int elements) {
        int[] arr = new int[elements];
        for ( int i = 0; i < elements; i++ ) {
            System.out.println("Enter element number: " + (i+1));
            arr[i] = scan.nextInt();
        }
        return arr;
     }
     
     public static int sumArray(int[] input) {
        int sum = 0;
        for ( int in : input ) {
          sum += in;
        }
        return sum;           
     }

 
     public static void main(String[] args) {
         System.out.println("Provide the size of the array: ");
         int param = scan.nextInt();
         int[] array = buildArray(param);
         int result = sumArray(array);
         System.out.println("The sum of the array is: " + result);
     }
   }