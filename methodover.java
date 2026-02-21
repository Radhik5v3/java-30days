
public class methodover {
    int add(int a,int b){
        System.out.println(a+b);
        return a+b;

    }
    int add(int a,int b,int c){
        System.out.println(a+b+c);
        return a+b+c;
    }
public static void main(String[] args) {
    methodover m=new methodover();
m.add(10 , 20);
 m.add(10,20,30);
}
    
}

