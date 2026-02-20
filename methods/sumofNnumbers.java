package methods;

public class sumofNnumbers {
    int display(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        sumofNnumbers obj=new sumofNnumbers();
      int result=  obj.display(10);
        System.out.println(result);
    }
    
}
