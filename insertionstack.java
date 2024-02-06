// INSERT AT BOTTOM /ANY INDEX
import java.util.*;

public class Stackbasic {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(8);
        st.push(9);
        st.push(5);
        st.push(3);
        st.push(1);
        int index = 2;
        int x = 7;
        Stack<Integer> temp = new Stack<>();
        while (st.size() > index) {
            temp.push(st.pop());
        }
        st.push(x);
        while (temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
