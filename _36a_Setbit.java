package JAVAandDSAKHAPRA;

public class _36a_Setbit {
    public static void main(String[] args) {
        int n = 5;
        int pos =1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}