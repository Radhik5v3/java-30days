package conditionalloops;

public class palindrom {
    public static void main(String[] args) {
        int num=112211;
        int temp=num;
        int rev=0;
        while(temp!=0){
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        if(temp==rev){
            System.out.println(num+"is a palindrom");
        }
        else{
            System.out.println(num+"it is not a palidrom");
        }
    }
    }
    

