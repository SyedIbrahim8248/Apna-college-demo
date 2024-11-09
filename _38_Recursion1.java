package JAVAandDSAKHAPRA;

public class _38_Recursion1 {
    public static void printNumber(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    // print numbers from 5 to 1
    public static void main(String[] args) {
        int n = 5;
        printNumber(n);

    }
}
