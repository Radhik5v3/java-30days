package conditionalloops;
import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the price rate:");
        int price=sc.nextInt();
        System.out.println("enter the discount :");
        int discount=sc.nextInt();
        double dis=price*discount/100;
        System.out.println("The final price of the product is:"+dis);
      

    }
    
}
