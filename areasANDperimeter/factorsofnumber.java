package areasANDperimeter;
import java.util.Scanner;
public class factorsofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            if(num%2==0){
                System.out.println(i+"");
            }
        }
    }
    
}
