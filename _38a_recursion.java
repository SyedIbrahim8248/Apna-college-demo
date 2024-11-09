package JAVAandDSAKHAPRA;

public class _38a_recursion {
    public static void printNumber(int n) {
        if(n==6) {
            return;
            //Print numbers from 1 to 5
        }
        System.out.println(n);
        printNumber(n+1);
    }

    public static void main(String[] args) {
        int n=1;
        printNumber(n);
    }
}
