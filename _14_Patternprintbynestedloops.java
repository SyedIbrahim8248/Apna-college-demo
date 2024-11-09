package JAVAandDSAKHAPRA;

import java.util.Scanner;

public class _14_Patternprintbynestedloops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 4;
        int m = 5;
        //Solid Rectangle

        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
