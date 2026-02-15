import java.util.Scanner;
 class primitive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        double a =sc.nextDouble();
        System.out.println("enter b:");
        double b=sc.nextDouble();
        System.out.println("enter c:");
        double c=sc.nextDouble();
        double d =b*b-4*a*c;
        if(d>0){
            System.out.println("the real roots");
        }
        else if(d==0){
            System.out.println("equal roots");
        }
        else{
            System.out.println("no real roots");
        }
        sc.close();
    }

    
}
