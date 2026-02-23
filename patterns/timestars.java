package patterns;

public class timestars {
    public static void main(String[] args) {
    int n=5;
    int m=5;
    for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<=n-i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int a=0;a<=m;a++){
        for(int b=0;b<=n-a;b++){
        System.out.print(" ");
        }
        for(int d=0;d<=2*a-1;d++){
            System.out.print("*");
        }
        System.out.println();
    }
} 
}
