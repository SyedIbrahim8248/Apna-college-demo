package JAVAandDSAKHAPRA;

import java.util.Scanner;

public class _18_Invertedhalfpyramidrotatedby180deg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        //outer loop
        for(int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            //inner loop -> star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}