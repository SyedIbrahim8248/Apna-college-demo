package JAVAandDSAKHAPRA;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _28_Makeafunctiontoadd2numbersandreturnthesum {
    public static int calculation(int a,int b) {
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculation(a,b);
        System.out.println(sum);
        System.out.println("sum of 2 numbers is : "+sum);
    }
}
