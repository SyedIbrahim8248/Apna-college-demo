package JAVAandDSAKHAPRA;

public class _39f_Printallthesubsequencesofastring {
    public static void subsequences(String str,int idx,String newstring) {
        if(idx == str.length()) {
            System.out.println(newstring);
            return;
        }
        char currChar = str.charAt(idx);
        subsequences(str,idx+1,newstring+currChar);

        subsequences(str,idx+1,newstring);

    }

    public static void main(String[] args) {;
    String str = "abc";
        subsequences(str,0,"");
    }
}
