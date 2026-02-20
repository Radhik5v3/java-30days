package methods;
import java.util.Scanner;
public class sumoftwonum {
    void display(){
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of A:");
        int A=sc.nextInt();
        System.out.println("enter the value of B:");
        int B=sc.nextInt();
             int result=A+B;
    System.out.println(result);  
    }
    public static void main(String[] args) {
        sumoftwonum obj=new sumoftwonum();
        obj.display();
    }
    
    
}
