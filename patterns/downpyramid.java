package patterns;
public class downpyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
           for(int h=1;h<=n-i;h++){
            System.out.print("* ");
           }
           System.out.println();
        }
    }
}
