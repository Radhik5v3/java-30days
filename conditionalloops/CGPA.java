package conditionalloops;
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements:");
        int n=sc.nextInt();
        int sum=0;
        
        for(int i=0;i<=n;i++){
            System.out.println("enter number "+i+":" );
            int num=sc.nextInt();
            sum=sum+num;
        }
        double cgpa=sum/n;
        System.out.println("tne final CGPA is :"+cgpa);
    }
    
}
