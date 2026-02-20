package methods;
import java.util.Scanner;
public class primemethod {
    void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
    int count=0;
       for(int i=1;i<num;i++){
            if(num%i==0){
               count++;
            } 
        }
        if(count==2){
            System.out.println("given number is prime");
        }
        else{
            System.out.println("given number is not a prime");
        }
        
    }
    public static void main(String[] args) {
        primemethod obj=new primemethod();
        obj.display();
    }
    
}
