package firstjavacode;
import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Given number is a even number");
        }
        else{
            System.out.println("Given number is a odd number");
        }
        
    }
    
}
