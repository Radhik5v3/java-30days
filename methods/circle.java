package methods;
import java.util.Scanner;
public class circle {
    void display(){
                Scanner sc=new Scanner(System.in);
        System.out.println("enter the radiius of the circle:");
        int  r=sc.nextInt();
        double pie=3.14;
        double area=r*pie;
        System.out.println("area of the circle:"+area);
        double circumference=2*r*3.14;
        System.out.println("the circumference of circle is:"+circumference);
    }
    public static void main(String[] args) {
        circle obj=new circle();
        obj.display();
    }
    
}
