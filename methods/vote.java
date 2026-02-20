package methods;
import java.util.Scanner;
public class vote {
    void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        if(age>=18)
            System.out.println("eligable for vote");
        else if (age==37)
            System.out.println("he is  eligable for vote");
        else 
            System.out.println("not eligible for vote");
    }
    public static void main(String[] args) {
        vote obj=new vote();
        obj.display();
    }
    }

