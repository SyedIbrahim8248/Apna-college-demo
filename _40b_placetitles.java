package JAVAandDSAKHAPRA;

public class _40b_placetitles {
    public static int placetiles(int n, int m) {
        if(n == m){
            return 2;
        }
        if(n < m) {
            return 1;
    }
    //vertically
    int vertPlacements = placetiles(n-m,m);
    //horizontically
    int horPlacements = placetiles(n-1,m);
        return vertPlacements+horPlacements;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(placetiles(n,m));
    }
}
