package JAVAandDSAKHAPRA;

import java.util.Scanner;

public class _22_Butterflypatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = 5;
        //upper half
        for (int i = 1; i<=n; i++) {
            //first part
            for (int j = 1; j<=i; j++) {
                System.out.print("*");

            }
            //spaces
            int spaces = 2 * (n-i);
            for (int j = 1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lowerhalf
        for(int i = n; i>=1; i--) {
            //1st part
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-i);
            for (int j = 1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
