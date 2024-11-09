package JAVAandDSAKHAPRA;

import java.util.Scanner;

public class _29_Makeafunctiontomultiply2numbersandreturnthepriduct {
    public static int calculateproduct(int a, int b) {
        return a * b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateproduct(a, b));
    }
}
