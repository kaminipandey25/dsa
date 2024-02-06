// COPY CONTENT OF ONE STACK IN OTHER IN SAME ORDER

import java.util.*;

public class Stackbasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        // reverse order
        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            gt.push(x);
            st.pop();

        }
        System.out.println(gt);
        Stack<Integer> rt = new Stack<>();
        while (gt.size() > 0) {
            int x = gt.peek();
            rt.push(x);
            gt.pop();

        }
        System.out.println(rt);
    }
}
