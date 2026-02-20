package methods;

public class largestnumber {
    int a=6;
    int b=8;
    int c=7;
    void large(){
        if (a>b&&a<c){
            System.out.println(a);
        }
        else if(b<a&&b<c)
            System.out.println(b);
        else{
            System.out.println(c);
        }
        }
        public static void main(String[] args) {
            largestnumber obj=new largestnumber();
            obj.large();
        }
    
}
