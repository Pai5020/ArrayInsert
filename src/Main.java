import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr = new int[6];


        InsertIntoArray ia = new InsertIntoArray();

        try{
            System.out.println("enter 6 array elements : ");
            for(i=0 ; i<6; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]<0){
                    throw new NegativeNumberException("Negative number not allowed");
                }
            }


            System.out.println("Enter the element to be inserted : ");
            int element = sc.nextInt();
            if(element<0){
                throw new NegativeNumberException("This element cannot be negative");
            }
            System.out.println("Enter the position : ");
            int pos = sc.nextInt();
            ia.bubbleSort(arr);
            ia.insertElement(arr,element,pos-1);
            System.out.println("Original array : "+ Arrays.toString(arr));
            ia.bubbleSort(arr);
            System.out.println("Final array : "+ Arrays.toString(arr));

        }
        catch (IllegalArgumentException | NegativeNumberException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}