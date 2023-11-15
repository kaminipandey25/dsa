import java.util.*;

public class Tisra {
    public static void main(String args[]) {
        System.out.println("Enter three numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;

        if (b > max) {
            max = b; // Update max to b if b is greater
        }
        if (c > max) {
            max = c; // Update max to c if c is greater
        }

        System.out.println("The maximum number is: " + max);
    }
}
