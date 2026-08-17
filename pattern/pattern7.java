import java.util.*;

class pt {
    public void print1(int n) {

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

class pattern7 {
    public static void main(String args[]) {

        pt p = new pt();

        int t = 2;

        for (int i = 0; i < t; i++) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the value of n");
            int n = sc.nextInt();

            p.print1(n);
        }
    }
}