import java.util.*;
public class decimaltonybase{

    public static String decimalToAnyBase(int n, int b){
        String ans = "";
        while(n > 0){
            int rem = n % b;
            ans = rem + ans;
            n = n / b;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();

        String result = decimalToAnyBase(n, b);
        System.out.println(result);
    }
}
