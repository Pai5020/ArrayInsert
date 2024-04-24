import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr = new int[6];
        System.out.println("enter 6 array elements : ");
        for(i=0 ; i<6; i++) {
            arr[i] = sc.nextInt();
        }

        InsertIntoArray ia = new InsertIntoArray();

        try{

            System.out.println("Enter the element to be inserted : ");
            int element = sc.nextInt();
            System.out.println("Enter the position : ");
            int pos = sc.nextInt();
            int[] newArr = ia.insertElement(arr,element,pos-1);

            System.out.println("Original array : "+ Arrays.toString(arr));
            System.out.println("Updated array : " + Arrays.toString(newArr));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}