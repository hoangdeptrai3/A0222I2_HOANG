package demo;

public class text {
    public static void main(String[] args) {
        int k=0, n=20;
        for(int i=1; i<=n; i++) {
            int j=i; while(j<=n) {
                k++;
                j=j*2;
            }
        }
        System.out.println(k);
    }
}
