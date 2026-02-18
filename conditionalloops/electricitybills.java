package conditionalloops;
import java.util.Scanner;
public class electricitybills {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the units:");
        int unit=sc.nextInt();
        int bill;
        if(unit<=100){
            bill=unit*5;
        }
        else if(unit<=200){
            bill=(100*5)+(100*7)+(unit-100)*7;
        }
        else{
            bill=(100*5)+(100*7)+(200*10)+(unit-100)*10;
        }
        System.out.println("Electricity bill is :"+bill);
        
    }
    
}
