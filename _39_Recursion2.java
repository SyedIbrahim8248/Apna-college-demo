package JAVAandDSAKHAPRA;

public class _39_Recursion2 {
    public static void towerOfHonoi (int n,String src,String helper,String dest) {
       if(n ==1) {
           System.out.println("transfer disk" +n +"from " + src + " to " + dest);
           return;
       }
        towerOfHonoi(n-1,src,dest,helper);
        System.out.println("transfer disk" + n + "from " + src + " to " + dest);
        towerOfHonoi(n-1,src,dest,helper);
    }
    public static void main(String[] args) {
        int n=1;
        towerOfHonoi(n,"A","B","C");
    }
}
