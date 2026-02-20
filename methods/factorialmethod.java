package methods;
public class factorialmethod {
    void display(){
          int n=5;
        int fact=1;
     for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("fact of 5:"+fact);  
        }
        public static void main(String[] args) {
         factorialmethod obj=new factorialmethod();
         obj.display();  
        }
    }
    
