package methods;
import java.util.Scanner;
public class marks {
    void display(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the marks:");
    int marks=sc.nextInt();
    if(marks>=91&&marks<=100){
        System.out.println("grade A:");
    }
    else if(marks>=81&&marks<=90){
        System.out.println("grade B:");
    }
    else if(marks>=71&&marks<=80){
        System.out.println("grade C");
    }
    else if(marks>=61&&marks<=70){
        System.out.println("grade D:");
    }
    else if(marks<=40){
        System.out.println("fail");
    }
    else{
        System.out.println("not valid");
    }

}
public static void main(String[] args) {
    marks obj=new marks();
    obj.display();
}
}
