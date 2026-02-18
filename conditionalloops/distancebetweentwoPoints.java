package conditionalloops;
import java.util.Scanner;
public class distancebetweentwoPoints {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x2 value:");
        int x2=sc.nextInt();
        System.out.println("enter the x1 value:");
         int x1=sc.nextInt();
         System.out.println("enter the y2 value :");
          int y2=sc.nextInt();
          System.out.println("enter the y1 value:");
           int y1=sc.nextInt();
           double distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
           System.out.println("the Distance between the two points is:"+distance);
    }
   
       
}
