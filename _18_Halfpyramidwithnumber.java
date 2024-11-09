package JAVAandDSAKHAPRA;

import java.util.Scanner;

public class _18_Halfpyramidwithnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
