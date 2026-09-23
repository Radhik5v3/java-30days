public class prependnum {
    public static void main(String[] args) {
        int num1=12;
        int num2=32;
        int temp=num1;
        int mul=1;
        while(temp>0){
            int digit=temp%10;
            mul=mul*10;
            temp=temp/10;
        }
        int result=num1*mul+num2;
        System.out.println(result);
    }
}
