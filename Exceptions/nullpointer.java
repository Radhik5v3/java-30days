package Exceptions;

public class nullpointer {
    public static void main(String[] args) {
        try{
        String name=null;
        System.out.println(name.length());
        }
        catch(NullPointerException e){
            System.out.println("this is not executed");
        }

    }
}
