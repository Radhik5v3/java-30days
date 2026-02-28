package Exceptions;

public class arrayindexoutofbounds {
    public static void main(String[] args) {
        try{
            int arr[]={10,20,30};
            System.out.println("arrays"+arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("this is not executable");
        }
    }
    
}
