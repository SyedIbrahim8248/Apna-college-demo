package JAVAandDSAKHAPRA;

public class _35_Stringbuilder {
     public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("Syed");
         System.out.println(sb);
         //char at index
         System.out.println(sb.charAt(0));
         System.out.println(sb.charAt(1));
         //String reverse
         System.out.println(sb.reverse());
         //set char at index 0
         sb.setCharAt(0, 'Z');
         System.out.println(sb);
         //insert
         sb.insert(0, 'Z');
         System.out.println(sb);
         sb.insert(2,'n');
         System.out.println(sb);
     }
}
