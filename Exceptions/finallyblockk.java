package Exceptions;

public class finallyblockk {
    public static void main(String[] args) {
        try{
            int num=10/2;
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("exception is not occured");
        }
        finally{
            System.out.println("this block always executes");
        }
    }
    
}
