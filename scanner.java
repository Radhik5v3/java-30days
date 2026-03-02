import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter ur rollno");
        int rollno=sc.nextInt();
        System.out.println("enter ur name");
        String name=sc.next();
        System.out.println("enter the fees");
        double fee=sc.nextDouble();
        System.out.println("rollno"+rollno+"name"+name+"fee"+fee);
    }
    
}
