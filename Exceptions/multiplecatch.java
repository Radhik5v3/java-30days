package Exceptions;

public class multiplecatch {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int arr[]=new int[3];
            int result=a/b;
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithematic exception is not occured");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index is out of bounds occcureds");
        }
    }
    
}
