import java.utill.*;
public class Main{
    public static void main(string[] args){
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int n =0; n < =high; n++){
            int count =0;
            //try to divide n and incrtease count
              for(int div =2; div * div <=n; div++){
                  if(n% div == 0){
                    count++;
                    break;
                  }
              }   
 
 
            if (count == 0){
            System.out.println(n);
            }
        }
    }
}