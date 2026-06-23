import java.io;
import java.util.*;



public class practice {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    
    public static void main(String[] args) throws Exception{
        int[] arr;
        arr = new int[5];
        
        arr[0] =33;
        arr[1] =47;
        arr[2] =45;
        arr[3] = 35;
        arr[4] = 22;

        // System.out.println(arr.length);

        // for(int i =1; i < arr.length; i++){
        //     System.out.println(arr[i]);

        // }

        int[] two = arr;
        two[2] = 590;

        for(int i  = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
             swap(arr, 0,4);
             for(int i =0;  i < arr.length; i++){
                System.out.println(arr[i]);
             }
    }
}
