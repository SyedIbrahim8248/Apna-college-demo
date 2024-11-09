package JAVAandDSAKHAPRA;

import java.util.Scanner;

public class _36c_Updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper == 1) {
            //set
            int newnumber = bitMask | n;
            System.out.println(newnumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
