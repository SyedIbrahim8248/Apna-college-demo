package JAVAandDSAKHAPRA;

public class _34_Concatenation {
    public static void main(String[] args) {
        String firstName = "Syed";
        String lastName = "Ibrahim";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        //charAt
        for(int i = 0;i<fullName.length();i++) {
            System.out.println(fullName.charAt(i));
        }

    }
}
