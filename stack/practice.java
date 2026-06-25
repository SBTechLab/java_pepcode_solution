import java.util.*;

package stack;


public class practice {
    public static void main (String[] args){
        Stack<Integer> st = new Stack<>(); // declare in integer stack


        st.push(10);
        st.push(20);
        System.err.println(st);
        st.push(30);
         System.err.println(st);
         System.out.println(st.peek() + " " + st.size());
         System.out.println(st + "->" + st.peek() + " " + st.size());
         

 


    }
    
}
