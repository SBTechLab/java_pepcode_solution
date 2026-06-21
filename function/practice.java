  import java.util.*;
      public class practice{

      public static void display(int n, int r, int npr){
              System.out.println(n + "P" + r + "=" + npr);

      }

        // public static int f(int x){
        //     int xsquarre = x * x;
        //     return xsquare;
        // }

        public static int fact(int x){
            int rv = 1;
            for(int i =1; i <= x; i++){
                rv = rv * i;
            }


            return rv;
        }
     public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        // int nfact =1;
        // for(int i =1; i <=n; i ++){
        //     nfact *=i;
        // }
         int nfact = fact(n);
         int nmrfact = fact(n - r);


        // int nmrfact =1;
        // for(int i =1; i <=n-r; i ++){
        //     nmrfact *=i;
        // }
        
        int npr = nfact / nmrfact;
        //System.out.println(n + "P" + r + "=" + npr);
          display(n, r, npr);
      }
}